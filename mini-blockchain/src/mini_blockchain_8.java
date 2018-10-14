import java.util.ArrayList;

import util.Block;
import util.Transaction;

public class mini_blockchain_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 예제 1
//		Block block = new Block(1, 0, "데이터");
//		block.mine();
//		block.getInformation();
//		
//		Block block2 = new Block(2, 0, "바뀐데이터");
//		block2.mine();
//		block2.getInformation();
		
//      예제 2		
//		Block block1 = new Block(1, null, 0, "데이터");
//		block1.mine();
//		block1.getInformation();
//		
//		Block block2 = new Block(2, block1.getBlockHash(),0, "해킹으로인한데이터변조");
//		block2.mine();
//		block2.getInformation();
//		
//		Block block3 = new Block(3, block2.getBlockHash(),0, "데이터");
//		block3.mine();
//		block3.getInformation();
//		
//		Block block4 = new Block(4, block3.getBlockHash(),0, "데이터");
//		block4.mine();
//		block4.getInformation();
		
		//예제 3
//		Block block1 = new Block(1, null, 0, new ArrayList<Transaction>());
//
//		block1.mine();
//
//		block1.showInformation();
//
//		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block2.addTransaction(new Transaction("나동빈", "박한울", 1.5));
//
//		block2.addTransaction(new Transaction("이태일", "박한울", 0.7));
//
//		block2.mine();
//
//		block2.showInformation();
//
//		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block3.addTransaction(new Transaction("강종구", "이상욱", 8.2));
//
//		block3.addTransaction(new Transaction("박한울", "나동빈", 0.4));
//
//		block3.mine();
//
//		block3.showInformation();
//
//
//
//		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block4.addTransaction(new Transaction("이상욱", "강종구", 0.1));
//
//		block4.mine();
//
//		block4.showInformation();
		
		// 한번 작성된 트랜잭션은 변경될수없음
		
		Block block1 = new Block(1, null, 0, new ArrayList<Transaction>());

		block1.mine();

		block1.showInformation();

		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList<Transaction>());

		block2.addTransaction(new Transaction("나동빈", "박한울", 1.5));

		block2.addTransaction(new Transaction("이태일", "박한울", 0.7));

		block2.mine();

		block2.showInformation();

		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList<Transaction>());

		block3.addTransaction(new Transaction("강종구", "이상욱", 8.2));

		block3.addTransaction(new Transaction("박한울", "나동빈", 0.4));

		block3.mine();

		block3.showInformation();



		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList<Transaction>());

		block4.addTransaction(new Transaction("이상욱", "강종구", 0.1));

		block4.mine();

		block4.showInformation();
		
		
	}

}
