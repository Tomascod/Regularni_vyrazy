public class pr3 {
    public static void main(String[] args) {
        String regex = "\\d[ABCEHJKLMPSTUZ]\\d \\d{4}";
        String register = "1A2 3456";

        if (register.matches(regex)){
            System.out.println("platná");
        }else System.out.println("neplatná");
    }
}
