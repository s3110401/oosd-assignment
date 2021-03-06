/*
 * Author: Sokun CHORN
 * Student Number: s3338291
 */
package chess.mvc.models;

import chess.prototype.observer.ChessEvent;

public class PieceMovedEvent implements ChessEvent {
	private int newPosition;
	private int previousPosition;

	public PieceMovedEvent(int previousPosition, int newPosition) {
		super();
		this.newPosition = newPosition;
		this.previousPosition = previousPosition;
	}

	public int getNewPosition() {
		return newPosition;
	}

	public int getPreviousPosition() {
		return previousPosition;
	}
}
