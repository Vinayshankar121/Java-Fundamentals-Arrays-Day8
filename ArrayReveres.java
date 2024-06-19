import java.util.Scanner;
class ArrayReveres {
    public static void main(String[] args) {
        int[] marks = {75, 50, 73, 34, 56};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("revers order");
        for(int i=4 ; i>=0 ; i--) {
            System.out.println(marks[i]);
        }
    }
}




