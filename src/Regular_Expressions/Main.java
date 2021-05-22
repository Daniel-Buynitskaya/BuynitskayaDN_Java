package Regular_Expressions;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/Daniel/Desktop/Семестр 6/Java/Expressions.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null)
            {
                regular_expressions(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    public static void regular_expressions (String string)
    {
        Matcher matcher = Pattern.compile("^(\\d+)(.)(\\d+)").matcher(string);
        int first, second, result=0;

        if (matcher.find()) {
            first = Integer.parseInt(matcher.group(1));
            second = Integer.parseInt(matcher.group(3));
            char operator = matcher.group(2).charAt(0);
            switch (operator) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                default:
            }
            System.out.println(first + matcher.group(2) + second + "=" + result);
        }
    }
}
