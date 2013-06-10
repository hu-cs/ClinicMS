package models;

import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class Operation {
	@Id
    @GeneratedValue
	public long id;
	
}
