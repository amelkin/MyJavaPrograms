package com.viksan;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.58/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
    }
}