package vn.edu.iuh.fit.trananhtien.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.trananhtien.backend.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
  }