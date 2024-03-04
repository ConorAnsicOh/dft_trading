package com.dft.trading.common.util;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

import com.google.common.hash.Hashing;

public class Sha256Util {
	private static final SecureRandom random = new SecureRandom();
	
	public static String getSalt() {
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		
		return java.util.Base64.getEncoder().encodeToString(salt);
	}
	
	public static String sha256Encode(String plainText, String salt) {
		
		return Hashing.sha256()
				.hashString(plainText + salt, StandardCharsets.UTF_8)
				.toString();
	}
}
