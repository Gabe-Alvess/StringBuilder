package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        // lange notatie
        StringBuilder str = new StringBuilder();
        str.append("Hello World");
        System.out.println("Lange notatie: " + str);

        // korte notatie
        StringBuilder str2 = new StringBuilder("Hello World");
        System.out.println("Korte notatie: " + str2);

        // insert
        StringBuilder names = new StringBuilder("Walter, Mike");
        names.insert(6, ", Edwin");
        System.out.println(names);

        // tostring
        // string txt = "";
        String txt = names.toString();

        // reverse
        System.out.println(names.reverse());

        // delete
        StringBuilder sb = new StringBuilder("Hello world");
        sb.delete(5, 6);
        System.out.println("De string is nu: " + sb);
    }
}
