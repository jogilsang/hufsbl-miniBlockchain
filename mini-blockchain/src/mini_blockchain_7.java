import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import util.EC;

public class mini_blockchain_7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		// 바운시 캐슬의 암호화 라이브러리를 사용하도록 설정
		Security.addProvider(new BouncyCastleProvider());
		
		// 타원 곡선 객체를 생성해 개인키와 공개키를 각각
		// private.pem, public.pem으로 저장합니다.
		EC ec = new EC();
		ec.generate("private.pem", "public.pem");
		
	}

}
