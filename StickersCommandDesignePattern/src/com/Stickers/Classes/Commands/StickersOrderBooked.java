package com.Stickers.Classes.Commands;

import com.Stickers.Classes.Sticker;
import com.Stickers.Interfaces.StickerCommands;

public class StickersOrderBooked implements StickerCommands{

	private Sticker stickerObject;

	public StickersOrderBooked(Sticker stickerObject) {
		super();
		this.stickerObject = stickerObject;
	}

	@Override
	public void executeCommand() {
		this.stickerObject.bookOrderStickers();
	}
}
