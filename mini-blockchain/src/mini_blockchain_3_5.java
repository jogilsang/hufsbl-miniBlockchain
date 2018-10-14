import util.Util;

public class mini_blockchain_3_5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

        // nonce : ���� 0���� �����Ͽ� ������ �����ϴ� �ؽ����� ã�Ƴ��������� 1�� �����ϴ� ��� ȸ��
		// ���� �ϳ��� 16�� ������ = 2^4 ��
		// ���� 6���� ������ִ� ������ = 2^4^6 = 2^24 = 1000������
		// 16���� 6�ڸ��� Ư�����ڿ��� ���� Ȯ���� = 1/1000�� = 1/2^24
		// Ư�� Ƚ���� ä���� ����������, �ѹ� ä���� �� ���ֵ��� �ϴ� ���̵��� �۾����̵�
		// Proof of Work(POW) : �۾�����˰���
		
		String password = "�g�����ü��";
		String getHashPassword = Util.getHash(password).substring(0, 4);
		
		int nonce = 0;
		
		// nonce�� 0���� hash�� ������, �ȳ� �̶�� ���� hash���� ��ġ�Ҷ����� �����Ų��
		// 10037329 �� 1õ���� ������ ���곡�� ������ �ϳ� ���Դ�.
		while(true) {
		
			
			if(Util.getHash(String.valueOf(nonce)).substring(0,4).equals(getHashPassword)){
				System.out.println("���� : " + nonce + "�� Hash�� " + password + "�� ��ġ�մϴ�");
				System.out.println("�н����� \"" + password + "\"" + " ��ŷ ���� :: ������ ����ϴ�.");
				break;
			}
			
			System.out.println(nonce + "�� hash�� " + "\"" + password + "\""+ "�� hash�� ��ġ�����ʽ��ϴ�");
			
			nonce = nonce + 1;
		}
		
	}

}
