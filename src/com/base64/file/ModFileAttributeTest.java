package com.base64.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;

public class ModFileAttributeTest {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Administrator\\Desktop\\test2.pdf");
        try {
            BasicFileAttributes attrs =Files.readAttributes(path, PosixFileAttributes.class);
            System.out.println(attrs);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
