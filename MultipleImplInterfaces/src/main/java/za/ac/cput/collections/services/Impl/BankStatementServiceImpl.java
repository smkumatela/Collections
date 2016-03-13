package za.ac.cput.collections.services.Impl;

import za.ac.cput.collections.domain.BankingDetails;
import za.ac.cput.collections.services.BankServices;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankStatementServiceImpl implements BankServices {
    public BankingDetails getBankDetails() {
        BankingDetails bankBankingDetails = new BankingDetails();
        bankBankingDetails.setAccountNum(246810);
        bankBankingDetails.setBranchName("Cape Town");
        bankBankingDetails.setTransactionType("Statement");
        bankBankingDetails.setBankName("Capitec");

        return bankBankingDetails;
    }
}
