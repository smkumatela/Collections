package za.ac.cput.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.collections.config.AppConfig;
import za.ac.cput.collections.domain.BankingDetails;
import za.ac.cput.collections.services.BankServices;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankingDetailsTest {

    private BankServices bankServices;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        bankServices = (BankServices)context.getBean("Withdrawal");
    }

    @Test
    public void testBanking() throws Exception {
        BankingDetails banking = bankServices.getBankDetails();
        System.out.print("The Transaction Type is: " + bankServices.getBankDetails().getTransactionType());
        Assert.assertEquals(banking.getBranchName(), "Cape Town");
    }
}
