package org.capgemini.repository;

import org.capgemini.model.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;

//getting the information From the JpaRepository
public interface FeedBackRepository extends JpaRepository<FeedBack,String> {

}
