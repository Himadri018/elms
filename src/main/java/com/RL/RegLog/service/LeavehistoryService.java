package com.RL.RegLog.service;

import java.util.List;

//import org.springframework.data.domain.Sort;

import com.RL.RegLog.Entity.Leave_history;

public interface LeavehistoryService {
	Leave_history createleaveh(Leave_history lvh);
	Leave_history lvhById(int lvh_id);
	Leave_history lvhByFk(int lvt_lvh_fk);
	List<Leave_history> getAlllvh ();
	Leave_history uplhById(Leave_history lvh);
	void dellhById(int lvh_id);

}
