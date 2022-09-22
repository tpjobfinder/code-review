package com.interchecks.review.web.controller;

import com.interchecks.review.model.Job;
import com.interchecks.review.model.Person;
import com.interchecks.review.service.JobService;
import com.interchecks.review.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/job")
public class JobController {

	private final JobService jobService;
	private final PersonService personService;

	@PostMapping("{id}")
	public ResponseEntity<Job> add(@PathVariable("id") Long jobId, @RequestBody Job job) {
		return ResponseEntity.accepted().body(jobService.save(job));
	}

	@GetMapping("{id}")
	public ResponseEntity<Job> get(@PathVariable("id") Long jobId, @RequestBody Job job) {
		return ResponseEntity.accepted().body(jobService.get(jobId));
	}
}
