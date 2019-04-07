package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

    @XmlAttribute
    private String type;
    @XmlElement(name = "port")
    private Port port;
    @XmlElement(name = "ssl-native-openssl")
    private boolean ssl_native_openssl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public boolean isSsl_native_openssl() {
        return ssl_native_openssl;
    }

    public void setSsl_native_openssl(boolean ssl_native_openssl) {
        this.ssl_native_openssl = ssl_native_openssl;
    }
}
