package za.ac.cput.collections.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.collections.services.BankServices;
import za.ac.cput.collections.services.Impl.BankBalanceServiceImpl;
import za.ac.cput.collections.services.Impl.BankDepositeServiceImpl;
import za.ac.cput.collections.services.Impl.BankStatementServiceImpl;
import za.ac.cput.collections.services.Impl.BankWithdrawalServiceImpl;

/**
 * Created by Songezo on 2016-03-12.
 */
@Configuration
public class AppConfig {

    @Bean(name = "Deposites")
    public BankServices getDeposite(){
        return new BankDepositeServiceImpl();
    }

    @Bean(name = "Balances")
    public BankServices getBalance(){
        return new BankBalanceServiceImpl();
    }

    @Bean(name = "Statements")
    public BankServices getStatement(){
        return new BankStatementServiceImpl();
    }

    @Bean(name = "Withdrawal")
    public BankServices getWithdraw(){
        return new BankWithdrawalServiceImpl();
    }

}