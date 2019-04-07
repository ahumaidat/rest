package rest.rest.Utils;

import org.springframework.stereotype.*;
import rest.rest.Models.Deployconf.Product.Literatum;
import rest.rest.Models.Deployconf.Product.Product;
import rest.rest.Models.Deployconf.Sourcejs.Sourcejs;

import javax.xml.bind.JAXB;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DeployConfUtils {

    private List<Product> products;

    public List<Product> getProducts(String account) {

        Literatum config  = JAXB.unmarshal(getConfigFile(account),Literatum.class);
        products = config.getProducts();
        return products;
    }

    private File getConfigFile(String account){
        String accountConf = String.format("deployconf.%s.xml",account);
        File configDir = new File(System.getProperty("user.home"));
        configDir = new File(configDir, ".litconfig");
        configDir = configDir.getAbsoluteFile();
        return new File(configDir+"/"+accountConf);
    }

    public List<Product> getProducts(String account, String prod, String family){
        products = getProducts(account);
        List<Product> result;
        if (prod == null) return products;
        if (family == null){
            result = products.stream().filter(p->p.getName().equals(prod)).collect(Collectors.toList());
        }
        else{
            result = products.stream().filter(p-> (p.getName().equals(prod) && p.getDeployfamily().equals(family))).collect(Collectors.toList());
        }
        return result;
    }

    public List<String> getAllProdFamily(String account) {
        List<String> result = new ArrayList<>();
        products = getProducts(account);
        products.forEach(p -> result.add(p.getName()+"-"+p.getDeployfamily()));
        return result;
    }

    public Object getFromConf(String account, String product, String family,String service){
        List<Object> result = new ArrayList<>();
        if (service == null){
            if (product == null) return getProducts(account);
            else getProducts(account,product,family);
        }
        else {
            switch (service){
                case "hostname": return getHostName(account,product,family);
                case "allhosts": return getAllHosts(account,false);
                case "allhosts-nofamily": return getAllHosts(account,true);
                case "sourcejs": return getSourcejsInstances(account);
                case "branch": return getBranch(account, product, family);
                default: return getProducts(account,product,family);
            }
        }
        return result;
    }

    public List<String> getHostName(String account, String product, String family){
        List<Product> products = getProducts(account,product,family);
        if (product == null){

        }
        if (family != null || (family == null && products.size()==1)){
            return products.get(0).getHostnames();
        }
        return null;
    }

    public HashMap<String,List<String>> getAllHosts(String account, boolean noFamily){
        if (noFamily && account.contains("cip")) return null;

        HashMap<String,List<String>> prodHostsMap = new HashMap<>();
        List<Product> products = getProducts(account);
        for (Product p : products){
//            if (noFamily && p.getHostnames().size()!=1) continue;
            String key = noFamily? p.getName() : p.getName()+"-"+p.getDeployfamily();
            if(!prodHostsMap.containsKey(key)){
                prodHostsMap.put(key,p.getHostnames());
            }else {
                prodHostsMap.get(key).addAll(p.getHostnames());
            }
        }
        return prodHostsMap;
    }

    public  List<Sourcejs> getSourcejsInstances(String account) {
        Literatum config  = JAXB.unmarshal(getConfigFile(account),Literatum.class);
        return config.getSourcejsInfo().getSourcejs();
    }

    public String getBranch(String account, String prod, String family){
        if (prod.isEmpty() || family.isEmpty()) return "Missing info";
        products = getProducts(account);
        List<Product> prods = products.stream().filter(p-> (p.getName().equals(prod) && p.getDeployfamily().equals(family))).collect(Collectors.toList());
        if (prods.size() != 1) return "Info passed is invalid";
        return prods.get(0).getSource().split("/")[2];
    }
}
