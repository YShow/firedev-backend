package com.firedev.backend.dto;

/**
 * Used for every dto paylod that we send encapsulating its object inside
 *
 */
public record Payload<T>(T content) {

    public static <T> Payload<T> of(T content) {
	return new Payload<>(content);
    }

}
