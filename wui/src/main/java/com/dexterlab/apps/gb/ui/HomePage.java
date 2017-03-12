/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb.ui;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author : innsh
 * created on 06-02-2017
 */
public class HomePage extends WebPage {
    private Logger logger = LoggerFactory.getLogger(HomePage.class);
    private WebPage contactUsPage = new ContactUs();
    public HomePage(){
        add(new Label("title", "My guest book"));
        add(new Link("aboutUsPage") {
            @Override
            public void onClick() {
                HomePage.this.setResponsePage(AboutPage.class);
                logger.debug("About us page clicked");
            }
        });
        add(new Link("contactUsPage") {
            @Override
            public void onClick() {
                HomePage.this.setResponsePage(contactUsPage);
                logger.debug("Contact us page clicked");
            }
        });
    }
}
