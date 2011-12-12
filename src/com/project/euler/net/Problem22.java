package com.project.euler.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.NameList;

public class Problem22 {
public static void main(String args []) throws IOException
{

	List<String> NamesList = new ArrayList<String>();
	FileInputStream in = new FileInputStream("names.txt");
	InputStreamReader ir = new InputStreamReader(in);
	
	BufferedReader br = new BufferedReader(ir) ;
	String tempString;
	while((tempString = br.readLine())!=null)
	{
		
		tempString =	tempString.replaceAll("\"", "");
		NamesList = 	Arrays.asList(tempString.split(","));
		
		System.out.println(tempString.split(" "));
		
		
	}
	
	
	
	Collections.sort(NamesList);
	System.out.println(	NamesList.get(937));;
	int sum = 0;
	
	for(int i = 0; i< NamesList.size();i++)
	{
		
	sum = sum + Util.NameScore(NamesList.get(i))*(i+1);
		
	}
	//sum = sum - (2*'a'  -'"'-'"'); //for extra two quotes, at the beginnig of first name and the ending of last
	System.out.println(sum);

}

}
