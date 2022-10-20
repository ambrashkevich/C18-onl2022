public class Task2 {

    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            try {
                int i = Integer.parseInt(arg.trim());
                if (i > 0) {
                    count = count + 1;
                    System.out.println(count);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
    }
}


