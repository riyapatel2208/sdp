public class Main 
{
	public static void main(String[] args) 
	{
		XMLSoftware xmlDataSoft = new XMLSoftware();
		JSONData xmlAdapter = new XMLTOJSONDataAdapter(xmlDataSoft);
		xmlAdapter.readJSONData();
	}
}