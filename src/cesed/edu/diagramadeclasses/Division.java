package cesed.edu.diagramadeclasses;

import java.util.Stack;

import lombok.Data;

@Data
public class Division {
	private char id;
	private String name;
	private Stack<Admin> admins = new Stack<Admin>();
	
	public String displayDivision(){
		//TODO
		return "";
	}

}
