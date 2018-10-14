import java.util.ArrayList;

import util.Block;
import util.Transaction;

public class mini_blockchain_4 {

	public static void main(String[] args) {
		
		
//		
// TODO Auto-generated method stub

        //예제 1
		Block block = new Block(1, 0, "데이터");
		block.dataMine();
		block.getDataInformation();
		
		Block block2 = new Block(2, 0, "바뀐데이터");
		block2.dataMine();
		block2.getDataInformation();

		
		
	}

}
