package cesed.edu.diagramadeclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
public class Teachers {

	private char id;
	private String name;
	private int phNo;
	private char address;
	private HashSet<Student> testes = new HashSet<Student>();
	private ArrayList<TestPaper> estudantes = new ArrayList<TestPaper>();
	private Stack<Admin> admins = new Stack<Admin>();
	
	
	
	public Teachers() {
		
	}
	public Teachers(char id) {
		this.id = id;
	}
	public Teachers(char id, int phNo, char address) {
		this.id = id;
		this.phNo = phNo;
		this.address = address;
	}

//	public void PrepareTestPaper(TestPaper teste){
//		testes.add(teste);
//	}
	
	public boolean markAttendance(TestPaper aluno){
		boolean presenca = testes.contains(aluno);
		return presenca;
	}
	public int checkPapersTest(TestPaper test) {
		int qtdTestes = 0;
		if(markAttendance(test)){
			qtdTestes++;
		}
		return qtdTestes;
	}
	public String prepareReportCards() {
		return testes.toString();
	}
	public boolean declareResult() {
		//TODO
		boolean aprovado = true;
		return aprovado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		if (id != other.id)
			return false;
		if (phNo != other.phNo)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + phNo;
		return result;
	}

}
