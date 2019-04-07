package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Elk {
    @XmlAttribute(name = "elk_cluster_name")
    private String elk_cluster_name;

    public String getElk_cluster_name() {
        return elk_cluster_name;
    }

    public void setElk_cluster_name(String elk_cluster_name) {
        this.elk_cluster_name = elk_cluster_name;
    }
}
