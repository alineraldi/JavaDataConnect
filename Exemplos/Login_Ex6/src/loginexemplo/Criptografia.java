package loginexemplo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
    public static String getMD5(String texto) {
        try {
            // O metodo estatico getInstace é chamado com hash MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // O metodo digest() é chamado para calcular a hash da mensagem
            
            // E enfim temos o vetor da mensagem
            byte[] messageDigest = md.digest(texto.getBytes());
            
            // Convertemos o vetor de bytes em um bigInt
            BigInteger no = new BigInteger(1, messageDigest);
            
            // A mensagem em BigInt é convertida para hexadecimal
            String hashText = no.toString(16);
            while(hashText.length() < 32) {
                hashText = "0" + hashText; 
            }
            return hashText;
        }
        
        // Em caso de erro, é lançada uma exceção
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
