package util;

import java.util.ArrayList;

public class Block {
	
	private int blockID;
	private int nonce; // 0부터 시작해서 정답값의 hash를 찾아낼때까지 1씩 증가되는 계산회수값
	//private String data; 
	private ArrayList<Transaction> transactionList; // 해당 블록이 생성되기까지 발생한 신규 트랜잭션들의 정보를 의미
	
	private String data;
	
	private String previousBlockHash;
	
	// 생성자
	
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

	    System.out.println("블록 번호: " + getBlockID());

	    System.out.println("채굴 변수 값: " + getNonce());
	    
	    System.out.println("블록 데이터: " + getData());

	    System.out.println("블록 해시: " + getBlockDataHash());

	    System.out.println("--------------------------------------");

	  }
	
	  public void getPreviousDataAddedInformation() {

		    System.out.println("--------------------------------------");

		    System.out.println("블록 번호: " + getBlockID());

		    System.out.println("이전 해시: " + getPreviousBlockHash());

		    System.out.println("채굴 변수 값: " + getNonce());

		    System.out.println("블록 데이터: " + getData());

		    System.out.println("블록 해시: " + getBlockPreviousDataAddedHash());

		    System.out.println("--------------------------------------");

		  }
	
	public void showInformation() {

	    System.out.println("--------------------------------------");

	    System.out.println("블록 번호: " + getBlockID());
	    
	    System.out.println("이전 해시: " + getPreviousBlockHash());

	    System.out.println("채굴 변수 값: " + getNonce());

	    System.out.println("트랜잭션 개수: " + transactionList.size() + "개");
	    
	    for(int i = 0; i < transactionList.size(); i++) {

		System.out.println(transactionList.get(i).getInformation());

	    }
	    
	    //System.out.println("블록 데이터: " + getData());

	    System.out.println("블록 해시: " + getBlockHash());

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

			      System.out.println(blockID + "번째 블록의 채굴에 성공했습니다.");

			      break;

			    }

			    nonce++;

			  }
		
	}
	
	public void previousDataAddedMine() {
		
	    while(true) {

	        if(getBlockPreviousDataAddedHash().substring(0, 4).equals("0000")) {

	          System.out.println(blockID + "번째 블록의 채굴에 성공했습니다.");

	          break;

	        }

	        nonce++;

	      }
		
	}
	
	public void dataMine() {

		  while(true) {

		    if(getBlockDataHash().substring(0, 4).equals("0000")) {

		      System.out.println(blockID + "번째 블록의 채굴에 성공했습니다.");

		      break;

		    }

		    nonce++;

		  }

		}

}
