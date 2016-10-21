
package org.tipprunde.model.xml.user;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tipprunde.model.xml.user package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tipprunde.model.xml.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Identity }
     * 
     */
    public Identity createIdentity() {
        return new Identity();
    }

    /**
     * Create an instance of {@link IdFacebook }
     * 
     */
    public IdFacebook createIdFacebook() {
        return new IdFacebook();
    }

    /**
     * Create an instance of {@link IdPassword }
     * 
     */
    public IdPassword createIdPassword() {
        return new IdPassword();
    }

    /**
     * Create an instance of {@link IdEnterprise }
     * 
     */
    public IdEnterprise createIdEnterprise() {
        return new IdEnterprise();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

}
