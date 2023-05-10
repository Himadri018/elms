package com.RL.RegLog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RL.RegLog.Entity.Leave_type;
import com.RL.RegLog.repository.LeavetypeRepo;
import com.RL.RegLog.service.LeavetypeService;

@Service
public class LeavetypeIMPL implements LeavetypeService {

	@Autowired
	private LeavetypeRepo leavetypeRepo;
	
	@Override
	public Leave_type createLeave(Leave_type lvt) {
		// TODO Auto-generated method stub
		return leavetypeRepo.save(lvt);
	}

	@Override
	public Leave_type lvtById(int lvt_id) {
		// TODO Auto-generated method stub
		return leavetypeRepo.findById(lvt_id).get();
	}

	@Override
	public Leave_type uplvtById(Leave_type lvt) {
		// TODO Auto-generated method stub
		return leavetypeRepo.save(lvt);
	}

	@Override
	public void delleaveById(int lvt_id) {
		// TODO Auto-generated method stub
		leavetypeRepo.deleteById(lvt_id);
		
	}

}
