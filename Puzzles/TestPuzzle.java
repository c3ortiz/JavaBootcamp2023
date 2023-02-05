import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        System.out.println(appTest.getTenRolls());
        System.out.println(appTest.getRandomLetter());
        System.out.println(appTest.generatePassword());
        System.out.println(appTest.getNewPasswordSet(8));

        ArrayList<String> initialArray = new ArrayList<String>();
        initialArray = appTest.getNewPasswordSet(7);
        System.out.println(initialArray);
        System.out.println(appTest.shuffleArray(initialArray));
    }
}
