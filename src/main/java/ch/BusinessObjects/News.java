package main.java.ch.BusinessObjects;

import com.google.appengine.api.datastore.Key;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Jerem on 27/11/2015.
 */

@Entity
public class News {

    @Id
    private long id;

    private Date date;
    private String Title;
    private String description;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
