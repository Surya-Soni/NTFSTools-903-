package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {
	public String openAccount (String addhar,double initialamount,String type) {
		return"account is opened with acc number::"+new Random().nextLong(500000000000L);
	}
	


	public String closeAccount() {
		return "Account is closed";
	}
	public String withdraw(long acno,double amount) {
		return amount +"is withdrow from the account number::"+acno;
	}
	
	public String deposit (long acno,double amount) {
		return amount+"is deposit from the account number::"+acno;
	}


public String transferMoney(long srcAcno,long destAcno,double amount) {
		return "transfering"+amount+"from"+srcAcno+"to"+destAcno;

	}
}
