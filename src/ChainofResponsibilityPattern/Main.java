package ChainofResponsibilityPattern;

public class Main {
    public static void main(String args[]){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception");
        logProcessor.log(LogProcessor.DEBUG, "debugging");
        logProcessor.log(LogProcessor.INFO, "normal");

    }
}
