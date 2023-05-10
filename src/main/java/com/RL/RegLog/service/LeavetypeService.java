package com.RL.RegLog.service;

import com.RL.RegLog.Entity.Leave_type;

public interface LeavetypeService {
	Leave_type createLeave(Leave_type lvt);
	Leave_type lvtById(int lvt_id);
	Leave_type uplvtById(Leave_type lvt);
	void delleaveById(int lvt_id);
}
