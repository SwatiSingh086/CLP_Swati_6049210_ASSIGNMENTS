package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Trainee;

//Integer here is primary key ka type
//trainee is entity type
public interface ITraineeRepo extends JpaRepository<Trainee,Integer> {
	List<Trainee> findByTraineeName(String name);

}
