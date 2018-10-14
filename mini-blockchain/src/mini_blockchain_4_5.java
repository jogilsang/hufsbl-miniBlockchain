import java.util.ArrayList;

import util.Block;
import util.Transaction;

public class mini_blockchain_4_5 {

	public static void main(String[] args) {
		


//      예제 2		
		Block block1 = new Block(1, null, 0, "데이터");
		block1.previousDataAddedMine();
		block1.getPreviousDataAddedInformation();
		
		Block block2 = new Block(2, block1.getBlockPreviousDataAddedHash(), 0, "해킹으로인한데이터변조");
		block2.previousDataAddedMine();
		block2.getPreviousDataAddedInformation();
		
		Block block3 = new Block(3, block2.getBlockPreviousDataAddedHash(),0, "데이터");
		block3.previousDataAddedMine();
		block3.getPreviousDataAddedInformation();
		
		Block block4 = new Block(4, block3.getBlockPreviousDataAddedHash(),0, "데이터");
		block4.previousDataAddedMine();
		block4.getPreviousDataAddedInformation();

		
		
	}

}
