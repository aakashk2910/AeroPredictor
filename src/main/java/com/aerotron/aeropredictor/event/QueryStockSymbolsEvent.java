package com.aerotron.aeropredictor.event;


public class QueryStockSymbolsEvent {

    private String mQuery;

    public QueryStockSymbolsEvent(String query) {
        mQuery = query;
    }

    public String getQuery() {
        return mQuery;
    }

}
