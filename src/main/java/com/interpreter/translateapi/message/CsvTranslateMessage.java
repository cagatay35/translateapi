package com.interpreter.translateapi.message;

import java.io.Serializable;

public class CsvTranslateMessage implements Serializable {
    private String filePath;
    private String transactionId;


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
