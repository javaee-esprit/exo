package domain;

import domain.Employee;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Developer
 *
 */
@Entity
public class Developer extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int exp;
	
	private List<Skill> skills;

	public Developer() {
	}   
	
	
	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}


	@ManyToMany
	@JoinTable(
			name = "t_developer_skill",
			joinColumns = @JoinColumn( name = "developer_fk"),
			inverseJoinColumns = @JoinColumn (name = "skill_fk"),
			uniqueConstraints = @UniqueConstraint(columnNames = {"developer_fk","skill_fk"})
			)
	public List<Skill> getSkills() {
		return skills;
	}


	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
   
}
