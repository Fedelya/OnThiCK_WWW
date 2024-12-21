package vn.edu.iuh.fit.trananhtien.backend.ids;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CandidateSkillId implements Serializable {
    private static final long serialVersionUID = -896890373029098573L;
}