
public class ultimos3 {
public int tresdigitos(int valor) {
	String StringNum = Integer.toString(valor);
	String ultimosTresCaracteres = StringNum.substring(StringNum.length() - 3);
	int numero = Integer.parseInt(ultimosTresCaracteres);
	return numero;
}
}
