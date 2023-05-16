package com.lsp3;

public class VideoUnsupportedException extends Exception {

	private static final long s = 1L;

	public VideoUnsupportedException() {
		super("Video not supported...");
	}

}
