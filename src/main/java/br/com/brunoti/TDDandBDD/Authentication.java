package br.com.brunoti.TDDandBDD;

public class Authentication {
	static String userMock = "bruno@brunoti.com.br";
	static String passwordMock = "trocar#12345";

	public static Boolean login(String user, String password) {
		
		if (user == userMock && password == passwordMock) {
			System.out.println("Success login!");
			return true;
		} else {
			System.err.println("Fail login!");
			return false;
		}
	}

}