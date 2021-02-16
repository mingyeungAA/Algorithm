package �űԾ��̵���õ;

//https://programmers.co.kr/learn/courses/30/lessons/72410

class NewIDRecommand {
	//īī�� ���̵� ��Ģ�� ���� �ʴ� ���̵� �Է����� ��, 
	//�Էµ� ���̵�� �����ϸ鼭
	//��Ģ�� �´� ���̵� ��õ���ִ� ���α׷�
	
	//���̵� ���̴� 3-15��
	//���ĺ� �ҹ���, ����, ����, �����, ��ħǥ�� ��밡��
	//��ħǥ�� ó���� ��, �������� ���Ұ�
	
	public static String solution(String new_id) {
		String answer = "";
		
		//1.��� ���� �ҹ��ڷ� ġȯ
		new_id = new_id.toLowerCase();
		
		//2.�ҹ���, ����, ����, �����, ��ħǥ�� ������ ��� ���� ����
		for(int i=0; i<new_id.length(); i++) {
			char c = new_id.charAt(i); //�ѱ��ڸ� charŸ������ ��ȯ
			if(c>='a' && c<='z') {
				answer += String.valueOf(c); 
			}else if(c >= '0' && c<='9') {
				answer += String.valueOf(c);
			}else if(c == '.' || c == '-' || c == '_') {
				answer += String.valueOf(c);
			}
		}
		
		//3.��ħǥ 2���̻� ���ӵ� �κ��� �ϳ��� ��ħǥ�� ġȯ
		for(int i=0; i<answer.length(); i++) {
			//���ڿ����� Ư�� ��ġ�� ���ڰ� '.'�̶��, 
			if(answer.charAt(i) == '.') {
				int j = i+1;  //1=0+1
				String dot = ".";
				
				//�ݺ�
				//j�� ���ڿ����̰� �ƴϰ� �Դٰ� ���ڿ��� j��ġ�� ���ڰ� '.'�̸�
				while(j != answer.length() && answer.charAt(j)=='.') {
					dot += "."; //dot�� ��ħǥ�� �ΰ� �ȴ�.
					j++;
				}
				if(dot.length()>1) { //dot�� ���̰� 2 �̻��̸�,
					answer = answer.replace(dot, ".");  //���ڿ� dot�� �ϳ��� ��ħǥ�� �ٲ۴�.
				}
			}
		}
		
		//4.��ħǥ�� ó���̳� ���� ��ġ�ϸ� ����
		if(answer.startsWith(".")) {
			answer = answer.substring(1,answer.length());
		}else if(answer.endsWith(".")) {
			answer = answer.substring(0,answer.length()-1);
		}
		
		//5.���ڿ��̶�� "a"�� ����
		if(answer.length()==0) {
			answer += "a";
		}
		
		//6.���̰� 16���̻��̸�, 15�ڸ� �����ϰ� ������ ����
		//���� ������ ���� ��ħǥ���, ������ ��ħǥ�� ����
		if(answer.length()>15) {
			answer=answer.substring(0,15);
			if(answer.endsWith(".")) {
				answer = answer.substring(0, answer.length()-1);
			}
		}
		
		
		//7.���̰� 2�����϶��, ���������ڸ� ���̰� 3�� �ɶ����� �ݺ��ؼ� ���δ�.
		String last = answer.charAt(answer.length()-1)+"";
		if(answer.length()==2) {
			answer = answer+last;
		}else if(answer.length()==1) {
			answer = answer+last+last;
		}
		
		
		return answer;
	}
	
}
