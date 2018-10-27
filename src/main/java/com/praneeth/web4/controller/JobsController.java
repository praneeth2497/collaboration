package com.praneeth.web4.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth.web4.dao.JobsDao;
import com.praneeth.web4.model.Blog;
import com.praneeth.web4.model.Jobs;

@RestController
public class JobsController {
	@Autowired
	JobsDao jobsdao;
	 @PostMapping("/jobdetails")
     public ResponseEntity<Jobs> jobDetails(@RequestBody Jobs jobs)
 {
     System.out.println("Control at Jobs Controller ");
     String random_id = UUID.randomUUID().toString();
     jobs.setJobId(random_id);
    
     jobsdao.save_jobDetails(jobs);
     return new ResponseEntity<Jobs>(jobs,HttpStatus.OK);
}
}
