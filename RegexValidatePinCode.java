public class RegexValidatePinCode {
    public static boolean validatePin(String pin) {
        if (pin.matches("[0-9]+") && pin.length() == 4) {
        return true;
        }
        else if (pin.matches("[0-9]+") && pin.length() == 6) {
        return true;
        }
        return false;
    }
    
    }

