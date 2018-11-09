package com.interpreter.translateapi.listener;

import com.interpreter.translateapi.message.CsvTranslateMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CsvTranslateListener {

    @JmsListener(destination = "csv_translate", containerFactory = "csvTranslateQueueFactory")
    public void receiveMessage(CsvTranslateMessage message) {
        System.out.println("Received <" + message + ">");
    }

}
