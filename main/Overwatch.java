package main;

import win.Window;

import javax.swing.JOptionPane;

import nwork.*;

public class Overwatch {
	
	//Instance Variables
	private Window _w;
	private int _wins = 0;
	private int _losses = 0;
	private int _numGames = 0;
	private int _pointValue = 0;
	private int _newpointValue = 0;
	private int x;
	private boolean _alwaysTrue = true;
	
	//Button options
	private static final String[] CHOICE = { "High", "Low", "Exit" };
	private static final String[] YESNO = { "Yes", "No" };
	
	
	
	//This method introduces the player and asks if the player would like to verify the deck of cards
	
	public Overwatch() { 
		_w = new Window();
		_w.msg("Welcome to a really boring game that is decided off of luck, I hope you have a lot!");
		int i = _w.option(YESNO, "Care to see the deck? (it is pain, just for the grader)");
		if(i == 0) {
			checkdeck();
			
			while(_alwaysTrue) {
				checkLoss();
				deal();
				
			}
		}
		else {
			while(_alwaysTrue) {
				checkLoss();
				deal();
				
			}
		}
			
	}

	
	//This method checks if the player were to lose
	public void checkLoss(){
		if(_losses == 3) {
			_w.msg("YOU LOSE");
			int i = _w.option(YESNO, "Care to play again?");
			if(i == 0) {
				new Overwatch();
			}
			else {
				_w.msg("See Ya!");
				System.exit(0);
			}
		}	
	}
	
	//This method displays all the cards in the deck
	public void checkdeck() { //show every card in order
		JOptionPane.showOptionDialog(null, null, "Card1", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.acespade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card2", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twospade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card3", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threespade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card4", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card5", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fivespade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card6", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card7", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card8", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card9", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.ninespade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card10", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card11", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card12", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card13", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kspade, null, null);
		JOptionPane.showOptionDialog(null, null, "Card14", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.acediamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card15", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twodiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card16", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threediamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card17", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card18", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fivediamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card19", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card20", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevendiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card21", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card22", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.ninediamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card23", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tendiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card24", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card25", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card26", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kdiamond, null, null);
		JOptionPane.showOptionDialog(null, null, "Card27", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.aceclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card28", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twoclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card29", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threeclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card30", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card31", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fiveclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card32", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card33", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card34", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card35", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.nineclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card36", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card37", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card38", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card39", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kclub, null, null);
		JOptionPane.showOptionDialog(null, null, "Card40", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.aceheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card41", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twoheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card42", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threeheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card43", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card44", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fiveheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card45", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card46", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card47", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card48", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.nineheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card49", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card50", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card51", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qheart, null, null);
		JOptionPane.showOptionDialog(null, null, "Card52", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kheart, null, null);
		
			
	}

	//This method deals the card and depending on the random card it checks the player response and says if you won or lost
	public void deal() {
		int x = (int) (Math.random() * 52);
		if (x == 0) {
			int y = JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.twospade, CHOICE, CHOICE[0]); //ace spades at 39
			 _pointValue = 2;
			 if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 1) {
			int y = JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.threespade, CHOICE, CHOICE[0]);
			 _pointValue = 3;
			 if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 2) {
			int y = JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fourspade, CHOICE, CHOICE[0]);
			 _pointValue = 4;
			 if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 3) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fivespade, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 4) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sixspade, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 5) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sevenspade, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 6) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.eightspade, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 7) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.ninespade, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 8) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.tenspade, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 9) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Jspade, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 10) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Qspade, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 11) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Kspade, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 12) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.aceheart, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 13) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.twoheart, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 14) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.threeheart, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 15) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fourheart, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 16) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fiveheart, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 17) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sixheart, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 18) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sevenheart, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 19) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.eightheart, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 20) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.nineheart, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 21) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.tenheart, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 22) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Jheart, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 23) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Qheart, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 24) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Kheart, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 25) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.acediamond, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 26) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.twodiamond, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 27) {
			int y =	JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.threediamond, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 28) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fourdiamond, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 29) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fivediamond, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 30) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sixdiamond, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 31) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sevendiamond, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 32) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.eightdiamond, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 33) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.ninediamond, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 34) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.tendiamond, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 35) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Jdiamond, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 36) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Qdiamond, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 37) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Kdiamond, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 38) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.aceclub, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 39) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.acespade, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 40) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.twoclub, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 41) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.threeclub, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 42) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fourclub, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 43) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.fiveclub, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 44) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sixclub, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 45) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.sevenclub, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 46) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.eightclub, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 47) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.nineclub, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 48) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.tenclub, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 49) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Jclub, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		} 
		else if (x == 50) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Qclub, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}

		else if (x == 51) {
			int y =JOptionPane.showOptionDialog(null, "You have " + _wins + " wins " + "and " + _losses + " losses " + "out of " + _numGames + " games." , "Is the next card Higher or Lower?", JOptionPane.PLAIN_MESSAGE,
					JOptionPane.PLAIN_MESSAGE, imag.Kclub, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if(y == 0) {
				 _newpointValue = (int) (1 + Math.random() * 13);
					_numGames++;
					if(_pointValue > _newpointValue ) {
						
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {		
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else if(y == 1) {
					_numGames++;
					if(_pointValue < _newpointValue) {
						_losses++;
						_w.msg("DARN! You were wrong!");
					}
					else {
						_wins++;
						_w.msg("NICE! You were right!");			
					}
				}
				else {
					_w.msg("See Ya!");
					System.exit(0);
				}
		}
	}	
}
