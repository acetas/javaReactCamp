package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobSeekerUserService;
import hrms.hrms.entities.concretes.JobSeekerUser;

@RestController
@RequestMapping("/api/jobseekeruser")
public class JobSeekerUserController {

	private JobSeekerUserService jobSeekerUserService;

	@Autowired
	public JobSeekerUserController(JobSeekerUserService jobSeekerUserService) {
		super();
		this.jobSeekerUserService = jobSeekerUserService;
	}
	
	@GetMapping("/getall")
	public List<JobSeekerUser> getAll(){
		return this.jobSeekerUserService.getAll();
	}
	
}
