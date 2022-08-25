package com.automation.StepDef;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;

import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void Precondition() throws FileNotFoundException, IOException
	{
		{
			DriverUtils.createDriver();
			PropertyReader.initProperty();
		}
		
	}

}
