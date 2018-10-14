package util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.Key;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

// Pem.java 클래스를 다음과 같이 작성해보자. 
//단순히 특정한 개인키 혹은 공개키 정보를 읽어서 저장한 뒤에 파일로 내보내는 역할만을 수행하는 것이다.

public class Pem {
	
	private PemObject pemObject;
	
	// 키 데이터와 키에 대한 설명 정보를 PEM 객체에 저장합니다
	public Pem (Key key, String description){
		this.pemObject = new PemObject(description, key.getEncoded());
	}
	
	// 특정한 파일 이름으로 PEM 파일을 저장합니다.
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
