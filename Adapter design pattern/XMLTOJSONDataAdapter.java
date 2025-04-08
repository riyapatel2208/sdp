public class XMLTOJSONDataAdapter implements JSONData 
{
	XMLData xmlData;
	XMLTOJSONDataAdapter(XMLData xmlData) 
	{
		this.xmlData = xmlData; 
	}
	@Override
	public void readJSONData() 
	{
		// TODO Auto-generated method stub
		xmlData.readXMLData();
		System.out.println("Convert here XML data to JSON Data");
	}
}
