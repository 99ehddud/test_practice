package test;

// Big Number 1
public class TestPractice {
    public static void main(String[] args) {
        
    }
}

// // Coin Count 2
// public class TestPractice {
//     public static void main(String[] args) {
//         int i = (int)(Math.random() * 1000) * 10;
//         System.out.println(i);
//         int[] coin = {500, 100, 50, 10};
//         int count = 0;

//         for (int j = 0; j < coin.length; j++) {
//             count += i / coin[j];
//             i = i % coin[j];
//         }

//         System.out.println(count);
//     }
// }

// Coin Count 1
// public class TestPractice {
//     public static void main(String[] args) {
//         long st = System.currentTimeMillis();
        
//         int i = (int)(Math.random() * 1000) * 10;
//         System.out.println("Change : " + i);
//         int fiveHundred = 0;
//         int hundred = 0;
//         int fifty = 0;
//         int ten = 0;

//         if (i >= 500) {
//             fiveHundred = i / 500;
//         }
//         i = i % 500;

//         if (i >= 100) {
//             hundred = i / 100;
//         }
//         i = i % 100;

//         if (i >= 50) {
//             fifty = i / 50;
//         }
//         i = i % 50;

//         ten = i / 10;
//         System.out.println("500 : " + fiveHundred + ", 100 : " + hundred + ", 50 : " + fifty + ", 10 : " + ten);

//         long et = System.currentTimeMillis();
//         System.out.println(st);
//         System.out.println(et);
//         System.out.println("Time : " + (et - st));
//     }
// }