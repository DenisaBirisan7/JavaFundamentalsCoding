package ro.sda.fundamentals._1_methods;

/*
    Write a method that calculates score after a level in a game is completed
    The method should return that score and the method also takes 3 parameters as input:
    - score which is an int
    - levelCompleted which is an int
    - bonus which is an int

    The method calculate the score by using the following formula: score + (levelCompleted * bonus)
    The method should also print the final score to the console.
 */
public class CalculateScore {
    public static void main(String[] args) {
        calculateScore(10, 5, 3);
        System.out.println("----------------");
        int s = 29;
        int l = 26;
        int b = 28;

        calculateScore(s, l, b);
        System.out.println("----------------");

        int result = calculateScore(5,100,50);
        System.out.println("Result is " + result);
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was: " + finalScore);
        return finalScore;
    }

}