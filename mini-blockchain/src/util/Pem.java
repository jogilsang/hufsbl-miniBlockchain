package util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.Key;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

// Pem.java Ŭ������ ������ ���� �ۼ��غ���. 
//�ܼ��� Ư���� ����Ű Ȥ�� ����Ű ������ �о ������ �ڿ� ���Ϸ� �������� ���Ҹ��� �����ϴ� ���̴�.

public class Pem {
	
	private PemObject pemObject;
	
	// Ű �����Ϳ� Ű�� ���� ���� ������ PEM ��ü�� �����մϴ�
	public Pem (Key key, String description){
		this.pemObject = new PemObject(description, key.getEncoded());
	}
	
	// Ư���� ���� �̸����� PEM ������ �����մϴ�.
	public void write(String filename) throws FileNotFoundException,
	IOException {
		PemWriter pemWriter = new PemWriter(new OutputStreamWriter(new FileOutputStream(filename)));
	    try {
	    	pemWriter.writeObject(this.pemObject);
	    }finally {
			pemWriter.close();
		}
	}

}
