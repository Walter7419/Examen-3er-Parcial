import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Splitter {

public List<String> Palabras(String str){
		List<String> listaPalabras = new ArrayList<String>();

		String[] renglon=str.split("\n");
		String[] palabras = renglon[0].split(",");

            for(int x=1; x<3002; x++) {
            	listaPalabras.add(palabras[x]);
        }
			return listaPalabras;
            
}
public Map<String, Integer> Numeros(String str, int ID){
	
	List<Integer> listaNumeros = new ArrayList<Integer>();
    Map<String, Integer> mapa = new HashMap<>();
    Map<String, Integer> mapaSuma = new HashMap<>();


	String[] renglon=str.split("\n");
	String[] palabras = renglon[0].split(",");

	for(int x=ID;x<ID+51;x++) {
		String[] numeros=renglon[x].split(",");
		for(int y=1; y<3001;y++) {
			int num=Integer.parseInt(numeros[y]);
				mapa.put(palabras[y], num);
		}
		
		for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            if (mapaSuma.containsKey(clave)) {
                int valorAnterior = mapaSuma.get(clave);
                mapaSuma.put(clave, valorAnterior + valor);
            } else {
                mapaSuma.put(clave, valor);
            }
        }
}
	return mapaSuma;
	

}
}
