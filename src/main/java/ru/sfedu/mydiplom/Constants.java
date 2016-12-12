package ru.sfedu.mydiplom;

public class Constants {
    public static final String APPLICATION_FILE_NAME="applications.csv";
    public static final String CLIENTS_FILE_NAME="clients.csv";
    public static final String CREDITS_FILE_NAME="credits.csv";
    public static final String PAYMENTS_FILE_NAME="payments.csv";
    public static final String TYPECREDITS_FILE_NAME="typecredits.csv";
    public static final String DELAY_FILE_NAME="delay.csv";
    public static final String[] COLUMNS_APP = new String[] {"id", "sum", "credit", "maturity", "rate", "date", "status", "clientID"};
    public static final String[] COLUMNS_CLT = new String[] {"id", "dateOfBirth", "status", "passportNumber", "salary", "experience", "experienceOfLastWP", "experienceOfLastWP", "totalGain", "conviction", "working", "changedPassport", "name", "placeOfWorking", "addres", "phone", "workPhone", "passportData", "otherDocument"};
    public static final String[] COLUMNS_CRD = new String[] {"id", "status", "date", "typeCredit"};
    public static final String[] COLUMNS_PMT = new String[] {"id", "date", "credit"};
    public static final String[] COLUMNS_TCD = new String[] {"id", "name", "maturityOf", "maturityUp", "sumOf", "sumUp", "rateOf", "rateUp"};
    public static final String[] COLUMNS_DLY = new String[] {"id", "credit", "date", "sum"};
}
