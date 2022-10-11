package Chap05_WorkingWithXML;


/* Program demonstrates reading the movies.xml file and lists the title, year and price of ea movie 
 *
 * @author Neo
 */

import javax.xml.parsers.*;                                                     //→1
import org.xml.sax.*;
import org.w3c.dom.*;
import java.text.*;

public class P878_ListMoviesXML {

    private static NumberFormat cf
            = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) //→11
    {
        Document doc = getDocument("movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element) root.getFirstChild();
        Movie m;
        while (movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement
                    = (Element) movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String name)//→29
    {
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
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
