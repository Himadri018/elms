package com.RL.RegLog.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leave_history {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int lvh_id;
	String leavetype;
	String leavereason;
	String leaveappdate;
	int leaved;
	int lvt_lvh_fk;
	boolean status;
	boolean acrejflag;
	
	public Leave_history() {
		
	}

	public Leave_history(int lvh_id, String leavetype, String leavereason, String leaveappdate, int leaved,
			int lvt_lvh_fk, boolean status, boolean acrejflag) {
		super();
		this.lvh_id = lvh_id;
		this.leavetype = leavetype;
		this.leavereason = leavereason;
		this.leaveappdate = leaveappdate;
		this.leaved = leaved;
		this.lvt_lvh_fk = lvt_lvh_fk;
		this.status = status;
		this.acrejflag = acrejflag;
	}

	public int getLvh_id() {
		return lvh_id;
	}

	public void setLvh_id(int lvh_id) {
		this.lvh_id = lvh_id;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getLeavereason() {
		return leavereason;
	}

	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}

	public String getLeaveappdate() {
		return leaveappdate;
	}

	public void setLeaveappdate(String leaveappdate) {
		this.leaveappdate = leaveappdate;
	}

	public int getLeaved() {
		return leaved;
	}

	public void setLeaved(int leaved) {
		this.leaved = leaved;
	}

	public int getLvt_lvh_fk() {
		return lvt_lvh_fk;
	}

	public void setLvt_lvh_fk(int lvt_lvh_fk) {
		this.lvt_lvh_fk = lvt_lvh_fk;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isAcrejflag() {
		return acrejflag;
	}

	public void setAcrejflag(boolean acrejflag) {
		this.acrejflag = acrejflag;
	}
	
	
	
}
