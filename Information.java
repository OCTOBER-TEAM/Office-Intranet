import java.util.*;
import java.io.*;
 
Public class Information {

public static void main(String [] args) {
 System.ou.printLine("I have started");
   }
   
   public String logFile(String msg) {
	   System.out.printLine(LocalDate.now()+" -- "+msg+" --\n\r")
   }
   
   public File FileForUserLogs(String filename) {
	   File newFile = new File(filename);
	   return newFile;
   }
}
