import java.util.ArrayList;

import util.Block;
import util.Transaction;

public class mini_blockchain_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// ���� 1
//		Block block = new Block(1, 0, "������");
//		block.mine();
//		block.getInformation();
//		
//		Block block2 = new Block(2, 0, "�ٲﵥ����");
//		block2.mine();
//		block2.getInformation();
		
//      ���� 2		
//		Block block1 = new Block(1, null, 0, "������");
//		block1.mine();
//		block1.getInformation();
//		
//		Block block2 = new Block(2, block1.getBlockHash(),0, "��ŷ�������ѵ����ͺ���");
//		block2.mine();
//		block2.getInformation();
//		
//		Block block3 = new Block(3, block2.getBlockHash(),0, "������");
//		block3.mine();
//		block3.getInformation();
//		
//		Block block4 = new Block(4, block3.getBlockHash(),0, "������");
//		block4.mine();
//		block4.getInformation();
		
		//���� 3
//		Block block1 = new Block(1, null, 0, new ArrayList<Transaction>());
//
//		block1.mine();
//
//		block1.showInformation();
//
//		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block2.addTransaction(new Transaction("������", "���ѿ�", 1.5));
//
//		block2.addTransaction(new Transaction("������", "���ѿ�", 0.7));
//
//		block2.mine();
//
//		block2.showInformation();
//
//		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block3.addTransaction(new Transaction("������", "�̻��", 8.2));
//
//		block3.addTransaction(new Transaction("���ѿ�", "������", 0.4));
//
//		block3.mine();
//
//		block3.showInformation();
//
//
//
//		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList<Transaction>());
//
//		block4.addTransaction(new Transaction("�̻��", "������", 0.1));
//
//		block4.mine();
//
//		block4.showInformation();
		
		// �ѹ� �ۼ��� Ʈ������� ����ɼ�����
		
		Block block1 = new Block(1, null, 0, new ArrayList<Transaction>());

		block1.mine();

		block1.showInformation();

		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList<Transaction>());

		block2.addTransaction(new Transaction("������", "���ѿ�", 1.5));

		block2.addTransaction(new Transaction("������", "���ѿ�", 0.7));

		block2.mine();

		block2.showInformation();

		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList<Transaction>());

		block3.addTransaction(new Transaction("������", "�̻��", 8.2));

		block3.addTransaction(new Transaction("���ѿ�", "������", 0.4));

		block3.mine();

		block3.showInformation();



		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList<Transaction>());

		block4.addTransaction(new Transaction("�̻��", "������", 0.1));

		block4.mine();

		block4.showInformation();
		
		
	}

}
