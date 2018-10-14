package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;

// 타원 곡선 암호화 기술을 이용해 개인키 및 공개키를 생성해 저장할 수 있도록 EC.java 
public class EC {
	
	// 세부 알고리즘으로 sect163k1을 사용합니다.
	private final String ALGORITHM = "sect163k1";
	
	public void generate(String privateKeyName, String publicKeyName) throws Exception {
		// 바운시 캐슬의 타원 곡선 표준 알고리즘(ECDSA)을 사용합니다
		KeyPairGenerator generator = KeyPairGenerator.getInstance("ECDSA", "BC");
		
		// 타원 곡선의 세부 알고리즘으로 sect163k1을 사용합니다
		ECGenParameterSpec ecsp;
		ecsp = new ECGenParameterSpec(ALGORITHM);
		generator.initialize(ecsp, new SecureRandom());
		
		// 해당 알고리즘으로 랜덤의 키 한 쌍을 생성합니다
		KeyPair keyPair = generator.generateKeyPair();
		System.out.println("타원 곡선 암호키 한 쌍을 생성했습니다.");
		
		// 생성한 키 한 쌍에서 개인키와 공개키를 추출합니다.
		PrivateKey priv = keyPair.getPrivate();
		PublicKey pub = keyPair.getPublic();
		
		// 개인키와 공개키를 특정한 파일 이름으로 저장한다
		writePemFile(priv, "EC PRIVATE KEY", privateKeyName);
		writePemFile(pub, "EC PUBLIC KEY", publicKeyName);
	}
	
	// Pem 클래스를 이용해 생성된 암호키를 파일로 저장하는 함수입니다
	private void writePemFile(Key key, String description, String filename) throws FileNotFoundException, IOException {
		
		Pem pemFile = new Pem(key, description);
		pemFile.write(filename);
		System.out.println(String.format("EC 암호키를 %s을(를) %s 파일로 내보냈습니다.", description, filename));
	
	}
		
	
	
}
