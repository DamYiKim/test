package com.codeWithProjects.fitnessTrackerServer.repository;

import com.codeWithProjects.fitnessTrackerServer.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}