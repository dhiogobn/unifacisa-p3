package cesed.edu.diagramadeclasses;

import java.util.Stack;

import lombok.Data;

@Data
public class TestPaper {
	private char id;
	private String name;
	private float duration;
	private char classId;
	private Stack<Teachers> professores = new Stack<Teachers>();
	private Stack<Student> estudantes = new Stack<Student>();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestPaper other = (TestPaper) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	

}
