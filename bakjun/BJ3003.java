package bakjun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            bf.read();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
