package br.com.brunoti.TDDandBDD;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AuthenticationTest {
	String user = "bruno@brunoti.com.br";
	String password = "trocar#12345";

	@Test
	public void ExpectedLoginAndPassword() throws Exception {

		Boolean result = Authentication.login(user, password);

		assertEquals(true, result);
	}

}