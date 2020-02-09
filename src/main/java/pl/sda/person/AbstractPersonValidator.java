package pl.sda.person;

abstract class AbstractPersonValidator {

    boolean validateName(String name, int minLength, int maxLength) {
        return name != null && name.length() > minLength && name.length() < maxLength && isContainsVowelAndNotSpecial(name);
    }

    boolean isContainsVowelAndNotSpecial(String name) {
        return name.matches(".*[AEIOUaeiou].*") && !name.matches("[^a-zA-Z0-9 ]");
    }

    boolean validateRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}
