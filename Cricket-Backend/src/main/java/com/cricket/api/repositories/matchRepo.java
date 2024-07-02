package com.cricket.api.repositories;

import com.cricket.api.entities.match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface matchRepo extends JpaRepository<match,Integer> {

    Optional<match> findByTeamHeading(String teamHeading);
}
