package rest.rest.Models.Deployconf.Product;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConsumerServer {

    @XmlAttribute
    private String host;
    @XmlAttribute
    private int id;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
