package solarcartelemetry;


import java.util.Random;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileIO 
{
    private Scanner x;
    private Formatter y;
    
    public void openFile(String input) throws FileNotFoundException
    {
        try{
            x = new Scanner(new File(input));
        }
        catch(Exception e){
            System.out.println("File Not Found");
        }
    }
    
    public String readFile()
    {
            String rpm = x.next();


            //System.out.printf("%s %s %s\n", rpm, speed, pcon);
            return rpm;

    }

    public void writeFile()
    {
        try{
            y = new Formatter("Data.txt");
        }
        catch(Exception e)
        {
            System.out.println("Error Encountered.");
        }
    }
        
    public void addRecords()
    {
        Random rand = new Random();
        
        int temp = rand.nextInt(100) + 1;

        //y.format("%d, %d, %d", temp, temp, temp);
    }
    
    public String displayValues() throws InterruptedException
    {
        while (x.next() != null)
        {
            Thread.sleep(500);
            return x.next();
            //return x.next();
        }
        
        return x.next();
    }
        
    public void closeFileR()
    {
        x.close();
    }
    
    public void closeFileW()
    {
        y.close();
    }
}
    
