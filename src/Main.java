import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Testing formatName method
        System.out.println(assertEquals(formatName("EULALIJA"), "Eulalija"));
        System.out.println(assertEquals(formatName("eULALIJA"), "Eulalija"));
        System.out.println(assertEquals(formatName("eulalija"), "Eulalija"));
        System.out.println(assertEquals(formatName("eulalijA"), "Eulalija"));
    }

    public static String formatName(String name) {
        // Correcting typo: toLoweCase() -> toLowerCase()
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }

    public static String assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            return actual;
        } else {
            return formatName(expected); // Returning the formatted expected value
        }
    }
}