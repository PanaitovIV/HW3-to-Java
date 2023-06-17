import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(100);
        for(int i = 0; i < 100; i++){
            list.add(i, random.nextInt(100));
        }
        System.out.println("Список из 100 произвольных целых чисел: ");
        System.out.println(list);
        System.out.println(" ");

        // Первое задание:
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list1.add(list.get(i));
            }
        }
        list.removeAll(list1);
        System.out.println("Тот же список, только без четных чисел: ");
        System.out.println(list);
        System.out.println(" ");

        // Второе задание:
        int min = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(min > list.get(i+1)){
                min = list.get(i+1);
            }
        }
        System.out.print("Минимальное значение в списке: ");
        System.out.println(min);

        // Третье задание:
        int max = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(max < list.get(i+1)){
                max = list.get(i+1);
            }
        }
        System.out.print("Максимальное значение в списке: ");
        System.out.println(max);

        // Четвертое задание:
        int tmp = 0;
        for (int i: list) {
            tmp += i;
        }
        float average = (float) tmp / list.size();
        System.out.printf("Среднее значение: %.1f %n", average);
    }
}