public class Main {
    public static void main(String[] args) {
        
        JSONData jsonData = new JSONSoftware(); // Only works with JSON
        jsonData.readJSONData();

        XMLSoftware xmlData = new XMLSoftware();
        xmlData.readXMLData();

        
    }
}
