import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            randomList.add(randMachine.nextInt(20));
        }

        return randomList;
    }

    public Character getRandomLetter() {
        ArrayList<Character> alphabet = new ArrayList<Character>();

        for (int i = 0; i < 26; i++) {
            alphabet.add((char) ('A' + i));
        }

        Character randomLetter = alphabet.get(randMachine.nextInt(26));

        return randomLetter;
    }

    public String generatePassword() {
        String password = "";

        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }

        return password;
    }

    public ArrayList<String> getNewPasswordSet(int lenght) {
        ArrayList<String> passwordSet = new ArrayList<String>(lenght);
        String password = "";

        for (int j = 0; j < lenght; j++) {
            for (int i = 0; i < 8; i++) {
                password += getRandomLetter();
            }
            passwordSet.add(password);
            password = "";
        }

        return passwordSet;
    }
}
