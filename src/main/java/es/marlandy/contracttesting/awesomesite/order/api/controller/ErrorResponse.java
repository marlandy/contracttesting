/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.marlandy.contracttesting.awesomesite.order.api.controller;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marlandy
 */
@XmlRootElement
public class ErrorResponse{
	
	private Integer code;
	
	private String message;

	public ErrorResponse(Integer code, String message){
		this.code = code;
		this.message = message;
	}

	public Integer getCode(){
		return code;
	}

	public void setCode(Integer code){
		this.code = code;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	@Override
	public int hashCode(){
		int hash = 7;
		hash = 41 * hash + Objects.hashCode(this.code);
		hash = 41 * hash + Objects.hashCode(this.message);
		return hash;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final ErrorResponse other = (ErrorResponse) obj;
		if(!Objects.equals(this.message, other.message)){
			return false;
		}
		if(!Objects.equals(this.code, other.code)){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "ErrorResponse{" + "code=" + code + ", message=" + message + '}';
	}	
	
}
