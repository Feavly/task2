import java.util.Arrays;

public class Tasks2 {
    public static void main(String[] args) {
//        1)Для первой задачи второго блока
        System.out.println("Результат первой задачи:");
        System.out.println(task11("hello",3));
//        2)Для второй задачи второго блока
        System.out.println("Результат второй задачи:");
        System.out.println(task12(new int[]{10,4,1,4,-10,-50,32,21}));
//        3)Для третьей задачи второго блока
        System.out.println("Результат третьей задачи:");
        System.out.println(task13(new int[]{9,2,2,5}));
//        4)Для Четвертой задачи второго блока
        System.out.println("Результат четвертой задачи:");
        System.out.println(task14(new int[]{3,3,-2,408,3,3}));
//        5)Для пятой задачи второго блока
        System.out.println("Результат пятой задачи:");
        System.out.println(task15("43.2"));
//        6)Для Шестой задачи второго блока
        System.out.println("Результат шестой задачи:");
        System.out.println(task16(12));
//        7)Для Седьмой задачи второго блока
        System.out.println("Результат седьмой задачи:");
        System.out.println(task17("123456"));
//        8)Для Восьмой задачи второго блока
        System.out.println("Результат восьмой задачи:");
        System.out.println(task18(" "," "));
//        9a)Для девятой задачи второго блока
        System.out.println("Результат девятой задачи:");
        System.out.println(task19isprefix("retrospect","sub-"));
//        9b)Для девятой задачи второго блока
        System.out.println("Результат девятой задачи:");
        System.out.println(task19issuffix("vocation","-logy"));
//        10)Для десятой задачи второго блока
        System.out.println("Результат десятой задачи:");
        System.out.println(task20(7));

    }

    static String task11(String a, int b) {
        String result = "";
        int Count = 0;
        int L = a.length();
        for (int i = 0; i < L; i++) {
            while (Count < b) {
                result = result + a.charAt(i);
                Count = Count + 1;
            }
            Count = 0;
        }
        return result;
    }

    static int task12(int[] array) {
        int max = array[0];
        int min = array[0];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        result = max - min;
        return result;
    }

    static boolean task13(int[] array) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            count = count + 1;
        }
        avg = sum % count;
        if (avg <= 0) {
            return true;
        } else {
            return false;
        }
    }

    static String task14(int[] array) {
        int arrayS[];
        arrayS = new int[array.length];
        int first = array[0];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
            arrayS[i] = a;
        }
        return Arrays.toString(arrayS);
    }

    static int task15(String a) {
        int point = a.indexOf(".");
        int result = a.length() - point - 1;
        return result;

    }

    static int task16(int a) {
        int fib1 = 1;
        int fib2 = 1;
        int i = 0;
        while (i < a - 2) {
            int fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
            i = i + 1;
        }
        return fib2 + fib1;
    }

    static boolean task17(String a){
        int len = a.length();
        int correct = 0;
        char array1[] = a.toCharArray();
        char digits[] = new char[] {'1','2','3','4','5','6','7','8','9','0'};
        for (int i=0; i< array1.length;i++){
            char check = array1[i];
            for (int j=0; j<digits.length;j++){
                if (check == digits[j]){
                    correct = 1;}
                else{
                    correct = 0;}
                if (correct == 1) {
                    j = digits.length + 1;
                }
            }
            if (correct ==0){
                return false;
            }
        }
        if (correct == 1 ){
            if (a.length()<=5){
                return true;}
            else {
                return false;}
        }
        else {
            return false;}
    }
    static boolean task18(String a, String b){
        char aA[] = a.toCharArray();
        char bB[] = b.toCharArray();
        if (aA[0]==bB[b.length()-1]){
            if (aA[a.length()-1]==bB[0]){
                return true;}
            else {
                return false;}
        }
        else {
            return false;
        }
    }
    static boolean task19isprefix(String a, String b){
        int Count = 0;
        char aA[] = a.toCharArray();
        char bB[] = b.toCharArray();
        for (int i=0;i< bB.length;i++) {
            if (bB[i] == aA[i]) {
                Count = Count+ 1;}
            else if (bB[i] =='-'){
                i = bB.length+1;}
        }
        if (Count==bB.length-1){
            return true;}
        else {
            return false;}
    }
    static boolean task19issuffix(String a,String b){
        int Count = 0;
        char aA[] = a.toCharArray();
        char bB[] = b.toCharArray();
        for (int i=a.length()-b.length()+1;i<a.length();i++){
            if (aA[i]==bB[i-b.length()+1]){
                Count = Count +1;}
            else {
                i = a.length()+1;}
        }
        if (Count == b.length()-1){
            return true;}
        else {
            return false;
        }
    }
    static String task20(int n){
        String result = "";
        int gek1 =1;
        int gek2 =7;
        int y = 6;
        int Count =1;
        int line = 1;
        while (gek1<n){
            gek1 = 6* Count +gek1;
            Count= Count +1;
            line = line +2;
        }
        int helpcount = Count;
        int sum = Count;
        if (gek1==n){
            while (helpcount !=0){
                result = result+ " ".repeat(helpcount)+ " o ".repeat(sum)+ "\n";
                helpcount = helpcount -1;
                sum = sum +1;
            }
            sum = sum -2;
            helpcount =2;
            while (Count!=1){
                result = result+ " ".repeat(helpcount) + " o ".repeat(sum) + "\n";
                sum = sum-1;
                Count = Count -1;
                helpcount = helpcount +1;
            }
            return result;
        }

        else {
            return "Invalid";}

    }

}

