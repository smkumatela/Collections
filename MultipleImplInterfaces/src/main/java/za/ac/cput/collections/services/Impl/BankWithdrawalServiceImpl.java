package za.ac.cput.collections.services.Impl;

import za.ac.cput.collections.domain.BankingDetails;
import za.ac.cput.collections.services.BankServices;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankWithdrawalServiceImpl implements BankServices {
    public BankingDetails getBankDetails() {
        BankingDetails bankBankingDetails = new BankingDetails();
        bankBankingDetails.setAccountNum(123456);
        bankBankingDetails.setBranchName("Cape Town");
        bankBankingDetails.setTransactionType("Withdraw");
        bankBankingDetails.setBankName("Capitec");

        return bankBankingDetails;
    }
}
