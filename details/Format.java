package details;
import java.util.*;
import java.text.*;

public class Format{
	Locale locale= new Locale("en", "IN");
	
	public String word(String n) {
		String ans= "";
		ans+= n.substring(0,1).toUpperCase();
		ans+= n.substring(1).toLowerCase();
		return ans;
	}
	public String getFormattedName(String name) {
		String ans= "";
		String[] words= name.trim().split("\\s+");
		
		for(int i=0;i<words.length;i++) {
			ans+= word(words[i]) + " ";
		}
		return ans;
	}
	
	public String getFormattedDOB(Date dob) {
		DateFormat df= DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		return df.format(dob);
	}
}