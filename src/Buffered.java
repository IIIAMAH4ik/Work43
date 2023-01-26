import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffered {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String moneyOtt = reader.readLine();

        int money = Integer.parseInt(moneyOtt);

        System.out.println("Кол-во бонусов "+ (money / 100));
        System.out.println("Сумма с учётом бонусов "+ (money + money / 100));
    }
}