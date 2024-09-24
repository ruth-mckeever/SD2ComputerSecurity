package org.rmck;

public class ValidationUtil {


    public static boolean CheckUserName(String userName) {
        String usernamePattern = "[a-zA-Z0-9\\-_.]+";
        if (userName.matches(usernamePattern)) {
            return true;
        }
        return false;
    }


    public static boolean CheckIrishPhoneNumber(String phoneNumber) {
        String phonePattern = "(\\+353|0)8[35679][0-9]{7}";
        if (phoneNumber.matches(phonePattern)) {
            return true;
        }
        return false;
    }

    public static boolean CheckFullname(String fullname) {
        String namePattern = "[A-Za-z \\-']{2,100}";
        if (fullname.matches(namePattern)) {
            return true;
        }
        return false;
    }

    public static boolean CheckPassword(String password) {
        //TODO: Break this down
        String passwordPattern = "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-#$.%&*])(?=.*[a-zA-Z]).{8,20}$";
        if (password.matches(passwordPattern)) {
            return true;
        }
        return false;
    }

    public static boolean CheckAddress(String address) {
        String addressPattern = "[A-Za-z \\-',.]{7,1000}";
        if (address.matches(addressPattern)) {
            return true;
        }
        return false;
    }

    public static boolean CheckEircode(String eircode) {
        String eircodePattern = "[A-Za-z0-9]{3} [A-Za-z0-9]{4}";
        if (eircode.matches(eircodePattern)) {
            return true;
        }
        return false;
    }

    public static boolean CheckEnquiry(String enquiry) {
        // Matching any character except <> - what other characters should be excluded?
        String enquiryPattern = "[^<>]+";
        if (enquiry.matches(enquiryPattern)) {
            return true;
        }
        return false;
    }

}
