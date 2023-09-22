package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        scan.close();

        int dx = x2 - x1;
        int dy = y2 - y1;

        double length = Math.sqrt(dx * dx + dy * dy);

        String s = String.format("%.6f", length);
        System.out.println(s);

    }
}