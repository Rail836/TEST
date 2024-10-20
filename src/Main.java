import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

import static java.nio.channels.FileChannel.open;

public class Main {
    public static void main(String[] args) {
        ReadWrite rw = new ReadWrite();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число. ");
        int range = 100;
        int count = 0;
        int number = (int) (Math.random() * range);
        while (true) {
            count += 1;
            System.out.println("Угадайте число от 1 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("вы угадали!Число попыток " + count);
                if (rw.read()>count){
                    rw.writer(count);
                }
                break;
            } else if (input_number > number) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");

            }
        }
        System.out.println("Лучшая попытка " + Integer.toString(rw.read()));
    }
}
