package de.swm.springbootdemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by xie on 2016/4/20.
 */
@Entity
public class Bookmark {

    private final String uri;
    private final String description;
    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    public Bookmark(Account account, String uri, String description){
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }
}
