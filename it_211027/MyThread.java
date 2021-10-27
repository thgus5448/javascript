package thread;

import javax.swing.JTextArea;

public class MyThread implements Runnable{
	
	
	
	public MyThread MyThread new Runnable() {
		
		JTextArea ta;
		String irum;
		
		public void run(JTextArea ta) {
			this.ta = ta;
			this.irum = irum;
		}
	}
	
	
	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++) {
			ta.append(irum + " : " + i + "\n");
		}
	}
}
