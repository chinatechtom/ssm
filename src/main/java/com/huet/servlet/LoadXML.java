package com.huet.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoadXML extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoadXML() {
	}

	public void init(){  
        
        //context-param   
        //System.out.println(this.getServletContext().getInitParameter("contextConfigLocation") );
        // servlet init-param
        //System.out.println(this.getInitParameter("XMLLocation"));
        
        String xmlLocation = this.getInitParameter("XMLLocation") ; 
        String realPath = this.getServletContext().getRealPath("");
        System.out.println(realPath);
        byte [] buff = new byte[1024];
        try {
        	File file = new File(realPath+"\\"+xmlLocation);
        	System.out.println(file.getAbsolutePath());
        	if( file.isDirectory()){
            	File[] fileList = file.listFiles();
            	for(int i =0;i<fileList.length;i++){
        		FileInputStream fin = new FileInputStream(fileList[i]);
        		//System.out.println(fin.read(buff));
            	}
        	}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
    }

	public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
			throws ServletException, IOException {
		System.out.println("doGet");
	}

	public void destory() {
		System.out.println("destory");
	}
}
