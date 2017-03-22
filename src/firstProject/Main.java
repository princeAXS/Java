package firstProject;

import java.util.*;

class firstClass{
	public char findNonRepeatedChar(String s){
		if(s == null || s.length() == 0)
			return '0';

		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(map.get(ch) == null)
				map.put(ch,1);
			else
				map.put(ch,map.get(ch)+1);
		}
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(map.get(ch) == 1)
				return ch;
		}

		return '0';
	}
}
public class Main {

	public static void main(String[] args) {
		firstClass obj = new firstClass();
		System.out.println(obj.findNonRepeatedChar("airplane"));

	}

}
