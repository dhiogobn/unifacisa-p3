package cesed.edu.diagramadeclasses;

import java.util.ArrayList;
import java.util.Stack;

import lombok.Data;

@Data
public class Classe {
	private char id;
	private String name;
	private char division;
	
	private Stack<Admin> admin = new Stack<Admin>();
	private ArrayList<Student> estudantes = new ArrayList<Student>();
	
	
	

}
