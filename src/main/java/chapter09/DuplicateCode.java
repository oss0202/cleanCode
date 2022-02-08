package chapter09;

public class DuplicateCode {
    private static int result1 = 0;
    private static int DUPLICATE_CODE_RESULT = 0;

    public static void main(String[] args) {
        result1 += 10;
        result1 += 20;
        result1 += 30;

        addAll(10, 20, 30);

        System.out.println("result1 : " + result1);
        System.out.println("DUPLICATE_CODE_RESULT : " + DUPLICATE_CODE_RESULT);
    }

    public static void addAll(int ...args){
        for (int arg : args) {
            DUPLICATE_CODE_RESULT+=arg;
        }
    }

    public static int getResult1() {
        return result1;
    }

    public static int getDuplicateCodeResult() {
        return DUPLICATE_CODE_RESULT;
    }
}
