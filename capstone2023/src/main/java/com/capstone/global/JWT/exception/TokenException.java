package com.capstone.global.JWT.exception;

import com.capstone.global.exception.CustomException;
import com.capstone.global.exception.ErrorCode;

public class TokenException extends CustomException{
	public TokenException(ErrorCode errorCode) {
		super(errorCode);
	}
}