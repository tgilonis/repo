package abstractfactorypattern;

import abstractfactorypattern.NY.NYErrorXMLParser;
import abstractfactorypattern.NY.NYFeedbackXMLParser;
import abstractfactorypattern.NY.NYOrderXMLParser;
import abstractfactorypattern.NY.NYResponseXMLParser;

public class NYParserFactory implements AbstractParserFactory {
  @Override
  public XMLParser getParserInstance(String parserType) {
    //switch statement returns parser based on request
    switch(parserType){
      case "NYERROR":
        return new NYErrorXMLParser();
      case "NYFEEDBACK":
        return new NYFeedbackXMLParser();
      case "NYORDER":
        return new NYOrderXMLParser();
      case "NYRESPONSE":
        return new NYResponseXMLParser();
    }
    return null;
  }

}
