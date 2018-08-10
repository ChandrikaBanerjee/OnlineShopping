package com.cg.bank.service;

import java.util.Set;

import com.cg.bank.dao.OnlineBankDao;
import com.cg.customer.pojo.BankAccount;

public class OnlineBankService {
OnlineBankDao bankdao=new OnlineBankDao();
public void addBankAccount(BankAccount bankAccount) {
	bankdao.addBankAccount(bankAccount);
}

/**
 * @return Set of Accounts
 * 
 * This method is responsible for returning all the active accounts
 */
public Set<BankAccount> viewAll(){
	return bankdao.viewAll();
}



}
