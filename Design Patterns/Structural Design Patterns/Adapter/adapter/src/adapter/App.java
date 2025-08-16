package adapter;

import java.util.List;

//App using the Adapter to integrate the 3rd-party analytics library
public class App {

	public static void main(String[] args) throws Exception {
        StockDataProvider stockDataProvider = new StockDataProvider();
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(stockDataProvider);

        List<Stock> jsonStockData = xmlToJsonAdapter.getJsonStockData();

        ThirdPartyAnalyticsLibrary analyticsLibrary = new ThirdPartyAnalyticsLibrary();
        String analyticsResult = analyticsLibrary.analyzeData(jsonStockData);

        System.out.println("Stock data in JSON format: ");
        for (Stock stock : jsonStockData) {
            System.out.println(stock);
        }
        System.out.println("Analytics result: " + analyticsResult);
    }
	
	

}
