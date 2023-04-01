import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
public class Ejecutor {
	Archivos file = new Archivos();
	Splitter split = new Splitter();
	ultimos3 tres = new ultimos3();

	
	
		public void ejecutar(int n) {
			
			
			tres.tresdigitos(n);
			try {
				file.read();
				split.Palabras(file.read());
				split.Numeros(file.read(), tres.tresdigitos(n));
				System.out.println(tres.tresdigitos(n));

				file.write(split.Palabras(file.read()),split.Numeros(file.read(), tres.tresdigitos(n)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
