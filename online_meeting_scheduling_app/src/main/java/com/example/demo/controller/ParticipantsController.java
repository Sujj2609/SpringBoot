package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Participants;
import com.example.demo.service.ParticipantsService;

@RestController
public class ParticipantsController {
	@Autowired
	
	ParticipantsService c;
	@PostMapping("addparticipants")
	public List<Participants> add1(@RequestBody List<Participants> p)
	{
		return c.savedetails2(p);
	}
	
	@GetMapping("showdetails2")
	public List<Participants> show1(){
		return c.showinfo2();
	}
	
	@GetMapping("showid2/{id}")
	public Optional<Participants> showid1(@PathVariable int id)
	{
		return c.showbyid2(id);
	}
	
	@PutMapping("update2")
	public Participants modify2(@RequestBody Participants m)
	{
		return c.changeinfo2(m);
	}
	
	@PutMapping("updatebyid2/{id}")
	public String change1(@PathVariable int id , @RequestBody Participants m) 
	{
		return c.updateinfobyid2(id,m);
	}
	
	@DeleteMapping("delete2")
	public String del1(@RequestBody Participants m)
	{
		 c.deleteinfo2(m);
		 return  "Deleted Suceessfully";
	}
	
	@DeleteMapping("del2/{id}")
	public void deletemyid1(@PathVariable int id)
	{
		c.deleteid2(id);
	}

}
