package com.ashrafunahid;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        Encryptor en = Encryptor.getEncrypter(true);
        Decryptor de = Decryptor.getDecrypter(true);

        File src = new File("C:/Users/Ashraf Uddin/OneDrive/Desktop/Example");

//        en.encrypt(src, src);
		de.decrypt(src, src);
    }
}
