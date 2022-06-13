package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
������� ���������� ��� �� �������� ������ �����, ������� � ����� � ������� � ������� �� �� ����� CAR_NUMBER. ������ ������ �� ��������� ������: 
�� ���� ��
��������
���-�� ��
�� � - �����
� - �����
*/


public class CarNumberChanger {
	
	final String CAR_NUMBER = "CAR_NUMBER";
	final String regex = "([A-Z][A-Z] ?[0-9][0-9][0-9][0-9] ?[A-Z][A-Z])|([0-9][0-9][0-9]-[0-9][0-9] [A-Z][A-Z])";
	
	public String changeCarNumbers(String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		String replacedText = matcher.replaceAll(CAR_NUMBER);
		return replacedText;
	}

}
