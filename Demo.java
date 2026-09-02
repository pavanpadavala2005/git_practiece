public class Demo {
    public static void main(String[] args) {

    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
        System.out.println();
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int increment(int val) {
        return val + 1;
    }
}
