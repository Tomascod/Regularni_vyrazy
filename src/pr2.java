public class pr2 {
    public static void main(String[] args) {
    String rodncislo = "080916/4268";
    String regex = "\\d{2}(0[1-9]|1[0,2]|5[1-9]|6[0-2])([0-9]|1[0-9]|2[0-9]|3[01])/\\d{4}";

    if (rodncislo.matches(regex)) System.out.println("správně"); else System.out.println("špatně");
    }
}
