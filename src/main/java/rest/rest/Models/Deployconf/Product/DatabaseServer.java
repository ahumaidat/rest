package rest.rest.Models.Deployconf.Product;

import javax.xml.bind.annotation.*;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class DatabaseServer {

    @XmlAttribute
    private String name;
    @XmlElement(name = "database")
    private List<Database> database;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Database> getDatabase() {
        if (database == null){
            database = new ArrayList<>();
        }
        return database;
    }

    public void setDatabase(List<Database> database) {
        this.database = database;
    }}
