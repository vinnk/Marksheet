package details;
import details.Format;
import java.util.*;

public class Student {
	private String school;
	private String name;
	private String standard;
	private char section;
	private String session;
	private String dob;
	
	private float physics;
	private float chemistry;
	private float maths;
	private int total_marks;
	private int passing_marks;
	private float obtained_marks;
	private float percentage;
	private char grade;
	private String result;
	
	public Student() {
		school= "ARMY PUBLIC SCHOOL";
		total_marks= 100;
		passing_marks= 50;
	}
	public Student(String name, Date dob, String standard, char section, String session) {
		this();
		Format f= new Format();
		this.name= f.getFormattedName(name);
		this.dob= f.getFormattedDOB(dob);
		this.standard= standard;
		this.section= section;
		this.session= session;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public int getPassing_marks() {
		return passing_marks;
	}
	public void setPassing_marks(int passing_marks) {
		this.passing_marks = passing_marks;
	}
	public float getObtained_marks() {
		return obtained_marks;
	}
	public void setObtained_marks(float obtained_marks) {
		this.obtained_marks = obtained_marks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "\t\t"+ school + "\n\n name=" + name + "\t\tDate Of Birth: "+ dob +"\n standard=" + standard + "\t\t section=" + section
				+ "\t\t session=" + session +"\n\n\n PHYSICS: " + physics + "\n CHEMISTRY: " + chemistry
				+ "\n MATHS: " + maths + "\n\n TOTAL MARKS: " + total_marks + "\t\t PASSING MARKS: " + passing_marks
				+ "\n OBTAINED MARKS: " + obtained_marks + "\t\t  PERCENTAGE: " + percentage + "\n GRADE: " + grade + "\t\t RESULT: "
				+ result ;
	}
	
}
