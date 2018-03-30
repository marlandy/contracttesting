/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.marlandy.contracttesting.awesomesite.common.exception;

import es.marlandy.contracttesting.awesomesite.order.api.controller.ErrorResponse;

/**
 *
 * @author marlandy
 */
public class ErrorResponseException extends RuntimeException{
	
	private final ErrorResponse errorResponse;

	public ErrorResponseException(ErrorResponse errorResponse){
		this.errorResponse = errorResponse;
	}

	public ErrorResponse getErrorResponse(){
		return errorResponse;
	}
	
	
}
