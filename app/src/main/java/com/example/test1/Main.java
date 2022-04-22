package com.example.test1;

import java.time.Month;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int x = 3, y = 4;

      String[][] Mass = new String[x][y];

      for (int i = 0; i<Mass.length; i++) {
         for (int j = 0; j <Mass[i].length; j++)
            Mass[i][j] = console.nextLine();}

      for (int i = 0; i<Mass.length; i++) {
         for (int j = 0; j <Mass[i].length; j++){
            System.out.print(Mass[i][j] + " ");}
            System.out.println();
      }
   }
}