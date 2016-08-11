package chapt7Initialization;

public class Ex2 {

    public static void main(String[] args) {
	StringInConstructor sic = new StringInConstructor("sic");
	StringInDefinition sid = new StringInDefinition();
    }

}


class StringInConstructor {
    
    public String str;
    
    public StringInConstructor(String s) {
	str = s;
    }
}

class StringInDefinition {
    
    public String str = "sid";
}

