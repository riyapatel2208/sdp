public class XMLSoftware implements XMLData {
    private String xml;
    public XMLSoftware(String xml) {
        this.xml = xml;
    }
    @Override
    public String readXMLData() {
        return xml;
    }
}