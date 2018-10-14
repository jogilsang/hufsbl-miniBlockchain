package util;

public class Transaction {
	
	String sender; // ���� �������
	String receiver; // ���� �޴»��
	double amount;  // ���� ���� ��
	
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

		return sender + "��(��) " + receiver + "���� " + amount + "���� ������ ���½��ϴ�.";

	}
	

}
