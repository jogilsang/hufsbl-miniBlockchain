package util;

public class Transaction {
	
	String sender; // 코인 보낸사람
	String receiver; // 코인 받는사람
	double amount;  // 코인 보낸 양
	
	public Transaction(String sender, String receiver, double amount) {
		
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
		
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender() {
		this.sender = sender;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver() {
		this.receiver = receiver;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount() {
		this.amount = amount;
	}
	
	public String getInformation() {

		return sender + "이(가) " + receiver + "에게 " + amount + "개의 코인을 보냈습니다.";

	}
	

}
