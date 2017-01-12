package org.mnr.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitTest {

	public static void main(String[] args) {
//        String blockString ="\\!?,src=,window,location,^,expression,script,javascript,prompt,confirm,alert(,alert,iframe,<a+href,vbscript,onmouseover,onmouseout,onload=,document,eval,&#,body, or ";
		String blockString =" or ";
		List<String> blockList = new ArrayList<String>(Arrays.asList(blockString.split(",")));
        
        System.out.println(blockList);
        System.out.println(blockList.contains("or "));
//        System.out.println(" or ".equals("or"));

	}

}
