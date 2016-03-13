package za.ac.cput.collections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.collections.domain.BankBankingDetails;
import za.ac.cput.collections.services.BankServices;
import za.ac.cput.collections.services.Impl.BankServicesImpl;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankBankingDetailsTest {
    private BankServices bankServices;

    @Before
    public void setUp() throws Exception {
        bankServices = new BankServicesImpl();
    }

    @Test
    public void testBank() throws Exception {
        BankBankingDetails bankBankingDetails = bankServices.getBankDetails();
        System.out.print("The Bank Details are: " + bankServices.getBankDetails());
        Assert.assertEquals(bankBankingDetails.getBranchName(), "Cape Town");
    }

    @After
    public void tearDown() throws Exception {

    }
}
