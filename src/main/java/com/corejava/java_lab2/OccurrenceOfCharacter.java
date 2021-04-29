package com.corejava.java_lab2;

import java.util.Scanner;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countchar(str);

        sc.close();

    }

    static void countchar(String S){
        int count=0;
        int len=0;
        System.out.println("Character Occurrence: ");
		do
		{  
			try
			{
				char[] name=S.toCharArray();
				len=name.length;
				count=0;
				for(int j=0;j<len;j++)
				{
					if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
						count++;
				}
				if(count!=0){
					System.out.println(name[0]+" "+count);
				}
				S=S.replace(""+name[0],"");          
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		while(len!=1);
    }
}
