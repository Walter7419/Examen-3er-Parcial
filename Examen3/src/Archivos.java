import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Archivos {
	public static File file = new File("emails.csv");
	public static File recolector = new File("176770.txt");

	public static void write(List<String> listaPalabras, Map<String, Integer> Num) throws IOException {
		
	    FileWriter fileWriter 	= new FileWriter(recolector);
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    for(int n=0; n<3001; n++ ) {
	    	printWriter.print(listaPalabras.get(n)+ ": "+Num.get(listaPalabras.get(n))+"\n");
	    }
	    System.out.println("Listo");
	    
    	printWriter.close();
	}
	
	public static String read()  throws IOException
    { 
	    FileWriter fileWriter 	= new FileWriter(recolector);
	    PrintWriter printWriter = new PrintWriter(fileWriter);

        // Creating a path choosing file from local
        // directory by creating an object of Path class
        Path fileName = Path.of(file.getPath());
 
        // Now calling Files.readString() method to
        // read the file
        String str = Files.readString(fileName);
 
        // Printing the string
        
		return str;
    }
}
