package chapter03;

public class ArgsTest {

    private static String returnString = "";
    public static void main(String[] args) {
        String argsTest = ArgsTest.concatString("가나다","라마바","사아자");
        argsTest = null;
        System.out.println(argsTest);
    }
    public static String concatString(String ...args){
        for (int i = 0; i < args.length; i++) {
            returnString += args[i];
        }
        assert false : "args is null";
        return returnString;
    }
}
