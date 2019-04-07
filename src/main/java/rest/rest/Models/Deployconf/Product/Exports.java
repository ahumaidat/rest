package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Exports {
    @XmlElement(name = "export")
    private List<Export> exports;

    public List<Export> getExports() {
        if (exports == null)
            exports = new ArrayList<>();
        return exports;
    }

    public void setExports(List<Export> exports) {
        this.exports = exports;
    }
}
