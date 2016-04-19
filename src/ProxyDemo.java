
public class ProxyDemo {

	public static void main(String[] args) {
		Student student = new StudentProxy(888888, "Jarrod", "Banks");
		
		//intially, there is no student in the proxy, so a new one is created from the parameters.
		student.getInfo();
		
		//When we call it again, this time the information is saved in the proxy
		//and recalled from its private student field.
		student.getInfo();

	}

}
