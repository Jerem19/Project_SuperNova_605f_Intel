package main.java.ch.Service;

import main.java.ch.BusinessObjects.News;

import java.util.Date;
import java.util.List;

/**
 * Created by Jerem on 27/11/2015.
 */
public interface Admin {

    List<News> getNews();
    News addNews(String title, String description);

}
