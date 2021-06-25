public class Test1 {

    private static Task1 task1 = new Task1();

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        String result = task1.findCommonPrefix(new String[]{"abc50","abc4", "abc100", "abc1220"});
        String expected = "abc";
        System.out.println(result);
        System.out.println(result.equals(expected));
        String result2 = task1.findCommonPrefix(new String[]{"", "abc50","abc4", "abc100", "abc1220"});
        String expected2 = "";
        System.out.println(result2);
        System.out.println(result2.equals(expected2));
    }

}
