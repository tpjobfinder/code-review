package com.interchecks.review.service;

import com.interchecks.review.model.Job;
import com.interchecks.review.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("JobService")
public class JobService {

	private final JobRepository jobRepository;

	public Job save(Job job) {
		return jobRepository.save(job);
	}

	public Job get(Long ID) {
		return jobRepository.getById(ID);
	}
}
