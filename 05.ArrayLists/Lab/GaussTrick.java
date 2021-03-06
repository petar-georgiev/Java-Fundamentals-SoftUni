import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int i = 0;
        while (i<numbers.size()-1) {
            int currentNum = numbers.get(i);
            int lastNum = numbers.get(numbers.size()-1);
            int sum = currentNum + lastNum;
            numbers.set(i, sum);
            numbers.remove(numbers.size()-1);

            if (i == (numbers.size()-1) / 2) {
                break;
            }
            i++;
        }
        for (int number:numbers
        ) {
            System.out.print(number + " ");
        }
    }
}