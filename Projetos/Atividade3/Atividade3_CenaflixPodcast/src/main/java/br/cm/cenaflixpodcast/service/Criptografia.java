package br.cm.cenaflixpodcast.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
    public static String getMD5(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte[] messageDigest = md.digest(texto.getBytes());
            
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashText = no.toString(16);
            while(hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        }
        
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
