package rest.rest.Models.Deployconf.Sourcejs;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "sourcejs-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class SourcejsInfo {

    @XmlElement(name = "sourcejs")
    private List<Sourcejs> sourcejs;

    public List<Sourcejs> getSourcejs() {
        return sourcejs;
    }

}
