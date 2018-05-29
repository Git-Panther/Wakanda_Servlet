package com.kh.java.listener.controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent e)  { 
         // TODO Auto-generated method stub
    	System.out.println(e.getSession().getId() + " has created.");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent e)  { 
         // TODO Auto-generated method stub
    	System.out.println(e.getSession().getId() + " has destroyed.");
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent e)  { 
         // TODO Auto-generated method stub
    	String name = (String)e.getSession().getAttribute("name");
    	System.out.println(name + " has accessed(called from listener).");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent e)  { 
         // TODO Auto-generated method stub
    	String name = (String)e.getSession().getAttribute("name");
    	System.out.println(name + " has leaved(called from listener).");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent e)  { 
         // TODO Auto-generated method stub
    	String name = (String)e.getSession().getAttribute("name");
    	System.out.println(name + " has replaced(called from listener).");
    }
	
}
