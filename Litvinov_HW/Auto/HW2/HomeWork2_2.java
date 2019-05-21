import java.util.Arrays;

public class HomeWork2_2 {
    public static void main(String[] arg) {
        int []nums = new int[10];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 1;
        nums[6] = 1;
        nums[7] = 1;
        nums[8] = 1;
        nums[9] = 1;
        System.out.println(Arrays.toString(nums));
        double []numsd = new double[5];
        numsd[0] = 1.1;
        numsd[1] = 1.1;
        numsd[2] = 1.1;
        numsd[3] = 1.1;
        numsd[4] = 1.1;
        System.out.println(Arrays.toString(numsd));
        byte b = 1;
        int i = 1;
        long l = 1;
        int []nums1 = new int[3];
        nums1[0] = b;
        nums1[1] = i;
        //nums1[2] = l;
        System.out.println(Arrays.toString(nums1));
        int[][] nums2d = {{1,2,3,5},{1,2,3,5}};
        System.out.println(Arrays.toString(nums2d));


    }
}
