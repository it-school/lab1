package opu;

import java.util.Random;

/**
 * Speranskyy Viktor, #30
 */
public class Main {
   /**
    * Дано натуральное число.
    * Если в нем есть цифры а и b, то определить, какая из них расположена в числе правее.
    * Если одна или обе эти цифры встречаются в числе несколько раз, то должны быть рассмотрены самые правые из одинаковых цифр.
    */
   private static void task279() {
      System.out.println("task279");
   }

   /**
    * Составить программу, которая ведёт учёт очков, набранных каждой командой при игре в баскетбол.
    * За попадание в корзину даётся 1, 2 или 3 очка.
    * После любого изменения счёт выводить на экран.
    * После окончания игры выдать итоговое сообщение и указать номер команды-победительницы.
    * Окончание игры условно моделировать вводом количества очков, равного нулю.
    */
   private static void task280() {
      System.out.println("task280");
      final Random random = new Random();

      int points1;
      int points2;
      int sum1 = 0;
      int sum2 = 0;

      do {
         points1 = (int) (Math.random() * 4); // random number [0..3]
         points2 = random.nextInt(4);  // random number [0..3]
         System.out.println("Team 1: " + points1 + "\tTeam 2: " + points2);
         sum1 += points1;
         sum2 += points2;
      } while (points1 != 0 || points2 != 0);

      System.out.printf("\nTeam 1: %d\tTeam 2:%d\n", sum1, sum2);

      if (sum1 > sum2) {
         System.out.println("Team 1 is winner!");
      } else {
         if (sum2 > sum1) {
            System.out.println("Team 2 is winner!");
         } else {
            System.out.println("Draw");
         }
      }
   }

   /**
    * main function
    *
    * @param args command line arguments
    */
   public static void main(String[] args) {
      task279();
      task280();
   }
}
