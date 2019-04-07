package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

    @XmlElement(name = "web")
    private int web;
    @XmlElement(name = "ssl")
    private int ssl;

    public int getWeb() {
        return web;
    }

    public void setWeb(int web) {
        this.web = web;
    }

    public int getSsl() {
        return ssl;
    }

    public void setSsl(int ssl) {
        this.ssl = ssl;
    }
}
