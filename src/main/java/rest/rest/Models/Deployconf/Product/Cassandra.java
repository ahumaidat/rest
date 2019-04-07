package rest.rest.Models.Deployconf.Product;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cassandra {

    @XmlAttribute(name="cassandra_cluster_name")
    private String cassandra_cluster_name;

    public String getCassandra_cluster_name() {
        return cassandra_cluster_name;
    }

    public void setCassandra_cluster_name(String cassandra_cluster_name) {
        this.cassandra_cluster_name = cassandra_cluster_name;
    }
}
