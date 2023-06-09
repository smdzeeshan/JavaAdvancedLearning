package com.lsp3;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
	public static void main(String[] args) {
		List<MediaPlayer> allPlayers = new ArrayList<MediaPlayer>();
		allPlayers.add(new VlcMediaPlayer());
		allPlayers.add(new DivMediaPlayer());
		playVideoInAllMediaPlayers(allPlayers);
		System.out.println("---------------------------");
		allPlayers.add(new WinampMediaPlayer());
		playVideoInAllMediaPlayers(allPlayers);
	}

	private static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) {
		for (MediaPlayer player : allPlayers) {
			player.playVideo();
		}
	}
}
