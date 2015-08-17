package com.willderivera.railbaronhelper;

/**
 * Created by Shay on 8/16/2015.
 */
public class Constants {

    // Regions
    public final String NORTHEAST = "Northeast";
    public final String SOUTHEAST = "Southeast";
    public final String PLAINS = "Plains";
    public final String NORTHCENTRAL = "NorthCentral";
    public final String SOUTHCENTRAL = "SouthCentral";
    public final String NORTHWEST = "NorthWest";
    public final String SOUTHWEST = "SouthWest";

    // NorthEast
    public final String ALBANY = "Albany";
    public final String BALTIMORE = "Baltiore";
    public final String BOSTON = "Boston";
    public final String BUFFALO = "Buffalo";
    public final String NEWYORK = "New York";
    public final String PHILIDELPHIA = "Philidelphia";
    public final String PITTSBURG = "Pittsburg";
    public final String PORTLANDME = "Portland, ME";
    public final String WASHINGTONDC = "Washington DC";

    // SouthEast
    public final String ATLANTA = "Atlanta";
    public final String CHARLESTON = "Charleston";
    public final String CHARLOTTE = "Charlotte";
    public final String CHATTANOOGA = "Chattanooga";
    public final String JACKSONVILLE = "Jacksonville";
    public final String KNOXVILLE = "Knoxville";
    public final String MIAMI = "Miami";
    public final String MOBILE = "Mobile";
    public final String NORFOLK = "Norfolk";
    public final String RICHMOND = "Richmond";
    public final String TAMPA = "Tampa";

    // NorthCentral
    public final String CHICAGO = "Chicago";
    public final String CINCINNATI = "Cincinnati";
    public final String CLEVELAND = "Cleveland";
    public final String COLUMBUS = "Columbus";
    public final String DETROIT = "Detroit";
    public final String INDIANAPOLIS = "Indianapolis";
    public final String MILWAUKEE = "Milwaukee";
    public final String STLOUIS = "St Louis";

    // SouthCentral
    public final String BIRMINGHAM = "Birmingham";
    public final String DALLAS = "Dallas";
    public final String FORTWORTH = "Fort Worth";
    public final String HOUSTON = "Houston";
    public final String LITTLEROCK = "Little Rock";
    public final String LOUISVILLE = "Louisville";
    public final String MEMPHIS = "Memphis";
    public final String NASHVILLE = "Nashville";
    public final String NEWORLENES = "New Orlenes";
    public final String SANANTONIO = "San Antonio";
    public final String SHREVEPORT = "Shreveport";

    // Plains
    public final String DENVER = "Denver";
    public final String DESMOINES = "Des Moines";
    public final String FARGO = "Fargo";
    public final String KANSASCITY = "Kansas City";
    public final String MINNEAPOLIS = "Minneapolis";
    public final String OKLAHOMACITY = "Oklahoma City";
    public final String OMAHA = "Omaha";
    public final String PUEBLO = "Pueblo";
    public final String STPAUL = "St Paul";

    // NorthWest
    public final String BILLINGS = "Billings";
    public final String BUTTE = "Butte";
    public final String CASPER = "Casper";
    public final String POCATELLO = "Pocatello";
    public final String PORTLANDOR = "Portland, OR";
    public final String RAPIDCITY = "Rapid City";
    public final String SALTLAKECITY = "Salt Lake City";
    public final String SEATTLE = "Seattle";
    public final String SPOKANE = "Spokane";

    // SouthWest
    public final String ELPASO = "El Paso";
    public final String LASVEGAS = "Las Vegas";
    public final String LOSANGELES = "Los Angeles";
    public final String OAKLAND = "Oakland";
    public final String PHOENIX = "Phoenix";
    public final String RENO = "Reno";
    public final String SACRAMENTO = "Sacramento";
    public final String SANDIEGO = "San Diego";
    public final String SANFRANCISCO = "San Francisco";
    public final String TUCUMCARI = "Tucumcari";

    public String[] NORTHEAST_CITIES = {"Albany", "Baltiore", "Boston", "Buffalo", "New York", "Philidelphia", "Pittsburg", "Portland, ME", "Washington"};
    public String[] SOUTHEAST_CITIES = {"Atlanta", "Charleston", "Charlotte", "Chattanooga", "Jacksonville", "Knoxville", "Miami", "Mobile", "Norfolk", "Richmond", "Tampa"};
    public String[] NORTHCENTRAL_CITIES = {"Chicago", "Cincinnati", "Cleveland", "Columbus", "Detroit", "Indianapolis", "Milwaukee", "St Louis"};
    public String[] SOUTHCENTRAL_CITIES = {"Birmingham", "Dallas", "Fort Worth", "Houston", "Little Rock", "Louisville", "Memphis", "Nashville", "New Orlenes", "San Antonio", "Shreveport"};
    public String[] PLAINS_CITIES = {"Denver", "Des Moines", "Fargo", "Kansas City", "Minneapolis", "Oklahoma City", "Omaha",  "Pueblo", "St Paul"};
    public String[] NORTHWEST_CITIES = {"Billings", "Butte", "Casper", "Pocatello", "Portland, OR", "Rapid City", "Salt Lake City", "Seattle", "Spokane"};
    public String[] SOUTHWEST_CITIES = {"El Paso", "Las Vegas", "Los Angeles", "Oakland", "Phoenix", "Reno", "Sacramento", "San Diego", "San Francisco", "Tucumcari"};
    public String[] ALL_CITIES = {};


