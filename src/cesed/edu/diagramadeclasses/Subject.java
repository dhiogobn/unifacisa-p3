package cesed.edu.diagramadeclasses;

import java.util.Stack;

import lombok.Data;

@Data
public class Subject {
	private char id;
	private String name;
	private char ClassId;
	private Stack<Admin> admins = new Stack<Admin>();
	

}
