public class HomeWork2_3 {

    public static void main(String[] arg) {
        String str = "Hello world!";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        String resultStr = str.substring(str.indexOf("w"), str.indexOf('!'));
        System.out.println(resultStr);
//        char[] muns = resultStr.toCharArray();
//        System.out.println(muns);
//        for (char tt : muns) {
//            System.out.println(tt);
//        }
        char[] newnums = new char[5];
        resultStr.getChars(0, 5, newnums, 0);
        System.out.println(newnums);
        System.out.println(newnums[newnums.length - 2]);
    }
}