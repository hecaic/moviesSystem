package cn.he.controller;

public class test {
	public static void main(String[] args) {
		
		String s="2018-04-8 13:41:02";
		java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
			     "yyyy-MM-dd HH:mm:ss");    
			   java.util.Date currentTime = new java.util.Date();    
			   String nowtime = simpleDateFormat.format(currentTime).toString();
			   System.out.println(nowtime);
			   System.out.println( s.compareTo(nowtime) );
	}

}
