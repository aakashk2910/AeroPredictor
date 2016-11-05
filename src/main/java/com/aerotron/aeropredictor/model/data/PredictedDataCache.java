package com.aerotron.aeropredictor.model.data;

import com.aerotron.aeropredictor.model.StockItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aakash Kamble on 22-10-2016.
 */

public class PredictedDataCache {

    public static final String STOCK_OBJECT = "stock";
    private static PredictedDataCache sPredictedDataCache;
    private static List<StockItem> sStockItems;

    private PredictedDataCache() {  }

    public static PredictedDataCache getPredictedDataCache() {
        if(sPredictedDataCache == null) {
            sPredictedDataCache = new PredictedDataCache();
            sStockItems = new ArrayList<>();
        }
        return sPredictedDataCache;
    }


    public List<StockItem> getStocks() {
        return sStockItems;
    }

    public void setStocks(List<StockItem> stockItems) {
        sStockItems.clear();
        sStockItems.addAll(stockItems);
    }

    public StockItem getStock(String symbol) {
        if(symbol != null) {
            for (StockItem stockItem : sStockItems) {
                if(stockItem.getSymbol().equals(symbol)) {
                    return stockItem;
                }
            }
        }
        return null;
    }
}
