import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter XML Data (single line or compact):");
        String xmlInput = scanner.nextLine();
        XMLData xmlSoftware = new XMLSoftware(xmlInput);
        JSONData adapter = new XMLToJSONDataAdapter(xmlSoftware);
        adapter.readJSONData();
        scanner.close();
    }
}