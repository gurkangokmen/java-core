package adapter;

import java.util.List;

//3rd-party library that works with JSON data
public class ThirdPartyAnalyticsLibrary {
    public String analyzeData(List<Stock> jsonStockData) {
        // Simplified analytics process for demonstration
        double sum = 0;
        
        for (Stock stock : jsonStockData) {
            sum += stock.getPrice();
        }
        
        double averagePrice = sum / jsonStockData.size();
        
        return "Average Price: " + averagePrice;
    }
}
