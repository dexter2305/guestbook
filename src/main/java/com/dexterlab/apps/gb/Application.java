/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb;

import com.dexterlab.apps.gb.ui.JettyApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * author : innsh
 * created on 11-02-2017
 */
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting Guestbook application as JettyWebApplication");
        JettyApplication.INSTANCE.start();
        logger.info("Started Guestbook application.");
        System.out.println("Press Q to stop the application");
        try {
            boolean stopServer = false;
            while(!stopServer){
                stopServer = (char) System.in.read() == 'Q';
            }
            logger.info("User requested to terminate application.");
        } catch (IOException e) {
            logger.error("Error while reading standard input.", e);
        } catch (Exception e) {
            logger.error("Error while stopping the application", e);
        } finally {
            try {
                JettyApplication.INSTANCE.stop();
            } catch (Exception e) {
                logger.error("Error while stopping the application", e);
            }
        }
    }
}
