package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
//	    Task 1
        System.out.println("Task 1");
        byte[] arrayFirst = new byte[]{1,2,3};
        double[] arraySecond = {1.57, 7.654, 9.986};
        short[] arrayStatisticData = new short[10];
        for (int i = 0; i < 10; i++)
            arrayStatisticData[i] = (short) Math.round(Math.random() * 100 + Math.random() * 500);
//      Task 2
        System.out.println("Task 2");
        for (int i = 0; i < arrayFirst.length; i++)
            if (i!=arrayFirst.length-1) System.out.print(arrayFirst[i] + ", ");
            else System.out.println(arrayFirst[i]);
        for (int i = 0; i < arraySecond.length; i++)
            if (i!=arraySecond.length-1) System.out.print(arraySecond[i] + ", ");
            else System.out.println(arraySecond[i]);
        for (int i = 0; i < arrayStatisticData.length; i++)
            if (i!=arrayStatisticData.length-1) System.out.print(arrayStatisticData[i] + ", ");
            else System.out.println(arrayStatisticData[i]);
//      Task 3
        System.out.println("Task 3");
        for (int i = arrayFirst.length-1; i > 0 ; i--)
            System.out.print(arrayFirst[i] + ", ");
        System.out.println(arrayFirst[0]);
        for (int i = arraySecond.length-1; i > 0 ; i--)
            System.out.print(arraySecond[i] + ", ");
        System.out.println(arraySecond[0]);
        for (int i = arrayStatisticData.length-1; i > 0 ; i--)
            System.out.print(arrayStatisticData[i] + ", ");
        System.out.println(arrayStatisticData[0]);
//      Task 4
        System.out.println("Task 4");
        System.out.print(" Было: ");
        for (int i = 0; i < arrayStatisticData.length; i++) {
            if (i != arrayStatisticData.length - 1) System.out.print(arrayStatisticData[i] + ", ");
            else System.out.println(arrayStatisticData[i]);
        }
        System.out.print("Стало: ");
        for (int i = 0; i < arrayStatisticData.length; i++) {
            if (arrayStatisticData[i] % 2 != 0) arrayStatisticData[i]++;
            if (i!= arrayStatisticData.length-1) System.out.print(arrayStatisticData[i] + ", ");
            else System.out.println(arrayStatisticData[i]);
        }
    }
}
