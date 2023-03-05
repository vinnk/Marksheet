package elements;
import java.util.*;
import details.Student;
import details.Format;
import details.Calculate;

public class Main {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Calculate calculate= new Calculate();
		
		Date dob= new Date(01,9,5);
		Student student= new Student("nIKita rAI", dob, "XII", 'A', "2019-2020");	
		
		System.out.println("MARKS-->");
		System.out.print("Physics : ");
		float phy= in.nextFloat();
		student.setPhysics(phy);
		
		System.out.print("\nChemistry : ");
		float chem= in.nextFloat();
		student.setChemistry(chem);
		
		System.out.print("\nMaths : ");
		float math= in.nextFloat();
		student.setMaths(math);
		
		float total= student.getChemistry() + student.getPhysics() + student.getMaths();
		student.setObtained_marks(total);
		
		float perc= calculate.percentage(student.getObtained_marks());
		student.setPercentage(perc);
		
		char grading= calculate.grade(student.getObtained_marks());
		student.setGrade(grading);
		
		String res= calculate.result(student.getGrade());
		student.setResult(res);
		
		System.out.println(student);
	}
}
