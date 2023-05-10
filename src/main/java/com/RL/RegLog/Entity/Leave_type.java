package com.RL.RegLog.Entity;

//import java.util.List;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;

@Entity
public class Leave_type {
	
	@Id
	int lvt_id;
	int casual_leave;
	int medical_leave;
	int earned_leave;
	
//	@OneToMany(targetEntity = Leave_history.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "lvt_lvh_fk", referencedColumnName = "lvt_id")
//	private List<Leave_history> leave_histories;
	
	public Leave_type() {}

public Leave_type(int lvt_id, int casual_leave, int medical_leave, int earned_leave) {
	super();
	this.lvt_id = lvt_id;
	this.casual_leave = casual_leave;
	this.medical_leave = medical_leave;
	this.earned_leave = earned_leave;
}

public int getLvt_id() {
	return lvt_id;
}

public void setLvt_id(int lvt_id) {
	this.lvt_id = lvt_id;
}

public int getCasual_leave() {
	return casual_leave;
}

public void setCasual_leave(int casual_leave) {
	this.casual_leave = casual_leave;
}

public int getMedical_leave() {
	return medical_leave;
}

public void setMedical_leave(int medical_leave) {
	this.medical_leave = medical_leave;
}

public int getEarned_leave() {
	return earned_leave;
}

public void setEarned_leave(int earned_leave) {
	this.earned_leave = earned_leave;
}

	
	
	
}
