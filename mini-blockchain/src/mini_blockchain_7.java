import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import util.EC;

public class mini_blockchain_7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		// �ٿ�� ĳ���� ��ȣȭ ���̺귯���� ����ϵ��� ����
		Security.addProvider(new BouncyCastleProvider());
		
		// Ÿ�� � ��ü�� ������ ����Ű�� ����Ű�� ����
		// private.pem, public.pem���� �����մϴ�.
		EC ec = new EC();
		ec.generate("private.pem", "public.pem");
		
	}

}
