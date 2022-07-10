package com.Running.TrainingRecorder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainingDataServices {

    private final TrainingDataRepo trainingDataRepo;

    //TODO Create trening

    public Object addTraining(TrainingData trainingData){
        return trainingDataRepo.save(trainingData);
    }

    //TODO Get all trenings

    //TODO Edit trening

    //TODO Delete trening

    //TODO Count avg speed

}
