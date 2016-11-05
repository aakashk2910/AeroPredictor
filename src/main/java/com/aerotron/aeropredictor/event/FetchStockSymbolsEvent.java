package com.aerotron.aeropredictor.event;

import com.aerotron.aeropredictor.model.suggestion.StockSymbol;

import java.util.ArrayList;

public class FetchStockSymbolsEvent {

    private ArrayList<StockSymbol> mList;

    public FetchStockSymbolsEvent(ArrayList<StockSymbol> list) {
        mList = list;
    }

    public ArrayList<StockSymbol> getList() {
        return mList;
    }
}

