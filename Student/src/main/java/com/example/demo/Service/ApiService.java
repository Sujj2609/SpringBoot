package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Meeting;
import com.example.demo.Repository.MeetingRepo;
// import com.example.demo.Repository.StudentRepo;
@Service
public class ApiService {
	
	@Autowired
	MeetingRepo meetingserv;
	
	
	public List<Meeting> getMeetings() {
		List<Meeting> arr = new ArrayList<>();
		arr = (List<Meeting>) meetingserv.findAll();
		return arr;
	}
	
	public Optional<Meeting> findMeeting(int id){
		return meetingserv.findById(id);
	}

	public Meeting addData(Meeting obj) {
		return meetingserv.save(obj);
	}

	public void delData(int id) {
		meetingserv.deleteById(id);
		
	}

	public Meeting updateData(int id, Meeting obj) {
        Meeting popu=meetingserv.findById(id).get();
		
		if(Objects.nonNull(popu)&&(!Objects.isNull(obj.getDate()))) {
			popu.setDate(obj.getDate());
		}
		if(Objects.nonNull(popu)&&(!Objects.isNull(obj.getDuration()))) {
			popu.setDuration(obj.getDuration());
		}
		if(Objects.nonNull(popu)&&(!Objects.isNull(obj.getHostname()))) {
			popu.setHostname(obj.getHostname());
		}
		if(Objects.nonNull(popu)&&(!Objects.isNull(obj.getTopic()))) {
			popu.setTopic(obj.getTopic());
		}
		if(Objects.nonNull(popu)&&(!Objects.isNull(obj.getParticipants()))) {
			popu.setParticipants(obj.getParticipants());
		}
		
		meetingserv.save(popu);
		
		return popu;
	}
	public List<Meeting> sortByFieldName(String field) {
		return meetingserv.findAll(Sort.by(field).descending());
	}
	
	public Page<Meeting> productsWithPagination(int pageno, int noOfElements) {
		Pageable page = PageRequest.of(pageno, noOfElements);
		return meetingserv.findAll(page);
	}

	public Page<Meeting> productsWithPaginationWithSorting(int pageno, int noOfElements, String field) {
		Pageable page = PageRequest.of(pageno, noOfElements).withSort(Sort.by(field).ascending());
		return meetingserv.findAll(page);
	}
	

}
