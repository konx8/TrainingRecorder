package com.Running.TrainingRecorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingDataRepo extends JpaRepository <TrainingData, Long>{
}
