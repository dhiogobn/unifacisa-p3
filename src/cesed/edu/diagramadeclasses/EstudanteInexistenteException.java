package cesed.edu.diagramadeclasses;

public class EstudanteInexistenteException extends Exception {
	
	public EstudanteInexistenteException() {
		super("esse estudante n esta no hashSet");
	}
}
