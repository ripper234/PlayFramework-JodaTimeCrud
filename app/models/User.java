package models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class User extends Model {
    public String name;

    @Type(type="org.joda.time.contrib.hibernate.PersistentLocalDate")
    public DateTime birthday;
}

