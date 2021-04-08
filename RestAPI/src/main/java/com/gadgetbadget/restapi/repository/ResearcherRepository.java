package com.gadgetbadget.restapi.repository;

import com.gadgetbadget.restapi.Entity.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResearcherRepository extends JpaRepository<Researcher, Integer> {
}
