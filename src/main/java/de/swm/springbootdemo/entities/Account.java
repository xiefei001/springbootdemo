package de.swm.springbootdemo.entities;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by xie.fei on 20.04.2016.
 */
@Entity
public class Account {

    private Set<Bookmark> bookmarks = new HashSet<Bookmark>();

}
