package com.aerotron.aeropredictor.event;

import com.aerotron.aeropredictor.model.StockItem;

import java.util.List;

public class FetchStockQuoteEvent {

    private List<StockItem> mStockItems;

    public FetchStockQuoteEvent(List<StockItem> stockItems) {
        mStockItems = stockItems;
    }

    public List<StockItem> getStockItems() {
        return mStockItems;
    }


}
