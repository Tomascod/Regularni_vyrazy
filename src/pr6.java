public class pr6 {
    public static void main(String[] args) {
        String regex = "[+-]?\\d{1,}[.,]\\d{1,}";
        double number = 125.68;
        String numberString = Double.toString(number);

        if (numberString.matches(regex)) System.out.println("splňuje"); else System.out.println("nesplňuje");
    }
}
