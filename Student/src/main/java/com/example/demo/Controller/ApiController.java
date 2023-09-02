	package com.example.demo.Controller;
	
	import java.util.List;

import javax.swing.text.html.Option;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.example.demo.Models.Meeting;
	import com.example.demo.Service.ApiService;
	@RestController
	public class ApiController {
		@Autowired
		ApiService meetingserv;
		
		@GetMapping("/show")
		public List<Meeting> showMeetings(){
			return meetingserv.getMeetings();
		}

		@GetMapping("/show/{id}")
		public java.util.Optional<Meeting> getMeeting(@PathVariable int id){
			return meetingserv.findMeeting(id);
		}
		
		@PostMapping("/add")
		public Meeting addMeeting(@RequestBody Meeting obj){
			return meetingserv.addData(obj);
		}	
		
		@PutMapping("/update/{id}")	
		public void updateData(@PathVariable int id,@RequestBody Meeting obj) {
			meetingserv.updateData(id, obj);
		}
		
		@DeleteMapping("/del/{id}")
		public void delMeeting(@PathVariable("id") int id){
			meetingserv.delData(id);
		}
		@GetMapping("get/{page}/{no}")
		public Page<Meeting> pagination(@PathVariable("page") int page,@PathVariable("no") int no){
			return meetingserv.productsWithPagination(page, no);
		}
		
		@GetMapping("get/{page}/{no}/{strings}")
		public Page<Meeting> page(@PathVariable("page") int page, @PathVariable("no") int no, @PathVariable("strings") String strings){
			return meetingserv.productsWithPaginationWithSorting(page, no, strings);
		
		}
		
	}
