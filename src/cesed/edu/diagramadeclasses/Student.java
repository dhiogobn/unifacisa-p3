package cesed.edu.diagramadeclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import lombok.Data;

@Data
public class Student {

	private char id;
	private String name;
	private int phNo;
	private char addres;
	private Stack<Admin> admins = new Stack<Admin>();
	private HashSet<Classe> classes = new HashSet<Classe>();
	private Stack<Teachers> professores = new Stack<Teachers>();
	private ArrayList<TestPaper> testes = new ArrayList<TestPaper>();
	
	
	/*public String fillAdimitionsForm() {
		return "nome: "+this.name+" "+"\n numero de telefone: "+this.phNo+"\n Endereço: "+this.addres;
	}
	*/
	
	


}
