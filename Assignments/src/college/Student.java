package college;

public class Student {
	private int studentId;
	private String studentName;
	private double marks;
	
	public Student() {
		System.out.println("Details of the students.");
	}
	
	public Student(int studentId , String studentName ,double marks) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks= marks ;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public double getMarks() {
		return marks;
	}
//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
//	}
//	
//	

}
