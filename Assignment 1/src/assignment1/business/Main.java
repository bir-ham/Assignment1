package assignment1.business;


public class Main {

	private static AESEncrypt aesEncrypt = new AESEncrypt();

	public static void main(String[] args) {
		String password = "mypassword";
        String passwordEnc;
        String passwordDec;
        
		try {
			passwordEnc = aesEncrypt.encrypt(password);
			passwordDec = aesEncrypt.decrypt(passwordEnc);			

	        System.out.println("Plain Text : " + password);
	        System.out.println("Encrypted Text : " + passwordEnc);
	        System.out.println("Decrypted Text : " + passwordDec);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
