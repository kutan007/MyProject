

public class HelloWorld{
	
	private String _sMessege = "Hello World!!";
	
	public static void main(String args[]) {
		
		String sMessege = getMessege();
		System.out.println(sMessege);
	}
	
	public String getMessege() {
		return this._sMessege;
	}
	
} 