package com.ksquareinc.testing.sonartest.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = -4418196726829509582L;
	private String id;
	private String firstName;
    private String lastName;

}
