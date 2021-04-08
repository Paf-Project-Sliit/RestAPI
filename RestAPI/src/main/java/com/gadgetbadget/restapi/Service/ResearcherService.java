package com.gadgetbadget.restapi.Service;

import com.gadgetbadget.restapi.Entity.Researcher;
import com.gadgetbadget.restapi.repository.ResearcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearcherService {
    @Autowired
    private ResearcherRepository repository;

    public Researcher saveResearcher(Researcher researcher){
        return repository.save(researcher);
    }

    public List<Researcher> saveResearcher(List<Researcher> researchers){
        return repository.saveAll(researchers);
    }

    public List<Researcher> getResearchers(){
        return repository.findAll();
    }

    public Researcher getResearcherById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteResearcher(int id){
        repository.deleteById(id);
        return "Researcher Details removed successfully.";
    }

    public Researcher updateResearcher(Researcher researcher){
        Researcher existingResearcher= repository.findById(researcher.getId()).orElse(null);
        existingResearcher.setFirstName(researcher.getFirstName());
        existingResearcher.setLastName(researcher.getLastName());
        existingResearcher.setAddress(researcher.getAddress());
        existingResearcher.setEmail(researcher.getEmail());
        existingResearcher.setLinkedIn(researcher.getLinkedIn());
        existingResearcher.setPhoneNo(researcher.getPhoneNo());
        existingResearcher.setUniversity(researcher.getUniversity());

        return repository.save(existingResearcher);
    }
}
