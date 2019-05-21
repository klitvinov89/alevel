public class HomeWork2_1 {
    public static void main(String[] arg) {
        int nums[] = {1,2,3,5};
        System.out.println(nums);
        System.out.println(nums[0]+";"+nums[1]+";"+nums[2]+";"+nums[3]);
        String str = "Мама мыла раму.";
        String[] words = str.split("\\s");
        String str1=  "Я хочу переносы строк.";
        System.out.println(str1.replaceAll("\\s","\n"));
    }
}