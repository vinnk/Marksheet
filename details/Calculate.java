package details;
import java.util.*;

public class Calculate {
	public char grade(float om) {
		if(om < 50)
			return 'F';
		else if(om < 60)
			return 'D';
		else if(om < 70)
			return 'C';
		else if(om < 90)
			return 'B';
		else
			return 'A';
	}
	
	public float percentage(float om) {
		return (om/300) * 100;
	}
	
	public String result(char grade) {
		if(grade== 'F')
			return "Fail";
		else
			return "Pass";
	}
}
