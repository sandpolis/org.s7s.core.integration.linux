//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
open module com.sandpolis.core.integration.linux {
	exports com.sandpolis.core.integration.linux.if_packet;
	exports com.sandpolis.core.integration.linux.if_ether;
	exports com.sandpolis.core.integration.linux.if_arp;
	exports com.sandpolis.core.integration.linux.socket;
	exports com.sandpolis.core.integration.linux.inet;

	requires jdk.incubator.foreign;
}
