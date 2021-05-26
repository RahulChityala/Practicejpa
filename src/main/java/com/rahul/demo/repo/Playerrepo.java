package com.rahul.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.demo.model.Player;

public interface Playerrepo extends JpaRepository<Player, Integer> {

}
