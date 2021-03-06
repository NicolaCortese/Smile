package com.example.Smile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmileController {

  @Autowired
  SmileRepository smileRepository;

  @GetMapping("/api/smile")
  public Smile createAndGetSmiles(){
    Smile newSmile = new Smile(true,false);
    return smileRepository.save(newSmile);
    
  }

  
}
