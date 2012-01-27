package skill.improve;

import javax.swing.JFrame;

public class DrawFirstLine
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 100, 100 );
    f.add( new DrawPanel() );
    f.setVisible( true );
  }
}