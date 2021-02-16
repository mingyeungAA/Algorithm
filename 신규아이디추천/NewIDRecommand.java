package 신규아이디추천;

//https://programmers.co.kr/learn/courses/30/lessons/72410

class NewIDRecommand {
	//카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 
	//입력된 아이디와 유사하면서
	//규칙에 맞는 아이디를 추천해주는 프로그램
	
	//아이디 길이는 3-15자
	//알파벳 소문자, 숫자, 빼기, 언더바, 마침표만 사용가능
	//마침표는 처음과 끝, 연속으로 사용불가
	
	public static String solution(String new_id) {
		String answer = "";
		
		//1.모든 문자 소문자로 치환
		new_id = new_id.toLowerCase();
		
		//2.소문자, 숫자, 빼기, 언더바, 마침표를 제외한 모든 문자 제거
		for(int i=0; i<new_id.length(); i++) {
			char c = new_id.charAt(i); //한글자만 char타입으로 변환
			if(c>='a' && c<='z') {
				answer += String.valueOf(c); 
			}else if(c >= '0' && c<='9') {
				answer += String.valueOf(c);
			}else if(c == '.' || c == '-' || c == '_') {
				answer += String.valueOf(c);
			}
		}
		
		//3.마침표 2번이상 연속된 부분을 하나의 마침표로 치환
		for(int i=0; i<answer.length(); i++) {
			//문자열에서 특정 위치의 문자가 '.'이라면, 
			if(answer.charAt(i) == '.') {
				int j = i+1;  //1=0+1
				String dot = ".";
				
				//반복
				//j가 문자열길이가 아니고 게다가 문자열의 j위치의 문자가 '.'이면
				while(j != answer.length() && answer.charAt(j)=='.') {
					dot += "."; //dot는 마침표가 두개 된다.
					j++;
				}
				if(dot.length()>1) { //dot의 길이가 2 이상이면,
					answer = answer.replace(dot, ".");  //문자열 dot를 하나의 마침표로 바꾼다.
				}
			}
		}
		
		//4.마침표가 처음이나 끝에 위치하면 제거
		if(answer.startsWith(".")) {
			answer = answer.substring(1,answer.length());
		}else if(answer.endsWith(".")) {
			answer = answer.substring(0,answer.length()-1);
		}
		
		//5.빈문자열이라면 "a"를 대입
		if(answer.length()==0) {
			answer += "a";
		}
		
		//6.길이가 16자이상이면, 15자를 제외하고 나머지 제거
		//만약 제거후 끝이 마침표라면, 마지막 마침표를 제거
		if(answer.length()>15) {
			answer=answer.substring(0,15);
			if(answer.endsWith(".")) {
				answer = answer.substring(0, answer.length()-1);
			}
		}
		
		
		//7.길이가 2자이하라면, 마지막문자를 길이가 3이 될때까지 반복해서 붙인다.
		String last = answer.charAt(answer.length()-1)+"";
		if(answer.length()==2) {
			answer = answer+last;
		}else if(answer.length()==1) {
			answer = answer+last+last;
		}
		
		
		return answer;
	}
	
}
