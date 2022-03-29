package assignment2;
/* Name: CHOONG WEN JIAN ISAAC*/
/* Matric number: 207545      */
/* course: SSE4350      */

//This is the Model class.
// which contain student main properties including the marks

public class Student {
	private String student_name;
	private int studentID;
	private String department;
	private int math_mark;
	private int science_mark;
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getMath_mark() {
		return math_mark;
	}
	public void setMath_mark(int math_mark) {
		this.math_mark = math_mark;
	}
	
	public int getScience_mark() {
		return science_mark;
	}
	public void setScience_mark(int science_mark) {
		this.science_mark = science_mark;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
