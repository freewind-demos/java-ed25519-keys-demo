package demo;

import net.i2p.crypto.eddsa.KeyPairGenerator;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
        KeyPair keyPair = new KeyPairGenerator().generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println("Private key: len(" + privateKey.getEncoded().length + ")");
        System.out.println(Arrays.toString(privateKey.getEncoded()));

        System.out.println("Public key: len(" + publicKey.getEncoded().length + ")");
        System.out.println(Arrays.toString(publicKey.getEncoded()));
    }

}
