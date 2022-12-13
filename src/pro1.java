import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your date of birth in dd mm yyyy format");
        int dd = Integer.parseInt(reader.readLine());
        int mm = Integer.parseInt(reader.readLine());
        int yy = Integer.parseInt(reader.readLine());

        int[] limits = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(yy%4 == 0){
            limits [1] = 29;
        }

        if(dd >= limits[mm-1] || mm >= 12)
            System.out.println("Invalid date");
        else
            System.out.println("Valid date");
    }
}
