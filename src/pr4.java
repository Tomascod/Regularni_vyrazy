public class pr4 {
    public static void main(String[] args) {
        String regex = "\\p{Lu}\\p{Ll}{2,}";
        String name = "Tomáš";

        if (name.matches(regex)) System.out.println("platí");else System.out.println("neplatí");
    }
}
