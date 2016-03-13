package za.ac.cput.collections.services.Impl;

import za.ac.cput.collections.domain.BankBankingDetails;
import za.ac.cput.collections.services.BankServices;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankServicesImpl implements BankServices {

    public BankBankingDetails getBankDetails() {
        BankBankingDetails bankBankingDetails = new BankBankingDetails();
        bankBankingDetails.setAccountNum(12345);
        bankBankingDetails.setBranchName("Cape Town");
        bankBankingDetails.setTransactionType("Deposite");
        bankBankingDetails.setBankName("Capitec");

        return bankBankingDetails;
    }
}
