package rest.rest.Models.Deployconf.Product;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Akka {

    @XmlAttribute(name = "join_type")
    private String join_type;
    @XmlAttribute(name = "zk_cluster_name")
    private String zk_cluster_name;

    public String getJoin_type() {
        return join_type;
    }

    public void setJoin_type(String join_type) {
        this.join_type = join_type;
    }

    public String getZk_cluster_name() {
        return zk_cluster_name;
    }

    public void setZk_cluster_name(String zk_cluster_name) {
        this.zk_cluster_name = zk_cluster_name;
    }
}
