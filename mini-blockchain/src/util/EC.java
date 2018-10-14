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

// Ÿ�� � ��ȣȭ ����� �̿��� ����Ű �� ����Ű�� ������ ������ �� �ֵ��� EC.java 
public class EC {
	
	// ���� �˰������� sect163k1�� ����մϴ�.
	private final String ALGORITHM = "sect163k1";
	
	public void generate(String privateKeyName, String publicKeyName) throws Exception {
		// �ٿ�� ĳ���� Ÿ�� � ǥ�� �˰���(ECDSA)�� ����մϴ�
		KeyPairGenerator generator = KeyPairGenerator.getInstance("ECDSA", "BC");
		
		// Ÿ�� ��� ���� �˰������� sect163k1�� ����մϴ�
		ECGenParameterSpec ecsp;
		ecsp = new ECGenParameterSpec(ALGORITHM);
		generator.initialize(ecsp, new SecureRandom());
		
		// �ش� �˰������� ������ Ű �� ���� �����մϴ�
		KeyPair keyPair = generator.generateKeyPair();
		System.out.println("Ÿ�� � ��ȣŰ �� ���� �����߽��ϴ�.");
		
		// ������ Ű �� �ֿ��� ����Ű�� ����Ű�� �����մϴ�.
		PrivateKey priv = keyPair.getPrivate();
		PublicKey pub = keyPair.getPublic();
		
		// ����Ű�� ����Ű�� Ư���� ���� �̸����� �����Ѵ�
		writePemFile(priv, "EC PRIVATE KEY", privateKeyName);
		writePemFile(pub, "EC PUBLIC KEY", publicKeyName);
	}
	
	// Pem Ŭ������ �̿��� ������ ��ȣŰ�� ���Ϸ� �����ϴ� �Լ��Դϴ�
	private void writePemFile(Key key, String description, String filename) throws FileNotFoundException, IOException {
		
		Pem pemFile = new Pem(key, description);
		pemFile.write(filename);
		System.out.println(String.format("EC ��ȣŰ�� %s��(��) %s ���Ϸ� �����½��ϴ�.", description, filename));
	
	}
		
	
	
}
