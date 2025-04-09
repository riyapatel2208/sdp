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
        System.out.println("\nOriginal XML Data:");
        System.out.println(xml);
        try {
            JSONObject jsonObject = XML.toJSONObject(xml);
            System.out.println("\nConverted JSON Data:");
         System.out.println(jsonObject.toString(4));
        } catch (Exception e) {
            System.out.println("Error converting XML to JSON: " + e.getMessage());
        }
    }
}