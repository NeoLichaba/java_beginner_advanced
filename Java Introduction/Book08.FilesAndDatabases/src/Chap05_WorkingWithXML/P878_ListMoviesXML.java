package Chap05_WorkingWithXML;


/* Program demonstrates reading the movies.xml file and lists the title, year and price of ea movie 
 *
 * @author Neo
 */

import javax.xml.parsers.*;                                                     //DocumentBuilder and DocumentBuilderFactory                                                      
import org.xml.sax.*;                                                           //InputSource
import org.w3c.dom.*;                                                           //Document
import java.text.*;

public class P878_ListMoviesXML {                                               

    private static NumberFormat cf
            = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) 
    {
        Document doc = getDocument("movies.xml");                               //getDocument method called, reads file and Document object from movies.xml file is created (DOM file)                                                                               //Element object returned respresents the root node --> navigate to other nodes
        Element root = doc.getDocumentElement();                                //once a root has been identified, getDocumentElement called, creating root Element/Node
        Element movieElement = (Element) root.getFirstChild();
        Movie m;
        while (movieElement != null) {                                          //while loop used to iterate through child elements (i.e. movie elements)
            m = getMovie(movieElement);                                         //movieElement passed into getMovie method is 
            String msg = Integer.toString(m.year);                              //getMovie element extracts year attribute
            msg += ": " + m.title;                                              //title and price elements extracted
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);                                            //movie element printed onto console    
            movieElement
                    = (Element) movieElement.getNextSibling();                  //Element casted into movieElement and getNextSibling method called to get next element
                                                                                //getNextSibling method returns a Node, not an Element hence castign required
        }   
    }

    private static Document getDocument(String name)                            //getDocument accepts a filename as a parameter, returns a Document object
    {
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();                     //
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder
                    = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e) //→49
    {
        // get the year attribute
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
        // get the Title element
        Element tElement = (Element) e.getFirstChild();
        String title = getTextValue(tElement).trim();
        // get the Price element
        Element pElement
                = (Element) tElement.getNextSibling();
        String pString = getTextValue(pElement).trim();
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Node n) //→65
    {
        return n.getFirstChild().getNodeValue();
    }

    private static class Movie //→70
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }

}
