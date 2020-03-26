package cesed.edu.diagramadeclasses;

public class ProfessorInexistenteException extends Exception {
	public ProfessorInexistenteException() {
		super("o professor nao existe no HashSet");
	}

}
