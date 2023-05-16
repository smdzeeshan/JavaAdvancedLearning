package com.lsp3;

public class WinampMediaPlayer extends MediaPlayer {
	public void playVideo() {
		try {
			throw new VideoUnsupportedException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
