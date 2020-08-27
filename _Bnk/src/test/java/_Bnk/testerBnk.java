package _Bnk;
import ladder.bankApp;
import ladder.Account;
import ladder.bankApp;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
public class testerBnk {
	
	
	
	Account TAcnt = new Account("bob1","bob1","Bob","Lane", "Jan", "Baker", 500, false);
	Account TAcnt2 = new Account("bob1","bob1","Bob","Lane", null, null, 500, false);
	Account TAcnt3 = new Account("ao1","ao1","Bill","Lane","Jan","Baker",0,false);
	Account TAcnt4 = new Account("bob1","bob1","Bob","Lane", "Jan", "Baker", 500, false);
	bankApp io = new bankApp();
	ArrayList<Account> needVerifiedtest = new ArrayList<Account>();

	
	//References to objects will have different places in memory
	
	@Test
	public void test1() {
	Assertions.assertEquals(500, TAcnt.getBalance());
	}
	
	
	
	@Test
	public void test2() {
	Assertions.assertEquals("Bob", TAcnt.getFirstname());
	}
	
	
	
	@Test
	public void test3() {
	Assertions.assertEquals("Lane", TAcnt.getLastname());
	}
	
	@Test
	public void test4() {
	Assertions.assertEquals("Jan", TAcnt.getSecondFirstName());
	}
	
	@Test
	public void test5() {
	Assertions.assertEquals("Baker", TAcnt.getSecondLastName());
	}
	
	@Test
	public void test6() {
	Assertions.assertEquals("bob1", TAcnt.getUsername());
	}
	
	
	@Test
	public void test7() {
	Assertions.assertEquals("bob1", TAcnt.getPassword());
	}
	
	@Test
	public void test8() {
	Assertions.assertEquals(false, TAcnt.getVerified());
	}
	
	public boolean SGverified(boolean a) {
		boolean b;
		TAcnt.setVerified(a);
		b = TAcnt.getVerified();
		return b;
	}	
	
	@Test
	public void test9() {
	Assertions.assertEquals(true, SGverified(true));
	}
	
	
	
	public int SGbalance(int a) {
		int b;
		TAcnt.setBalance(a);
		b = TAcnt.getBalance();
		return b;
	}	
	
	@Test
	public void test10() {
	Assertions.assertEquals(600,SGbalance(600));
	}
	
	
	
	
	@Test
	public void test11() {
	Assertions.assertNotEquals(TAcnt,TAcnt2);
	}
	
	
// 	 
//
//	@Test
//	public void test12() {
//	Assertions.assertEquals(500, TAcnt.getUsername());
//	}
//	
//	@Test
//	public void test13() {
//	Assertions.assertEquals(500, TAcnt.getUsername());
//	}
//	
	
	
	
}
