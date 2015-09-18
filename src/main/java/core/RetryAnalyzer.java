package core;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer  {

    private int retryCount = 0;
    private int retryMaxCount = 1; // set your count to re-run test
    protected Logger log;
    private static final Logger logger  = Logger.getLogger(RetryAnalyzer.class);

    static {
        PropertyConfigurator.configure("log4j.properties");
    }
    @Override
    public boolean retry(ITestResult tr) {

        if (tr.getAttributeNames().contains("retry") == false) {
            if(retryCount < retryMaxCount){
                logger.info("Retrying " + tr.getName() + " with status "
                        + tr.getStatus() + " for the " + (retryCount+1) + " of "
                        + retryMaxCount + " times.");

                retryCount++;

                return true;
            }
        }
        logger.debug("Skipping retry!");
        return false;
    }
}