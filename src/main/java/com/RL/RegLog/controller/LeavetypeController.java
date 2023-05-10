package com.RL.RegLog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RL.RegLog.Entity.Leave_type;
import com.RL.RegLog.service.LeavetypeService;

@RestController
@CrossOrigin
@RequestMapping("api/emp/leave_type")
public class LeavetypeController {
	
	@Autowired
	private LeavetypeService leavetypeService;
	
	@PostMapping("/save")
	public Leave_type createlvt(@RequestBody Leave_type lvt)
	{
		return this.leavetypeService.createLeave(lvt);
	}
	
	@PostMapping(path = "/lvtById/{lvt_id}")
	public Leave_type lvtById(@PathVariable int lvt_id)
	{
		return this.leavetypeService.lvtById(lvt_id);
	}
	
	@PutMapping(path = "/update")
	public Leave_type uplvById(@RequestBody Leave_type lvt)
	{
		return this.leavetypeService.uplvtById(lvt);
	}
	
	@DeleteMapping(path = "/delete/{lvt_id}")
	public void delById(@PathVariable int lvt_id)
	{
		leavetypeService.delleaveById(lvt_id);
	}

}
