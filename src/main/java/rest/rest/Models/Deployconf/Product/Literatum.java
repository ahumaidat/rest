package rest.rest.Models.Deployconf.Product;

import rest.rest.Models.Deployconf.Sourcejs.SourcejsInfo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="literatum")
@XmlAccessorType(XmlAccessType.FIELD)
public class Literatum {

    @XmlElement(name = "product")
    private List<Product> products;
    @XmlElement(name = "sourcejs-info")
    private SourcejsInfo sourcejsInfo;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<Product>();
        }
        return this.products;
    }

    public SourcejsInfo getSourcejsInfo() {
        if (sourcejsInfo == null) sourcejsInfo = new SourcejsInfo();
        return sourcejsInfo;
    }
}
