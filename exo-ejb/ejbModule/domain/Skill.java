package domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Skill
 *
 */
@Entity
@Table(name="t_skill")

public class Skill implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	private List<Developer> developers;

	public Skill() {
	}   
	
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany( mappedBy = "skills" )
	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
   
}
