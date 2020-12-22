public class LastDigitChecker {

    public static boolean hasSameLastDigit(int valueOne, int valueTwo, int valueThree) {

        if((valueOne >= 10 && valueOne <= 1000) && (valueTwo >= 10 && valueTwo <= 1000) && (valueThree >= 10 && valueThree <= 1000)) {

            int lastOne = valueOne % 10;
            int lastTwo = valueTwo % 10;
            int lastThree = valueThree % 10;

            if((lastOne == lastTwo) || (lastOne == lastThree) || (lastOne == lastThree) || (lastTwo == lastThree)) {
                return true;
            } else return false;
        } else return false;
    }

    public static boolean isValid(int digit) {

        if(digit >= 10 && digit <= 1000) {
            return true;
        } else return false;
    }
}

    