package lab5;

import java.lang.reflect.TypeVariable;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class lab5_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day;
        long hr,minute,seconds;
        System.out.print("Enter second:");
        long input_secoud = sc.nextInt();

        day = (int) TimeUnit.SECONDS.toDays(input_secoud);
        hr = TimeUnit.SECONDS.toHours(input_secoud) - (day * 24);
        minute = TimeUnit.SECONDS.toMinutes(input_secoud) - (TimeUnit.SECONDS.toHours(input_secoud) * 60);
        seconds = TimeUnit.SECONDS.toSeconds(input_secoud) - (TimeUnit.SECONDS.toMinutes(input_secoud) * 60);

        System.out.println("Day: "+day);
        System.out.println("Day: "+hr);
        System.out.println("hr: "+minute);
        System.out.println("minute: "+seconds);




    }
}
