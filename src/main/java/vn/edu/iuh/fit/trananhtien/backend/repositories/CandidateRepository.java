package vn.edu.iuh.fit.trananhtien.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.trananhtien.backend.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}