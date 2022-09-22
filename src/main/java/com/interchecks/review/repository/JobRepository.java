package com.interchecks.review.repository;

import com.interchecks.review.model.Job;
import com.interchecks.review.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
