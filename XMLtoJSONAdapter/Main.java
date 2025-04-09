public class Main {
    public static void main(String[] args) {
        XMLData xmlSoftware = new XMLSoftware();
        JSONData adapter = new XMLToJSONDataAdapter(xmlSoftware);
        adapter.readJSONData();
    }
}