package com.gadgetbadget.restapi.Controller;

import com.gadgetbadget.restapi.Entity.Researcher;
import com.gadgetbadget.restapi.Service.ResearcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResearcherController {
    @Autowired
    private ResearcherService service;

    @PostMapping("/addResearcher")
    public Researcher addResearcher(@RequestBody Researcher researcher){
        return service.saveResearcher(researcher);
    }

    @PostMapping("/addResearchers")
    public List<Researcher> addResearchers(@RequestBody List<Researcher> researchers){
        return service.saveResearcher(researchers);
    }

    @GetMapping("/researchers")
    public List<Researcher> findAllResearchers(){
        return service.getResearchers();
    }

    @GetMapping("/research/{id}")
    public Researcher findResearchById(@PathVariable int id){
        return service.getResearcherById(id);
    }

    @PostMapping("/update")
    public Researcher updateResearcher(@RequestBody Researcher researcher){
        return service.updateResearcher(researcher);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResearcher(@PathVariable int id){
        return service.deleteResearcher(id);
    }
}