    // http://www.railgamefans.com/rgf/files/usapay.pdf
    public String[][] regionSelect = {
            {PLAINS, SOUTHEAST, SOUTHEAST, SOUTHEAST, NORTHCENTRAL, NORTHCENTRAL, NORTHEAST, NORTHEAST, NORTHEAST, NORTHEAST, NORTHEAST},
            {SOUTHWEST, SOUTHCENTRAL, SOUTHCENTRAL, SOUTHCENTRAL, SOUTHWEST, SOUTHWEST, PLAINS, NORTHWEST, NORTHWEST, PLAINS, NORTHWEST}
    };

    public String[][] northeastSelect = {
            {NEWYORK, NEWYORK, NEWYORK, ALBANY, BOSTON, BUFFALO, BOSTON, PORTLANDME, NEWYORK, NEWYORK, NEWYORK},
            {NEWYORK, WASHINGTONDC, PITTSBURG, PITTSBURG, PHILIDELPHIA, WASHINGTONDC, PHILIDELPHIA, BALTIMORE, BALTIMORE, BALTIMORE, NEWYORK}
    };

    public String[][] southeastSelect = {
            {CHARLOTTE, CHARLOTTE, CHATTANOOGA, ATLANTA, ATLANTA, ATLANTA, RICHMOND, KNOXVILLE, MOBILE, KNOXVILLE, MOBILE},
            {NORFOLK, NORFOLK, NORFOLK, CHARLESTON, MIAMI, JACKSONVILLE, MIAMI, TAMPA, TAMPA, MOBILE, NORFOLK}
    };

    public String[][] northcentralSelect = {
            {CLEVELAND, CLEVELAND, CLEVELAND, CLEVELAND, DETROIT, DETROIT, INDIANAPOLIS, MILWAUKEE, MILWAUKEE, CHICAGO, MILWAUKEE},
            {CINCINNATI, CHICAGO, CINCINNATI, CINCINNATI, COLUMBUS, CHICAGO, CHICAGO, STLOUIS, STLOUIS, STLOUIS, CHICAGO}
    };

    public String[][] southcentraSelectl = {
            {MEMPHIS, MEMPHIS, MEMPHIS, LITTLEROCK, NEWORLENES, BIRMINGHAM, LOUISVILLE, NASHVILLE, NASHVILLE, LOUISVILLE, MEMPHIS},
            {SHREVEPORT, SHREVEPORT, DALLAS, NEWORLENES, DALLAS, SANANTONIO, HOUSTON, HOUSTON, FORTWORTH, FORTWORTH, FORTWORTH}
    };

    public String[][] plainsSelect = {
            {KANSASCITY, KANSASCITY, DENVER, DENVER, DENVER, KANSASCITY, KANSASCITY, KANSASCITY, PUEBLO, PUEBLO, OKLAHOMACITY},
            {OKLAHOMACITY, STPAUL, MINNEAPOLIS, STPAUL, MINNEAPOLIS, OKLAHOMACITY, DESMOINES, OMAHA, OMAHA, FARGO, FARGO}
    };

    public String[][] northwestSelect = {
            {SPOKANE, SPOKANE, SEATTLE, SEATTLE, SEATTLE, SEATTLE, RAPIDCITY, CASPER, BILLINGS, BILLINGS, SPOKANE},
            {SPOKANE, SALTLAKECITY, SALTLAKECITY, SALTLAKECITY, PORTLANDOR, PORTLANDOR, PORTLANDOR, POCATELLO, BUTTE, BUTTE, PORTLANDOR}
    };

    public String[][] southwestSelect = {
            {SANDIEGO, SANDIEGO, RENO, SANDIEGO, SACRAMENTO, LASVEGAS, PHOENIX, ELPASO, TUCUMCARI, PHOENIX, PHOENIX},
            {LOSANGELES, OAKLAND, OAKLAND, OAKLAND, LOSANGELES, LOSANGELES, LOSANGELES, SANFRANCISCO, SANFRANCISCO, SANFRANCISCO, SANFRANCISCO}
    };
}
