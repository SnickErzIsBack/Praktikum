package inputOutput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import numbersCounter.MainWindow;

public class KeyKlick implements KeyListener
{
	MainWindow mw;

	public KeyKlick(MainWindow window)
		{
			this.mw = window;
		};

		@Override
		public void keyPressed(KeyEvent e)
		{
			// TODO Auto-generated method stub

	    	int keyCode = e.getKeyCode();
	    	if ((keyCode == KeyEvent.VK_ENTER) &&
	    		 (Numbers.numberList.size()<5) &&
	    			)
			{
	    		
	    	}else {
	    		
	    	}

		}


		@Override
		public void keyReleased(KeyEvent e)
		{
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyTyped(KeyEvent e)
		{
			// TODO Auto-generated method stub
			
		}

}