package com.RL.RegLog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.RL.RegLog.Entity.Leave_history;
import com.RL.RegLog.repository.LeavehistoryRepo;
import com.RL.RegLog.service.LeavehistoryService;

@Service
public class LeavehistoryIMPL implements LeavehistoryService{

	@Autowired
	private LeavehistoryRepo leavehistoryRepo;
	
	@Override
	public Leave_history createleaveh(Leave_history lvh) {
		// TODO Auto-generated method stub
		return leavehistoryRepo.save(lvh);
	}

	@Override
	public Leave_history lvhById(int lvh_id) {
		// TODO Auto-generated method stub
		return leavehistoryRepo.findById(lvh_id).get();
	}

	@Override
	public Leave_history uplhById(Leave_history lvh) {
		// TODO Auto-generated method stub
		return leavehistoryRepo.save(lvh);
	}

	@Override
	public void dellhById(int lvh_id) {
		// TODO Auto-generated method stub
		leavehistoryRepo.deleteById(lvh_id);
	}

	@Override
	public Leave_history lvhByFk(int lvt_lvh_fk) {
		// TODO Auto-generated method stub
		return leavehistoryRepo.findById(lvt_lvh_fk).get();
	}

	@Override
	public List<Leave_history> getAlllvh() {
		// TODO Auto-generated method stub
		return leavehistoryRepo.findAll();
	}

	

}
