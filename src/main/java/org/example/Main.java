package org.example;

import org.example.CustomWebApplication;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplication(8080). start();
    }

}