package adapter;

//StockDataProvider.java - Original class providing XML data
public class StockDataProvider {
    public String getStockData() {
        return "<stocks>" +
                    "<stock>" +
                        "<symbol>AAPL</symbol>" +
                        "<price>150.25</price>" +
                    "</stock>" +
                    "<stock>" +
                        "<symbol>GOOGL</symbol>" +
                        "<price>2800.50</price>" +
                    "</stock>" +
                    "</stocks>";
    }
}