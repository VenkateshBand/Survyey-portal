package com.cg.beans;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable

public class Option {
	
	private long index;
	@NotNull
	private String optionText;
	public Option() {}
	public Option(Integer index, String optionText)
	{
		super();
		this.index = index;
		this.optionText = optionText;
	}


	public long getIndex() 
	{
		return index;

	}


	public void setIndex(long index)
	{
		this.index = index;

	}


	public String getOptionText() {

		return optionText;
	}


	public void setOptionText(String optionText) {

		this.optionText = optionText;

	}
	@Override
	public String toString() {
		return "Option [index=" + index + ", optionText=" + optionText + "]";
	}


}


