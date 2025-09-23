package org.rmck;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileAccess {
    private static String securePassword = "V3#6tgw&90PG";
    private static int timeout = 0;
    private static int totalAttempts = 0;
    public static void main(String[] args) {

        FileAccess fileAccess = new FileAccess();
        boolean authenticated = fileAccess.requestPassword();
        if (authenticated) {
            System.out.println("Should be printing contents of the file here...");
        }
    }

    public boolean requestPassword() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your password");
        String passwordInput = keyboard.nextLine();
        if(passwordInput.equals(this.securePassword)) {
            totalAttempts = 0;
            timeout = 0;
            return true;
        }
        else{
            totalAttempts++;
            System.out.println("Incorrect password. Total attempts: " + totalAttempts );
            if (totalAttempts == 3) {
                timeout = 30;
                System.out.println("Too many attempts. Please try again later. Timeout set to: " + timeout);
                callTimeout();
            }
            else if (totalAttempts % 3 == 0) {
                timeout = timeout * 2;
                System.out.println("Too many attempts. Please try again later. Timeout set to: " + timeout);
                callTimeout();
            }

            requestPassword();  //Recursion...
        }
        return false;
    }
    private void callTimeout() {
        //This is a simple way of introducing a delay - there are may other options, including Thread.sleep()
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            System.out.println("Timeout interrupted.");
        }
    }
}
