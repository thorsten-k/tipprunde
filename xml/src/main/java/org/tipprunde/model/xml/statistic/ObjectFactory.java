
package org.tipprunde.model.xml.statistic;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tipprunde.model.xml.statistic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tipprunde.model.xml.statistic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateWorker }
     * 
     */
    public UpdateWorker createUpdateWorker() {
        return new UpdateWorker();
    }

    /**
     * Create an instance of {@link StatTipp }
     * 
     */
    public StatTipp createStatTipp() {
        return new StatTipp();
    }

    /**
     * Create an instance of {@link StatRound }
     * 
     */
    public StatRound createStatRound() {
        return new StatRound();
    }

    /**
     * Create an instance of {@link StatMatch }
     * 
     */
    public StatMatch createStatMatch() {
        return new StatMatch();
    }

}
