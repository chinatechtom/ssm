package com.huet.entity;

import java.util.ArrayList;

public class Function {

	ArrayList<InputItem> inputList  ;
	
	ArrayList<ParamItem> paramList ;
	
	ArrayList<ColItem> resultList ;
	
	String print ;
	
	String target ;
	
	String refresh ;
	
	String procedure ;
	
	String process ;

	public ArrayList<InputItem> getInputList() {
		return inputList;
	}

	public void setInputList(ArrayList<InputItem> inputList) {
		this.inputList = inputList;
	}

	public ArrayList<ParamItem> getParamList() {
		return paramList;
	}

	public void setParamList(ArrayList<ParamItem> paramList) {
		this.paramList = paramList;
	}

	public ArrayList<ColItem> getResultList() {
		return resultList;
	}

	public void setResultList(ArrayList<ColItem> resultList) {
		this.resultList = resultList;
	}

	public String getPrint() {
		return print;
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
	
	
	

}
