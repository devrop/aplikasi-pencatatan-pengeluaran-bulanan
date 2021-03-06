package com.eintrusty.utility;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.google.gson.Gson;

public class StringUtility{
	private final static String key ="qwvbhKhtYhnfrtJk";
	//private final SecretKey secretKey =  new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	private static final Base64.Encoder encoder = Base64.getUrlEncoder();;
	private static final Base64.Decoder decoder = Base64.getUrlDecoder();


	public static String encrypt(String plainText) {
	    try {
	    	SecretKey secretKey =  new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	        // Get byte array which has to be encrypted.
	        byte[] plainTextByte = plainText.getBytes(); 
	        		//toByteArray(plainText);

	        // Encrypt the bytes using the secret key
	        Cipher cipher = Cipher.getInstance("AES");
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	        byte[] encryptedByte = cipher.doFinal(plainTextByte);

	        // Use Base64 encoder to encode the byte array
	        // into Base 64 representation. Requires Java 8.
	        System.out.println("Ok");
	        return encoder.encodeToString(encryptedByte);
            //System.out.println("Ok");
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	        //logger.error("Failed to encrypt", e);
	    	  return null;
	    }

	  
	}
	
	public static String decrypt(String encrypted) {
        try {
            // Decode Base 64 String into bytes array.
        	SecretKey secretKey =  new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            byte[] encryptedByte = decoder.decode(encrypted);

            //Do the decryption
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedByte = cipher.doFinal(encryptedByte);

            // Get hexadecimal string from the byte array.
            return new String(decryptedByte);
            //return toHexString(decryptedByte);

        } catch (Exception e) {
            //logger.error("Failed to decrypt {}", encrypted, e);
        	 return null;
        }
       
    }
	
	private static byte[] toByteArray(String s) {
	    return DatatypeConverter.parseHexBinary(s);
	}

	private static String toHexString(byte[] array) {
	    return DatatypeConverter.printHexBinary(array).toLowerCase();
	}
	
	public static String DataListToStringEncrypted(Object object){
		try{
		  Gson gson = new Gson();
		 String jsonData = gson.toJson(object);
		 
		 return encrypt(jsonData.toString());
		}catch(Exception e){
			return null;
		}
	}
	//public static <T> List<T> StringToList(String s, Class<T> classOfT){
		//System.out.println(s);
		//Gson gson  = new Gson();
		//JSONObject json = new JSONObject();
		//json.get(s);
		//System.out.println("ok" + E);
		//Object objectData = gson.
		//TypeToken type = new TypeVariableToken(symbol, bounds)
		///ObjectMapper objectMapper = new ObjectMapper().copy();
        //List<E> list = objectMapper.readValue(s, classOfT);
		//List<T> newList = gson.fromJson(s, new TypeToken<List<T>>(){}.getType());
		//gson.fromJson(s,UserDto.class);
		//return list;
	//}
	//}

}
	
	

