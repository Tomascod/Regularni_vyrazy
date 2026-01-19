//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class pr1 {
    public static void main(String[] args) {
        String regex = "[1-7]\\d{2} \\d{2}";
        String psc = "334 01";

        if(psc.matches(regex)){
            System.out.println("ano");
        }else System.out.println("ne");

    }
}