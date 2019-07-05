package abstractfactorypattern.TW;

import abstractfactorypattern.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML...");
        return "TW Response XML Message";
    }
}
