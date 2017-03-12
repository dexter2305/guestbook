/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb.ui;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author : innsh
 * created on 12-02-2017
 */
public class AboutPage extends WebPage {
    private Logger logger = LoggerFactory.getLogger(AboutPage.class);
    private static int hitCounter;
    public AboutPage(){
        hitCounter++;
        add(new Label("hitCounter", hitCounter));
        logger.info(AboutPage.class + " viewed " + hitCounter+ " times.");

    }
}
