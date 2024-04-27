package com.example.demo.TrainingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.TrainingRepository.TrainingRepository;
import com.example.demo.TrainingCenter.TrainingCenter;
import java.util.stream.Collectors;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class TrainingController {

    @Autowired
    private TrainingRepository trainingCenterService;

    @PostMapping("/recive")
    public TrainingCenter createTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        try {
            return trainingCenterService.save(trainingCenter);
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            e.printStackTrace();
            throw new RuntimeException("Failed to create training center. Please try again later.");
        }
    }

    @GetMapping
    public List<TrainingCenter> getAllTrainingCenters() {
        try {
            return trainingCenterService.findAll();
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            e.printStackTrace();
            throw new RuntimeException("Failed to fetch training centers. Please try again later.");
        }
    }
    @GetMapping("/Code")
    public List<String> getAllTrainingCentersCode() {
        try {
            List<String> centerCodes = trainingCenterService.findAll()
                    .stream()
                    .map(TrainingCenter::getCenterCode)
                    .collect(Collectors.toList());
            return centerCodes;
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            e.printStackTrace();
            throw new RuntimeException("Failed to fetch training center codes. Please try again later.");
        }
    }
}

