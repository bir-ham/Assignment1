package assignment1.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class AESEncryptTest {

	AESEncrypt aesEncrypt = new AESEncrypt();
	
	@Test
	public void testEncryption() {
		try {
			String actulal = aesEncrypt.encrypt("mypassword");
			String expected = "2t3jcv4Q9ze5CqJrLUnmIQ==";
			
			assertEquals(actulal, expected);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDecryption() {
		try {
			String actulal = aesEncrypt.decrypt("2t3jcv4Q9ze5CqJrLUnmIQ==");
			String expected = "mypassword";
			
			assertEquals(actulal, expected);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
