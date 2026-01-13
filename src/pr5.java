public class pr5 {
    public static void main(String[] args) {
        String name = "pan Tomáš Kodýdek";
        String regex = "(pan|paní|slečna) \\p{Lu}\\p{Ll}{1,} \\p{Lu}\\p{Ll}{1,}";

        if (name.matches(regex)) System.out.println("splňuje"); else System.out.println("nesplňuje");
    }
}
