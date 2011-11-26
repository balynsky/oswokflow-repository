/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.workflow.spi.ejb;


/**
 * Local home interface for HistoryStepPrev.
 * @author Hani Suleiman (hani@formicary.net) Date: Apr 7, 2003 Time: 8:17:09 PM
 */
public interface HistoryStepPrevLocalHome extends javax.ejb.EJBLocalHome {
    //~ Static fields/initializers /////////////////////////////////////////////

    public static final String COMP_NAME = "java:comp/env/ejb/HistoryStepPrev";
    public static final String JNDI_NAME = "HistoryStepPrev";

    //~ Methods ////////////////////////////////////////////////////////////////

    public com.opensymphony.workflow.spi.ejb.HistoryStepPrevLocal create(long id, long previousId) throws javax.ejb.CreateException;

    public com.opensymphony.workflow.spi.ejb.HistoryStepPrevLocal findByPrimaryKey(com.opensymphony.workflow.spi.ejb.PreviousStepPK pk) throws javax.ejb.FinderException;

    public java.util.Collection findByStepId(long entryId) throws javax.ejb.FinderException;
}