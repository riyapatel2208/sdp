import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONDataAdapter implements JSONData {
    private XMLData xmlData;

    public XMLToJSONDataAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void readJSONData() {
        String xml = xmlData.readXMLData();
        System.out.println("Original XML Data:");
        System.out.println(xml);

        try {
            JSONObject json = XML.toJSONObject(xml);
            System.out.println("\nConverted JSON Data:");
            System.out.println(json.toString(4));
        } catch (Exception e) {
            System.out.println("Conversion Error: " + e.getMessage());
        }
    }
}
