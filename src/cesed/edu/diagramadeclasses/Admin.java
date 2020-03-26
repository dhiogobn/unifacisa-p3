package cesed.edu.diagramadeclasses;

import java.util.HashSet;

import lombok.Data;

@Data
public class Admin {
		
		private char id;
		private String name;
		private String password;
		private HashSet<Teachers> professores = new HashSet<Teachers>();
		private HashSet<Student> estudantes = new HashSet<Student>();
		private HashSet<Subject> sujeitos = new HashSet<Subject>();
		private HashSet<Division> divisoes = new HashSet<Division>();
		private HashSet<Classe> classes = new HashSet<Classe>();
		public void logIn(){
			//TODO
		}
		public void logOut() {
			//TODO
		}
		public void addNewTeachers(Teachers newTeacher) {
			professores.add(newTeacher);
			
		}
		public void modifyTeachers(Teachers professor) throws ProfessorInexistenteException{
			if (professores.contains(professor)){
				// verifica se contem o prof no hashSet e remove ele
				professores.remove(professor);
				// adiciando outro prof no fim do hashSet
				addNewTeachers(professor = new Teachers());	
			}else {
				throw new ProfessorInexistenteException();
			}
		}
		public void addNewStudent(Student estudante){
			estudantes.add(estudante);
		}
		public void modifyStudent(Student newStudent) throws EstudanteInexistenteException{
			if(estudantes.contains(newStudent)) {
				estudantes.remove(newStudent);
				estudantes.add(newStudent = new Student());
			}
		}
		public void addNewSubject(Subject sujeito){
			sujeitos.add(sujeito);
		}
		public void modifySubject(Subject sujeito) {
			if(sujeitos.contains(sujeito)){
				sujeitos.remove(sujeito);
				sujeitos.add(sujeito = new Subject());
			}
		}
		public void  addNewDivision(Division divisao) {
			divisoes.add(divisao);
			
		}
		public void modifyDivision(Division divisao){
			if(divisoes.contains(divisao)) {
				divisoes.remove(divisao);
				addNewDivision(divisao = new Division());
			}
		}
		
		public void addNewClass(Classe classe) {
			classes.add(classe);
		}
		public void modifyClass(Classe classe) {
			if(classes.contains(classe)) {
				classes.remove(classe);
				addNewClass(classe = new Classe());
			}
		}
		

}
