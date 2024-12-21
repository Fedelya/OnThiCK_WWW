package vn.edu.iuh.fit.trananhtien.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.trananhtien.backend.models.Candidate;
import vn.edu.iuh.fit.trananhtien.backend.repositories.CandidateRepository;

import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping("/candidate")
    public List<Candidate> candidate(Model model){
        return candidateRepository.findAll();
    }
}
