//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("com.sandpolis.build.module")
	id("com.sandpolis.build.publish")
	id("com.sandpolis.build.jextract")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.+")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")

	if (project.getParent() == null) {
		implementation("com.sandpolis:core.foundation:+")
	} else {
		implementation(project(":core:com.sandpolis.core.foundation"))
	}
}

jextract {
	invocations = mapOf(
		"linux/if_packet.h" to listOf("jextract", "--source", "-d", "src/gen/java", "-t", "${project.name}.if_packet"),
		"linux/if_ether.h" to listOf("jextract", "--source", "-d", "src/gen/java", "-t", "${project.name}.if_ether"),
		"linux/if_arp.h" to listOf("jextract", "--source", "-d", "src/gen/java", "-t", "${project.name}.if_arp"),
		"sys/socket.h" to listOf("jextract", "--source", "-d", "src/gen/java", "-t", "${project.name}.socket"),
		"arpa/inet.h" to listOf("jextract", "--source", "-d", "src/gen/java", "-t", "${project.name}.inet"),
	)
}
