/**
 * 
 */
package tdd;

/**
 * @author Eric Hagar & Derek Kedrowski
 *
 */
public class EncryptedMessage {
  

	private String mEncryptedMessage;
	/**
	 * 
	 */
	public EncryptedMessage(String message, String key) {
		// TODO Auto-generated constructor stub
		
	
		if(validate(message, true) && validate(key, false)) {
			encryptMessage(message, key);
		}
		else {
			mEncryptedMessage = null;
		}
		
	}
	
	public EncryptedMessage(String encryptedMessage) {
		// TODO Auto-generated constructor stub
		mEncryptedMessage = encryptedMessage;
	}
	
	public String getMessage() {
		return mEncryptedMessage;
	}
	
	public String decryptMessage(String key) {
		return "";
	}
	
	private Boolean validate(String data, Boolean allowSpaces) {
		
		//boolean valid = true;
		int charHexValue;
		
		data = data.toLowerCase();
    System.out.println(data);
		
		for(int i = 0; i < data.length(); i++) {
			charHexValue = (int)data.charAt(i);
			if(!((charHexValue >= 97 && charHexValue <= 122) || (charHexValue == 32 && allowSpaces))) {
				System.out.println(charHexValue + " , " + data.charAt(i));
				return false;
			}
		}
		
		return true;
	}

	private void encryptMessage(String message, String key) {
		
//		if(validate(message, true) && validate(key, false)) {
			
			String modifiedMessage = message;
			int charHexValue;
			modifiedMessage.toLowerCase();
			
			for(int i = 0; i < modifiedMessage.length(); ++i) {
				
				charHexValue = (int)modifiedMessage.charAt(i);
				
				if(charHexValue == 32) {
					modifiedMessage = modifiedMessage.substring(0, i) + "{" + modifiedMessage.substring(i + 1);
				}
				
				
			}
			
			int j = 0;
			
			for(int i = 0; i < modifiedMessage.length(); i++) {
	
				char newChar = (char)((((modifiedMessage.charAt(i) - 'a') + (key.charAt(j)-'a')) % 27) + 'a');
				
				modifiedMessage = modifiedMessage.substring(0, i) + newChar + modifiedMessage.substring(i + 1);
				j++;
				if(j == key.length()) {
					j = 0;
				}
			}
			mEncryptedMessage = modifiedMessage;
//		}
//		else {
//			mEncryptedMessage = null;
//		}
	}
}
