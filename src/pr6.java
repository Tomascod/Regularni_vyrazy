public class pr6 {
    public static void main(String[] args) {
        String regex = "[+-]?\\d{1,}[.,]\\d{1,}";
        String ds = "-2.64";


        if (ds.matches(regex)) System.out.println("splňuje"); else System.out.println("nesplňuje");
    }
}
