package rest.rest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rest.rest.Utils.DeployConfUtils;
import rest.rest.Utils.Utils;

@RestController
public class DeployConfController {

    @Autowired
    DeployConfUtils utils;

    @RequestMapping("/")
    public String index(){
        return "usage:<br />"+
                "/accounts<br />"+
                "/services <br />"+
                "/conf/{account} <br />"+
                "/conf/{account}?prod={prod}<br />"+
                "/conf/{account}?prod={prod}&family={family}<br />"+
                "/conf/{account}?prod={prod}&family={family}"
                ;
    }

    @RequestMapping("api/conf/{account}")
    public Object getProduct(@PathVariable String account, @RequestParam(value = "prod", required = false) String prod, @RequestParam(value = "family", required = false) String family, @RequestParam(value = "service", required = false) String service){
        Object result = utils.getFromConf(account, prod, family, service);
        return  result==null? "Some info is missing. Please make sure that all parameters are filled" : result;
    }

    @RequestMapping("api/accounts")
    public String[] getAccounts (){
        String[] accounts = {"literatum","readonly","midtierbeta","staging","lts","migration","atypon"};
        return accounts;
    }

    @RequestMapping("api/services")
    public String[] getServices(){
        return new String[]{"solr","redis","zookeeper","kafka","consumer","pugrenderer","cassandra","elk","mysql","rest_atm","mongodb","xse","tools"};
    }
}
