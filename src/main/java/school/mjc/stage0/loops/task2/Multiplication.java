package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0)
            System.out.print("");
        else {
            int counter = 0, absoluteValue = Math.abs(multiplyByAndToInclusive);
            while (counter <= absoluteValue) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
