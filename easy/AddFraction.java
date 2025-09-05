import java.util.ArrayList;
import java.util.List;

public class AddFraction {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static List<Integer> addFraction(List<Integer> a, List<Integer> b) {
        List<Integer> answer = new ArrayList<>();

        int denominator = gcd(a.get(1), b.get(1));

        denominator = (a.get(1) * b.get(1)) / denominator;

        int numerator = (a.get(0) * (denominator / a.get(1))) + (b.get(0) * (denominator / b.get(1)));
        
        int commonFactor = gcd(numerator, denominator);

        denominator = denominator / commonFactor;
        numerator = numerator / commonFactor;
        answer.add(numerator);
        answer.add(denominator);

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(15);
        List<Integer> ans = addFraction(a, b); 
        System.out.println(ans.get(0) + ", " + ans.get(1));
    }
}
