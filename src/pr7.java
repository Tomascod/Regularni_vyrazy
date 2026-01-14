public class pr7 {
    public static void main(String[] args) {
        String regex = "([1-9]|1[0-9]|2[0-9]|3[01])\\.([1-9]|1[0-2])\\.\\d{4}";
        String date = "16.10.2025";

        if (date.matches(regex)) System.out.println("Správně"); else System.out.println("špatně");
    }
}
