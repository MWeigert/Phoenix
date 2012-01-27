package skill.improve;

import java.awt.Graphics;

import javax.swing.JPanel;

class DrawPanel extends JPanel
{
  @Override
  protected void paintComponent( Graphics g )
  {
    super.paintComponent(g);
    g.drawLine( 10, 10, 10, 450 );
    g.drawRect(20, 20, 10, 5);
    g.drawString("x", 50, 50);
  }
}