package Huawei;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/19.
 */
public class SpecialDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int weeks = sc.nextInt();
            Calendar calendar = Calendar.getInstance();
            int count = 0;
            for(int i = 0;i<year;i++){
                for(int j = 0;j < 12;j++){
                    calendar.set(1900+i,j,13);
                    if(calendar.get(Calendar.DAY_OF_WEEK)-1 == weeks){
                        count++;
                    }
                }

            }
            System.out.println(count);
        }




    }
}
