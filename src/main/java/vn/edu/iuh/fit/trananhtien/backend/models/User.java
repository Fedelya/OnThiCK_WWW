package vn.edu.iuh.fit.trananhtien.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ColumnDefault("''")
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @ColumnDefault("''")
    @Column(name = "password", nullable = false, length = 50)
    private String password;

}