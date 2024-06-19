public class ArrayTest {
    public static void main(String[] args) {
        //array declaration
        int[] ids;
        //creating object (array reference)
        ids = new int[5];
        System.out.println(ids[4]);
        //assign values to array
        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        ids[4] = 555;

        //shortcut array
        int[] marks = {75, 50, 73, 34, 56};
        System.out.println(marks.length);
        //accesing array elements
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
        //accsing for each (ids)
        for (int id : ids) {
            System.out.println(id);
        }
        //adding marks
        for (int index = 0; index < marks.length; index++) {
            marks[index] += 5;
        }
        for (int mark : marks) {
            System.out.println(mark);
        }
        /* can't use for-each
        for(int mark : marks){
            marks[mark] -=5;
        }
        for(int mark : marks){
            System.out.println(mark);
            */

    }


}


