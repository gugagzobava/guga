import acm.program.ConsoleProgram;

public class frontCoding_try_2 extends ConsoleProgram {
    public void run() {
        String a = "million";
        String b = "millenia";
        String result = frontCoding(a, b);
        println(result);
    }

    private String frontCoding(String a, String b) {
        String result = "";
        int count = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            char currentA = a.charAt(i);
            char currentB = b.charAt(i);

            if (currentA == currentB) {
                result += currentA;
                count++;
            } else {
                break;
            }
        }

        String remainingA = a.substring(count);
        String remainingB = b.substring(count);

        return count + result + "*" + remainingA + remainingA.length() + remainingB + remainingB.length();
    }
}