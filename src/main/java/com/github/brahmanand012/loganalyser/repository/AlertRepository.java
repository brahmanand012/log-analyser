package com.github.brahmanand012.loganalyser.repository;

import com.github.brahmanand012.loganalyser.model.persistence.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
