package com.example.demo.TrainingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.TrainingCenter.TrainingCenter;
public interface TrainingRepository extends JpaRepository<TrainingCenter, Long> {
}
