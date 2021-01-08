package com.example.demo;

import org.springframework.web.multipart.MultipartFile;

public class InventoryUtil {
	  public static boolean hasCSVFormat(MultipartFile file, String type) {
		    if (type.equals(file.getContentType())
		    		|| file.getContentType().equals("application/vnd.ms-excel")) {
		      return true;
		    }

		    return false;
		  }
}
