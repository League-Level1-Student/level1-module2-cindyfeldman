import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman == true) {
			if (isKnighted == true) {

			} else {
				return "Hello Ms. " +name;
			}
		} else {
			
			if (isKnighted == true) {
return "Hello Sir" + name;
			}
			else {
				return "Hello Mr. "+ name;
			}
		}

		return "";
	}
}
