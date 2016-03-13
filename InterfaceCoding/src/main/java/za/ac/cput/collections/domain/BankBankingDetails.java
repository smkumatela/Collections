package za.ac.cput.collections.domain;

import java.io.Serializable;

/**
 * Created by Songezo on 2016-03-12.
 */
public class BankBankingDetails implements Serializable{
    private Integer accountNum;
    private String bankName;
    private String branchName;
    private String transactionType;

    public BankBankingDetails() {
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankBankingDetails that = (BankBankingDetails) o;

        if (accountNum != null ? !accountNum.equals(that.accountNum) : that.accountNum != null) return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
        if (branchName != null ? !branchName.equals(that.branchName) : that.branchName != null) return false;
        return !(transactionType != null ? !transactionType.equals(that.transactionType) : that.transactionType != null);

    }

    @Override
    public int hashCode() {
        int result = accountNum != null ? accountNum.hashCode() : 0;
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (branchName != null ? branchName.hashCode() : 0);
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BankBankingDetails{" +
                "accountNum=" + accountNum +
                ", bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
