// Вывести все простые числа от 1 до 1000 

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] arg) {
        
        List<Integer> num = new ArrayList<>();
     
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                num.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000: \n" + num);
}
}