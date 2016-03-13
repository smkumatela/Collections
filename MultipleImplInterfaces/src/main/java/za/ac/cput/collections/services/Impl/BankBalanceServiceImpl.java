package za.ac.cput.collections.services.Impl;

import za.ac.cput.collections.domain.BankingDetails;
import za.ac.cput.collections.services.BankServices;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankBalanceServiceImpl implements BankServices {
    public BankingDetails getBankDetails() {
        BankingDetails bankBankingDetails = new BankingDetails();
        bankBankingDetails.setAccountNum(1357911);
        bankBankingDetails.setBranchName("Cape Town");
        bankBankingDetails.setTransactionType("Balance");
        bankBankingDetails.setBankName("Capitec");

        return bankBankingDetails;
    }
}
