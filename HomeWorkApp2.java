package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        boolean checkS = checkSum(5, 5);
        System.out.println(checkS);
        checkSign(-1);
        boolean checkN = checkNegative(-1);
        System.out.println(checkN);
        checkString();
        boolean checkYears = years(104);
        System.out.println(checkYears);
    }


    private static boolean checkSum(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    private static void checkSign(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное!");
        } else {
            System.out.println("Число " + a + " отрицательное!");
        }
    }

    private static boolean checkNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    private static void checkString() {
        String txt = "Строка с текстом";
        int a = 2;
        int b = 1;

        for (int i = 0; i < a; i++) {
            System.out.println(txt + " #" + b++);
        }
    }

    public static boolean years(int a) {
        if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}
