package com.willderivera.railbaronhelper;

/**
 * Created by Shay on 8/16/2015.
 */
public class Player {

    private String name;
    private String homeCity;
    private String sourceCity;
    private String destCity;

    public Player(String name, String homeCity) {
        this.name = name;
        this.homeCity = homeCity;
    }

    public void newRoute(String source, String dest) {
        this.sourceCity = source;
        this.destCity = dest;
    }
    
    public String getName() {
        return this.name;
    }
}
