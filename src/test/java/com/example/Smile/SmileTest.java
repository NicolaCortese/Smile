package com.example.Smile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmileTest {

  @Test
  void testConstructs() {
    Smile smile = new Smile(true, false);
    assertEquals(true, smile.getIsCrying());
    assertEquals(false, smile.getIsLaughing());
    assertEquals(null, smile.getId());
    

  }
  
}
