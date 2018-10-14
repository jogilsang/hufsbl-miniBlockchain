package util;

import java.util.ArrayList;

public class Block {
	
	private int blockID;
	private int nonce; // 0���� �����ؼ� ���䰪�� hash�� ã�Ƴ������� 1�� �����Ǵ� ���ȸ����
	//private String data; 
	private ArrayList<Transaction> transactionList; // �ش� ����� �����Ǳ���� �߻��� �ű� Ʈ����ǵ��� ������ �ǹ�
	
	private String data;
	
	private String previousBlockHash;
	
	// ������
	
public Block(int blockID, int nonce, String data) {
		
		this.blockID = blockID;
		this.nonce = nonce;
		this.data= data;

		
	}

public Block(int blockID, String previousBlockHash, int nonce, String data) {

    this.blockID = blockID;

    this.previousBlockHash = previousBlockHash;

    this.nonce = nonce;

    this.data = data;

  }
	
	public Block(int blockID, String previousBlockHash, int nonce, ArrayList<Transaction> transactionList) {
		
		this.blockID = blockID;
		this.nonce = nonce;
		this.previousBlockHash = previousBlockHash;
		this.transactionList = transactionList; 
		
	}
	
	public String getPreviousBlockHash() {

	    return previousBlockHash;

	  }

	  public void setPreviousBlockHash(String previousBlockHash) {

	    this.previousBlockHash = previousBlockHash;

	  }
	
	
	public int getBlockID() {
		return blockID;
	}
	
	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}
	
	public int getNonce() {
		return nonce;
	}
	
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	public void addTransaction(Transaction transaction) {

		 transactionList.add(transaction);

	}
	
	public void getDataInformation() {

	    System.out.println("--------------------------------------");

	    System.out.println("��� ��ȣ: " + getBlockID());

	    System.out.println("ä�� ���� ��: " + getNonce());
	    
	    System.out.println("��� ������: " + getData());

	    System.out.println("��� �ؽ�: " + getBlockDataHash());

	    System.out.println("--------------------------------------");

	  }
	
	  public void getPreviousDataAddedInformation() {

		    System.out.println("--------------------------------------");

		    System.out.println("��� ��ȣ: " + getBlockID());

		    System.out.println("���� �ؽ�: " + getPreviousBlockHash());

		    System.out.println("ä�� ���� ��: " + getNonce());

		    System.out.println("��� ������: " + getData());

		    System.out.println("��� �ؽ�: " + getBlockPreviousDataAddedHash());

		    System.out.println("--------------------------------------");

		  }
	
	public void showInformation() {

	    System.out.println("--------------------------------------");

	    System.out.println("��� ��ȣ: " + getBlockID());
	    
	    System.out.println("���� �ؽ�: " + getPreviousBlockHash());

	    System.out.println("ä�� ���� ��: " + getNonce());

	    System.out.println("Ʈ����� ����: " + transactionList.size() + "��");
	    
	    for(int i = 0; i < transactionList.size(); i++) {

		System.out.println(transactionList.get(i).getInformation());

	    }
	    
	    //System.out.println("��� ������: " + getData());

	    System.out.println("��� �ؽ�: " + getBlockHash());

	    System.out.println("--------------------------------------");

	  }
	
	public String getBlockPreviousDataAddedHash() {

		   return Util.getHash(nonce + data + previousBlockHash);

	  }
	
	
	public String getBlockDataHash() {

		 return Util.getHash(nonce + data);

	  }
	
	
	public String getBlockHash() {

//	    return Util.getHash(nonce + data);
//	    return Util.getHash(nonce + data + previousBlockHash);
		
		String transactionInformations = "";
		
		for(int i = 0; i < transactionList.size(); i++) {

		transactionInformations += transactionList.get(i).getInformation();

	    }
		
		return Util.getHash(nonce + transactionInformations + previousBlockHash);

	  }
	
	public void mine() {
		
		  while(true) {

			    if(getBlockHash().substring(0, 4).equals("0000")) {

			      System.out.println(blockID + "��° ����� ä���� �����߽��ϴ�.");

			      break;

			    }

			    nonce++;

			  }
		
	}
	
	public void previousDataAddedMine() {
		
	    while(true) {

	        if(getBlockPreviousDataAddedHash().substring(0, 4).equals("0000")) {

	          System.out.println(blockID + "��° ����� ä���� �����߽��ϴ�.");

	          break;

	        }

	        nonce++;

	      }
		
	}
	
	public void dataMine() {

		  while(true) {

		    if(getBlockDataHash().substring(0, 4).equals("0000")) {

		      System.out.println(blockID + "��° ����� ä���� �����߽��ϴ�.");

		      break;

		    }

		    nonce++;

		  }

		}

}
