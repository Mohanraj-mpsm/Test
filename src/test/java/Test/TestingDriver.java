package Test;

public class TestingDriver extends KeyWords {
	
	public static void main(String[] args) {
		try
		{
		launch("www.facebook.com");
		maximize();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
