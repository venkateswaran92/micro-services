package com.venkat.microservices.bean;

public class LimitConfiguration {

	private int minimum;
	private int maximim;

	public LimitConfiguration(int minimum, int maximim) {
		super();
		this.minimum = minimum;
		this.maximim = maximim;
	}

	LimitConfiguration() {
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximim() {
		return maximim;
	}

	public void setMaximim(int maximim) {
		this.maximim = maximim;
	};

}
