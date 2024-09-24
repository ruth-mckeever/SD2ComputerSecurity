package org.rmck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean validUsername = false;
        while (!validUsername) {
            String input = getInput("Please enter a username with letters, _, -");
            if (ValidationUtil.CheckUserName(input)) {
                validUsername = true;
                System.out.println("Username is valid");
            }
        }

        boolean validPhonenumber = false;
        while (!validPhonenumber) {
            String phoneNumber = getInput("Please enter an Irish phone number");
            if (ValidationUtil.CheckIrishPhoneNumber(phoneNumber)) {
                validPhonenumber = true;
                System.out.println("Phone number is valid");
            }
        }

        boolean validFullname = false;
        while(!validFullname) {
            String fullname = getInput("Please enter your full name.");
            if (ValidationUtil.CheckFullname(fullname)) {
                validFullname = true;
                System.out.println("Name is valid");
            }
        }

        boolean validPassword = false;
        while(!validPassword)
        {
            String password = getInput("Please enter a password.");
            if (ValidationUtil.CheckPassword(password)) {
                validPassword = true;
                System.out.println("Password is valid");
            }
        }

        boolean validAddress = false;
        while (!validAddress) {
            String address = getInput("Please enter your address");
            if (ValidationUtil.CheckAddress(address)) {
                validAddress = true;
                System.out.println("Address is valid");
            }
        }

        boolean validEircode = false;
        while (!validEircode) {
            String eircode = getInput("Enter your eircode.");
            if (ValidationUtil.CheckEircode(eircode)) {
                validEircode = true;
                System.out.println("Eircode is Valid");
            }
        }

        boolean validEnquiry = false;
        while (!validEnquiry) {

            String enquiry = getInput("Enter your enquiry.");
            if (ValidationUtil.CheckEnquiry(enquiry)) {
                validEnquiry = true;
                System.out.println("Valid enquiry");
            }
        }

        //TODO: Finish these...
        boolean validBlogEntry = false;
        boolean validComment = false;


        //Week 2 Exercises
        //while (true) {    //Will loop forever...
            //question1a();
            //question1();      //letters only
            //question2();      //binary number
            //question3();      //Saturday or Sunday
            //question4();      //DkIT student number
            //question5();      //Irish mobile number
            //question6();      //mathematical expression
            //question7();      //valid password
            //question8();      //valid email
        //}
    }

    //Replaced by question1, getInput and displayOutput methods
    public static void question1a() {
        System.out.println("Please enter a string with letters only");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        String textPattern = "[a-zA-Z]+";
        if (input.matches(textPattern)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid - text should not contain numbers or special characters");
        }
    }



    //1.	A string that only contains lowercase and uppercase letters
    //      (i.e., no numbers or special characters.)
    public static void question1() {
        String input = getInput("Please enter a string with letters only");
        String textPattern = "[a-zA-Z]+";
        displayResult(input, textPattern, "text should not contain numbers or special characters");
    }
    //2.	A binary number (i.e., only contains 1’s and 0’s)
    public static void question2() {
        String input = getInput("Please enter a binary number");
        String binaryPattern = "[01]+";
        displayResult(input, binaryPattern, "input should only contain 1's and 0's");
    }
    public static String getInput(String instructions) {
        System.out.println(instructions);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    public static void displayResult(String input, String pattern, String errorMessage){
        if (input.matches(pattern)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid - " + errorMessage);
        }
    }
    //3.	A string that is either Saturday or Sunday.
    public static void question3(){
        String input = getInput("Please enter Saturday or Sunday");
        String weekendPattern = "[Ss](atur|un)day";  //Updated to allow upper or lower case s
        displayResult(input, weekendPattern, "input should be exactly 'Saturday' or 'Sunday'");
    }

    //4.	A valid DkIT student number (i.e., a ‘D’ followed by two zeros and 6 more numbers)
    public static void question4() {
        String input = getInput("Please enter a valid DkIT student number");
        String studentPattern = "D00[0-9]{6}";
        displayResult(input, studentPattern, "student number should be a ‘D’ followed by two zeros and 6 more numbers");
    }

    //5.	A valid Irish mobile number (i.e., starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers.)
    public static void question5() {
        String input = getInput("Please enter a valid Irish mobile number");
        String mobilePattern = "08[35679][0-9]{7}";
        displayResult(input, mobilePattern, "an irish mobile number starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers");
    }

    //6.	A valid mathematical expression – can contain numbers, decimal points, operators, brackets, etc. How would you make sure brackets are used appropriately?
    public static void question6() {
        String input = getInput("Please enter a valid mathematical expression");
        //TODO: add brackets and spaces
        String mathsPattern = "[0-9]*[\\.]?[0-9]+[\\+\\-\\*\\/]{1}[0-9]*[\\.]?[0-9]+";
        displayResult(input, mathsPattern, "a valid mathematical expression – can contain numbers, decimal points, operators, brackets, etc");
    }

    //7.	A valid password – decide for yourself what conventions make a suitable password and list your requirements.
    public static void question7() {
        //Requirements: letters numbers and special characters, 8-20 characters long
        String input = getInput("Please enter a valid password");
        String passwordPattern = "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-\\#\\$\\.\\%\\&\\*])(?=.*[a-zA-Z]).{8,20}$";
        displayResult(input, passwordPattern, "a");
    }

    //8.	A valid email address – what makes up a valid email address?
    public static void question8() {
        //TODO: Test this further
        String input = getInput("Please enter a valid email address");
        String emailPattern = "[a-zA-Z0-9\\.\\-\\_\\+]{1,30}(@)[a-zA-Z0-9]{1,20}(\\.)[a-zA-Z]{2,3}((\\.)[a-zA-Z]{2,3})?";
        displayResult(input, emailPattern, "Enter a valid email address");
    }

}