public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] twoD = {{11, 22, 33, 44}, {55, 66, 77, 88}};

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < 4.; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] oneD : twoD) {
            for (int value : oneD) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
