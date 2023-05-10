package com.RL.RegLog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RL.RegLog.Entity.Leave_history;
import com.RL.RegLog.service.LeavehistoryService;

@RestController
@CrossOrigin
@RequestMapping("api/emp/leave_history")
public class LeavehistoryController {
	
	@Autowired
	private LeavehistoryService leavehistoryService;
	
	@PostMapping(path = "/save")
	public Leave_history createlvh(@RequestBody Leave_history lvh)
	{
		return this.leavehistoryService.createleaveh(lvh);
	}
	
	
	@PostMapping(path = "/lvhById/{lvh_id}")
	public Leave_history lvhById(@PathVariable int lvh_id)
	{
		return this.leavehistoryService.lvhById(lvh_id);
	}
	
	@PostMapping(path = "/lvhByFk/{lvt_lvh_fk}")
	public Leave_history lvhByFk(@PathVariable int lvt_lvh_fk)
	{
		return this.leavehistoryService.lvhByFk(lvt_lvh_fk);
	}
	
	@PutMapping(path = "/update")
	public Leave_history uplhbyId(@RequestBody Leave_history lvh)
	{
		return this.leavehistoryService.uplhById(lvh);
	}
	
	@DeleteMapping(path = "/delete/{lvh_id}")
	public void dellhById(@PathVariable int lvh_id)
	{
		leavehistoryService.dellhById(lvh_id);
	}
	
	@PostMapping(path = "/alllvh")
	public List<Leave_history> getAlllvh()
	{
		return this.leavehistoryService.getAlllvh();
	}
	
}
