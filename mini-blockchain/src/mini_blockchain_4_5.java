import java.util.ArrayList;

import util.Block;
import util.Transaction;

public class mini_blockchain_4_5 {

	public static void main(String[] args) {
		


//      ���� 2		
		Block block1 = new Block(1, null, 0, "������");
		block1.previousDataAddedMine();
		block1.getPreviousDataAddedInformation();
		
		Block block2 = new Block(2, block1.getBlockPreviousDataAddedHash(), 0, "��ŷ�������ѵ����ͺ���");
		block2.previousDataAddedMine();
		block2.getPreviousDataAddedInformation();
		
		Block block3 = new Block(3, block2.getBlockPreviousDataAddedHash(),0, "������");
		block3.previousDataAddedMine();
		block3.getPreviousDataAddedInformation();
		
		Block block4 = new Block(4, block3.getBlockPreviousDataAddedHash(),0, "������");
		block4.previousDataAddedMine();
		block4.getPreviousDataAddedInformation();

		
		
	}

}
