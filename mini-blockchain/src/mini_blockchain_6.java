import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;

public class mini_blockchain_6 {

	public static void main(String[] args) throws Exception, NoSuchProviderException {
		// TODO Auto-generated method stub
		
		// 타원 곡선 암호화 알고리즘
		// 지갑(Wallet) 주소는 공개키를 해시화해서 얻어낸다. 따라서 블록체인에서는 ‘특정한 개인’이 ‘지갑 주소’로 대변되므로 이러한 공개키 기반 구조를 이용해 개인의 신원을 정확히 증명할 수 있게 된다.
		
		// 무작위의 개인키와 공개키를 생성하기 위해 키 생성 객체를 정의합니다
		KeyPairGenerator kpg;
		kpg = KeyPairGenerator.getInstance("EC", "SunEC");
	
		// 타원 곡선 디지털 서명 알고리즘 객체를 생성한다
		ECGenParameterSpec ecsp;
		// 세부 알고리즘 스펙을 정의한다
		ecsp = new ECGenParameterSpec("sect163k1");
		// 랜덤으로 임의의 키를 생성합니다
		kpg.initialize(ecsp, new SecureRandom());
		
		// 개인키와 공개키 한 쌍을 생성합니다
		KeyPair kp = kpg.generateKeyPair();
		PrivateKey privKey = kp.getPrivate();
		PublicKey pubKey = kp.getPublic();
		
		// 서명 객체를 생성해 개인키를 설정합니다
		Signature ecdsa;
		ecdsa = Signature.getInstance("SHA1withECDSA", "SunEC");
		ecdsa.initSign(privKey);

		// 임의의 원래 문장을 정의합니다
		String text = "동빈이가 한율이에게 100 코인 전송";
		String textInfected = "동빈이가 한율이에게 1000 코인 전송";
		System.out.println("원래 문장: " + text);
		System.out.println("변경된 문장: " + textInfected);
		
		// 원래 문장에 대해 암호화를 수행해 서명 값(암호문)을 얻어냅니다
		ecdsa.update(text.getBytes("UTF-8"));
		byte[] signatureByte = ecdsa.sign();
		System.out.println("암호문 : 0x" + (new BigInteger(1, signatureByte).toString(16)).toUpperCase());
		
		// 서명 객체를 생성해 공개키를 이용해 복호화할 수 있도록 설정합니다
		Signature signature;
		signature = Signature.getInstance("SHA1withECDSA", "SunEC");
		signature.initVerify(pubKey);
		
		// 원래 문장을 공개키로 복호화해 검증합니다
		signature.update(text.getBytes("UTF-8"));
		System.out.println("원래 문장 검증 : " + signature.verify(signatureByte));
		
		// 원래 문장을 공개키로 복호화해 검증합니다
		signature.update(textInfected.getBytes("UTF-8"));
		System.out.println("변경된 문장 검증 : " + signature.verify(signatureByte));
		
		
	}

}
