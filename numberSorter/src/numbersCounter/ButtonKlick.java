package numbersCounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonKlick implements ActionListener {

	MainWindow mw;

	public ButtonKlick(MainWindow mw)
		{
			this.mw = mw;
		};

	@Override
	public void actionPerformed(ActionEvent e)
		{
			System.out.println("erfolgreicher Klick");
		}

}
