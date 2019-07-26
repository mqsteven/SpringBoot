package com.neo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User implements Serializable {

	private Long id;
	private String userName;
	private String password;
	private String email;


}

