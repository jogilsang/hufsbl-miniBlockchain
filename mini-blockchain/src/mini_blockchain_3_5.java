import util.Util;

public class mini_blockchain_3_5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Proof of Work(POW) : �۾�����˰���
		// �۾����̵� : Ư�� Ƚ���� ä���� ����������, �ѹ� ä���� �� ���ֵ��� �ϴ� ���̵�
        
		// 16���� ���� �ϳ��� 16�� ������ = 2^4 ��
		// 16���� ���� 6���� ������ִ� ������ = 2^4^6 = 2^24 = 1000������
		// 16���� 6�ڸ��� Ư�����ڿ��� ���� Ȯ���� = 1/1000�� = 1/2^24
		
		String value = "¯¯��";
		String getHashValue = Util.getHash(value).substring(0, 4);
		
		// nonce : ���� 0���� �����Ͽ� ������ �����ϴ� �ؽ����� ã�Ƴ��������� 1�� �����ϴ� ��� ȸ��
		// nonce�� 0���� hash�� ������, value���� hash�� ��ġ�Ҷ����� �����Ų��
		int nonce = 0;
		
		while(true) {
			if(Util.getHash(String.valueOf(nonce)).substring(0,4).equals(getHashValue)){
				System.out.println("���� : " + nonce + "�� Hash�� " + value + "�� ��ġ�մϴ�");
				System.out.println("������ ����ϴ�.");
				break;
			}
			System.out.println(nonce + "�� hash�� " + "\"" + value + "\""+ "�� hash�� ��ġ�����ʽ��ϴ�");
			nonce = nonce + 1;
		}
		
	}

}
