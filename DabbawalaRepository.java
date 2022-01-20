package org.capgemini.repository;



import org.capgemini.model.Dabbawala;
import org.springframework.data.jpa.repository.JpaRepository;

//getting the information from the JpaRepository
public interface DabbawalaRepository extends JpaRepository<Dabbawala,String> {


}
