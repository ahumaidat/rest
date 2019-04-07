package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)

public class Product {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String deployfamily;
    @XmlAttribute
    private String owner;
    @XmlAttribute
    private boolean enabled;
    @XmlAttribute
    private String expiryDate;
    @XmlAttribute
    private boolean multiFamily;
    @XmlAttribute
    private String cloneSource;
    @XmlAttribute
    private String description;

    @XmlElement(name = "testtype")
    private String testtype;
    @XmlElement(name = "rebuildable")
    private boolean rebuildable;
    @XmlElement(name="redeployable")
    private boolean redeployable;
    @XmlElement(name = "restartable")
    private boolean restartable;
    @XmlElement(name = "sslpass")
    private String sslpass;
    @XmlElement(name = "publisher-home-path")
    private String publisherHomePath;
    @XmlElement(name="hostname")
    private List<String> hostNames;
    @XmlElement(name = "emails")
    private Emails emails;
    @XmlElement(name = "source")
    private String source;
    @XmlElement(name = "machine")
    private List<Machine> machines;
    @XmlElement(name = "exports")
    private Exports exports;
    @XmlElement(name = "server")
    private Server server;
    @XmlElement(name = "databases")
    private Databases databases;
    @XmlElement(name = "elk")
    private Elk elk;
    @XmlElement(name = "akka")
    private Akka akka;
    @XmlElement(name = "solr")
    private Solr solr;
    @XmlElement(name = "consumer")
    private Consumer consumer;
    @XmlElement(name = "cassandra")
    private Cassandra cassandra;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeployfamily() {
        return deployfamily;
    }

    public void setDeployfamily(String deployfamily) {
        this.deployfamily = deployfamily;
    }

    @Override
    public String toString(){
        return name+" "+deployfamily;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isMultiFamily() {
        return multiFamily;
    }

    public void setMultiFamily(boolean multiFamily) {
        this.multiFamily = multiFamily;
    }

    public String getCloneSource() {
        return cloneSource;
    }

    public void setCloneSource(String cloneSource) {
        this.cloneSource = cloneSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "hostname")
    public List<String> getHostnames() {
        if (hostNames == null){
            hostNames = new ArrayList<String>();
        }
        return hostNames;
    }

    public void setHostnames(List<String> hostnames) {
        this.hostNames = hostnames;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Machine> getMachines() {
        if (machines == null){
            machines = new ArrayList<>();
        }
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public String getSslpass() {
        return sslpass;
    }

    public void setSslpass(String sslpass) {
        this.sslpass = sslpass;
    }

    public Exports getExports() {
        return exports;
    }

    public void setExports(Exports exports) {
        this.exports = exports;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public Databases getDatabases() {
        return databases;
    }

    public void setDatabases(Databases databases) {
        this.databases = databases;
    }

    public Elk getElk() {
        return elk;
    }

    public void setElk(Elk elk) {
        this.elk = elk;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public boolean isRebuildable() {
        return rebuildable;
    }

    public void setRebuildable(boolean rebuildable) {
        this.rebuildable = rebuildable;
    }

    public boolean isRedeployable() {
        return redeployable;
    }

    public void setRedeployable(boolean redeployable) {
        this.redeployable = redeployable;
    }

    public boolean isRestartable() {
        return restartable;
    }

    public void setRestartable(boolean restartable) {
        this.restartable = restartable;
    }

    public Emails getEmails() {
        return emails;
    }

    public void setEmails(Emails emails) {
        this.emails = emails;
    }

    public Akka getAkka() {
        return akka;
    }

    public void setAkka(Akka akka) {
        this.akka = akka;
    }

    public Solr getSolr() {
        return solr;
    }

    public void setSolr(Solr solr) {
        this.solr = solr;
    }

    public Cassandra getCassandra() {
        return cassandra;
    }

    public void setCassandra(Cassandra cassandra) {
        this.cassandra = cassandra;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public String getPublisherHomePath() {
        return publisherHomePath;
    }

    public void setPublisherHomePath(String publisherHomePath) {
        this.publisherHomePath = publisherHomePath;
    }
}
