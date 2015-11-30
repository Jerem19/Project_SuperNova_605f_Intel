package main.java.ch.Service;

import main.java.ch.BusinessObjects.News;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.google.appengine.api.datastore.*;
import javax.ejb.Stateful;

/**
 * Created by Jerem on 27/11/2015.
 */

@ManagedBean
@SessionScoped
public class AdminBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String title ;
    private String description ;

    private transient DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    private transient Entity newsEntity = new Entity("News");






    public String getAllNews() throws EntityNotFoundException {
        Key cleNews = KeyFactory.createKey("News", "Jeremie");
        Entity newsTrouve = datastore.get(cleNews);
        String titleNews = (String) newsTrouve.getProperty("title");

        return titleNews;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void addNews()
    {
        // Assigne des propriétés à l'entité
        newsEntity.setProperty("date", Calendar.getInstance().getTime().toString());
        newsEntity.setProperty("title", title);
        newsEntity.setProperty("description", description);

        // Enregistre l'entité dans le Datastore
        datastore.put(newsEntity);
    }


}
