import util.Util;

public class mini_blockchain_3_5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

        // nonce : 최초 0에서 시작하여 조건을 만족하는 해쉬값을 찾아낼때까지의 1씩 증가하는 계산 회수
		// 문자 하나당 16개 가지수 = 2^4 개
		// 문자 6개가 만들수있는 가지수 = 2^4^6 = 2^24 = 1000만정도
		// 16진수 6자리의 특정문자열을 얻을 확률은 = 1/1000만 = 1/2^24
		// 특정 횟수의 채굴을 진행했을때, 한번 채굴이 될 수있도록 하는 난이도를 작업난이도
		// Proof of Work(POW) : 작업증명알고리즘
		
		String password = "훕스블록체인";
		String getHashPassword = Util.getHash(password).substring(0, 4);
		
		int nonce = 0;
		
		// nonce를 0부터 hash를 돌려서, 안녕 이라는 값의 hash값과 일치할때까지 진행시킨다
		// 10037329 즉 1천만번 정도의 연산끝에 같은게 하나 나왔다.
		while(true) {
		
			
			if(Util.getHash(String.valueOf(nonce)).substring(0,4).equals(getHashPassword)){
				System.out.println("정답 : " + nonce + "의 Hash가 " + password + "과 일치합니다");
				System.out.println("패스워드 \"" + password + "\"" + " 해킹 성공 :: 연산을 멈춥니다.");
				break;
			}
			
			System.out.println(nonce + "의 hash가 " + "\"" + password + "\""+ "의 hash와 일치하지않습니다");
			
			nonce = nonce + 1;
		}
		
	}

}
