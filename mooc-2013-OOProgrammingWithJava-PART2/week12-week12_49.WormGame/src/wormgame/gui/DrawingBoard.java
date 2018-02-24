/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Container;
import wormgame.game.WormGame;
import wormgame.domain.Worm;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
/**
 *
 * @author Syn
 */
public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame game;
    private int pieceLength;

    public DrawingBoard(WormGame game, int pieceLength){
        this.game = game;
        this.pieceLength = pieceLength;
        super.setBackground(Color.WHITE);
    }
    
 
    
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Worm worm = this.game.getWorm();
        List<Piece> pieces = worm.getPieces();
        graphics.setColor(Color.BLACK);
        for(Piece p : pieces){
            graphics.fill3DRect(p.getX() * this.pieceLength, p.getY() * this.pieceLength, this.pieceLength, this.pieceLength, true);
            
        }
        
        Apple apple = this.game.getApple();
        graphics.setColor(Color.RED);
        graphics.fillOval(apple.getX() * this.pieceLength, apple.getY() * this.pieceLength, this.pieceLength, this.pieceLength);
    }
    
    public void update(){
        super.repaint();
    }
}
