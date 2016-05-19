package com.puff.core;

public class VERSION {
	public final static int MajorVersion = 1;
	public final static int MinorVersion = 2;
	public final static int RevisionVersion = 5;

	public static String getVersionNumber() {
		return VERSION.MajorVersion + "." + VERSION.MinorVersion + "." + VERSION.RevisionVersion;
	}
}
