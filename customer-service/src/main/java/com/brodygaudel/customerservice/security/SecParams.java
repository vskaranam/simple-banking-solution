package com.brodygaudel.customerservice.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Getter
@Component
public class SecParams {

    @Value("${secret}")
    private String secret;

    @Value("${expired-time}")
    private Long expiredTime;

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Long getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
	}
    
    
}
