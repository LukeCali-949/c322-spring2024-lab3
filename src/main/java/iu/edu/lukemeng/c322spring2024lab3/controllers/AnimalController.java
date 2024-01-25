package iu.edu.lukemeng.c322spring2024lab3.controllers;

import iu.edu.lukemeng.c322spring2024lab3.model.AnimalData;
import iu.edu.lukemeng.c322spring2024lab3.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    @PostMapping
    public boolean add(@RequestBody AnimalData data){
        try{
            return animalRepository.add(data);
        } catch(IOException e){
            return false;
        }
    }
    @GetMapping
    public List<AnimalData> findAll(){
        try{
            return animalRepository.findAll();
        }catch(IOException e){
            return null;
        }
    }


}
