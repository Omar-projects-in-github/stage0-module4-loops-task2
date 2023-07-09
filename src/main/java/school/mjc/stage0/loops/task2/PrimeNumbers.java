package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0 || printToInclusive == 1)
            System.out.print("");
        else {
            int counter  = 2;
            while (counter <= printToInclusive) {
                int checker = 2;
                if (checker == 2 && counter == 2)
                    System.out.println(2);
                while (counter > checker) {
                    if (counter % checker == 0)
                        break;
                    if (checker == counter - 1)
                        System.out.println(counter);
                    checker++;
                }
                counter++;
            }
        }
    }
}
