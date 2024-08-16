// Author: Reem Ezzat

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
               
     // I created txt file named input.txt with some content inside
     
        //read
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            
            }
           reader.close();

        } catch (IOException e) {
            Logger.getLogger(SW_Development_Fundamentals.class.getName()).log(Level.SEVERE, null, e);
        }
        //write
   try {
      FileWriter Writer = new FileWriter("input.txt");
      Writer.write(" This is the text file after being modified by reem ezzat");
      Writer.close();
      System.out.println("Successfully wrote to the file.\n");
    } catch (IOException e) {
      System.out.println("ERROR.");
     Logger.getLogger(SW_Development_Fundamentals.class.getName()).log(Level.SEVERE, null, e);
    }
   // read after modify
    try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            
            }
                        reader.close();

        } catch (IOException e) {
            Logger.getLogger(SW_Development_Fundamentals.class.getName()).log(Level.SEVERE, null, e);
        }
       
} }

