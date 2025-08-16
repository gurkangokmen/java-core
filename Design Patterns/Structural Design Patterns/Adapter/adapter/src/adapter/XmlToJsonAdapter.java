package adapter;

import java.util.List;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

// Adapter to convert XML data to JSON format
public class XmlToJsonAdapter {
    private StockDataProvider stockDataProvider;
    
    public XmlToJsonAdapter(StockDataProvider stockDataProvider) {
        this.stockDataProvider = stockDataProvider;
    }
    
    public List<Stock> getJsonStockData() throws Exception {
        List<Stock> jsonStockData = new ArrayList<>();
        
        String xmlData = stockDataProvider.getStockData();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new org.xml.sax.InputSource(new java.io.StringReader(xmlData)));
        
        NodeList stockNodes = doc.getElementsByTagName("stock");
        for (int i = 0; i < stockNodes.getLength(); i++) {
            Element stockElement = (Element) stockNodes.item(i);
            String symbol = stockElement.getElementsByTagName("symbol").item(0).getTextContent();
            double price = Double.parseDouble(stockElement.getElementsByTagName("price").item(0).getTextContent());
            jsonStockData.add(new Stock(symbol, price));
        }
        
        return jsonStockData;
    }
}
