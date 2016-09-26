package org.mnr.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;
import java.util.Vector;

public class FileReadTest {
	public static void main(String...args) throws IOException, ClassNotFoundException{
		
		String fileData="";
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\naveen.reddy\\Desktop\\TestFile.txt","r");
//		fileData = raf.readLine();
//		fileData = raf.readLine();
//		StringTokenizer st  = new StringTokenizer(fileData,"|");
//		for(int i=1;i<=15;i++)
//			st.nextToken();
		
//		System.out.println("AccountId:"+st.nextToken());
//		System.out.println("houseBankingId:"+st.nextToken());
		
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("C:\\Users\\naveen.reddy\\Desktop\\TestFile.txt"));
		Vector vec = (Vector)objin.readObject();
//		System.out.println((javax.crypto.SecretKey)vec.elementAt(0));
	}

}
