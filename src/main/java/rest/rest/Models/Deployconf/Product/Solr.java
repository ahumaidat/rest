package rest.rest.Models.Deployconf.Product;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Solr {

    @XmlAttribute(name="zk_cluster_name")
    private String zk_cluster_name;
    @XmlAttribute
    private boolean metaproxy;
    @XmlAttribute(name = "heap_size")
    private String heap_size;
    @XmlAttribute(name = "solr_profile")
    private String solr_profile;

    @XmlElement(name = "solr-server")
    private List<SolrServer> solrServers;

    public String getZk_cluster_name() {
        return zk_cluster_name;
    }

    public void setZk_cluster_name(String zk_cluster_name) {
        this.zk_cluster_name = zk_cluster_name;
    }

    public boolean isMetaproxy() {
        return metaproxy;
    }

    public void setMetaproxy(boolean metaproxy) {
        this.metaproxy = metaproxy;
    }

    public String getHeap_size() {
        return heap_size;
    }

    public void setHeap_size(String heap_size) {
        this.heap_size = heap_size;
    }

    public String getSolr_profile() {
        return solr_profile;
    }

    public void setSolr_profile(String solr_profile) {
        this.solr_profile = solr_profile;
    }

    public List<SolrServer> getSolrServers() {
        return solrServers;
    }

    public void setSolrServers(List<SolrServer> solrServers) {
        this.solrServers = solrServers;
    }
}
