package org.astonbitecode.osgi.serviceProvider.service.impl;

import org.astonbitecode.osgi.serviceProvider.service.MyService;

public class MyServiceImpl implements MyService {
	@Override
	public String getName() {
		return "MyService says hi!";
	}
}
