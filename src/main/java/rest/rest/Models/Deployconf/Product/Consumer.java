package rest.rest.Models.Deployconf.Product;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Consumer {

    @XmlAttribute(name = "kakfa_cluster_name")
    private String kakfa_cluster_name;
    @XmlAttribute(name = "redis_cluster_name")
    private String redis_cluster_name;

    @XmlElement(name = "consumer-server")
    private List<ConsumerServer> consumerServers;

    public String getKafka_cluster_name() {
        return kakfa_cluster_name;
    }

    public void setKafka_cluster_name(String kafka_cluster_name) {
        this.kakfa_cluster_name = kafka_cluster_name;
    }

    public String getRedis_cluster_name() {
        return redis_cluster_name;
    }

    public void setRedis_cluster_name(String redis_cluster_name) {
        this.redis_cluster_name = redis_cluster_name;
    }

    public List<ConsumerServer> getConsumerServers() {
        return consumerServers;
    }

    public void setConsumerServers(List<ConsumerServer> consumerServers) {
        this.consumerServers = consumerServers;
    }
}
