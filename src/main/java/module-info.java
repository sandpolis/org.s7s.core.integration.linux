//============================================================================//
//                                                                            //
//            Copyright © 2015 - 2022 Sandpolis Software Foundation           //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPLv2. //
//                                                                            //
//============================================================================//
open module org.s7s.core.integration.linux {
	exports org.s7s.core.integration.linux.if_packet;
	exports org.s7s.core.integration.linux.if_ether;
	exports org.s7s.core.integration.linux.if_arp;
	exports org.s7s.core.integration.linux.socket;
	exports org.s7s.core.integration.linux.inet;

	requires jdk.incubator.foreign;
}
