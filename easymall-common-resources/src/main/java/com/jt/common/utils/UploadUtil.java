package com.jt.common.utils;



public class UploadUtil {
	
	public static String getUploadPath(String fileName,String upload){
		
		//根据文件名称,生成hash字符串,截取前8位
		//87ndj33d
		String hash = Integer.toHexString(fileName.hashCode());
		while(hash.length()<8){
			hash += "0";
		}
		for (int i = 0; i < hash.length(); i++) {
			upload += "/"+hash.charAt(i);
		}
		//easymall/8/7/n/d/j/3/3/d
		
		return upload;
	}
}
