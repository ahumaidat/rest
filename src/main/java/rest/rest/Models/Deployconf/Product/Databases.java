package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class Databases {

    @XmlElement(name = "database-server")
    private DatabaseServer databaseServer;

    public DatabaseServer getDatabaseServer() {
        return databaseServer;
    }

    public void setDatabaseServer(DatabaseServer databaseServer) {
        this.databaseServer = databaseServer;
    }
}
