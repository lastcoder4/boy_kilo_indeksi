import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner girdi =new Scanner(System.in);
        System.out.println("lutfen boyunuzu metre cinsinden giriniz: ");
        boy = girdi.nextDouble();
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz: ");
        kilo = girdi.nextDouble();
        indeks= kilo / (boy *boy);
        System.out.println("boy kilo indeksiniz = " + indeks);
    }
}