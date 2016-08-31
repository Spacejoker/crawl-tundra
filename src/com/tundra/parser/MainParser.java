package com.tundra.parser;

import com.tundra.data.Morgue;

public class MainParser {
  
  private String[] testFiles = new String[]{
  };

  public static void main(String[] args) {
    Morgue morgue = new Morgue();
    morgue.characterName = "jens";
    morgue.xl = 27;
    System.out.println("jens: " + morgue);
  }
}
