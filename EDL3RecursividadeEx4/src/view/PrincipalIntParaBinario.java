package view;
import controller.ControllerIntParaBinario;
import javax.swing.JOptionPane;
public class PrincipalIntParaBinario {
	public static void main (String [] args) {
		
		ControllerIntParaBinario m = new ControllerIntParaBinario();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro até 2000:" ));
		while (num>2000) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente! Precisa ser um número inteiro até 2000:" ));
		}
		String s = String.valueOf(num);
		String resp = m.IntParaBinario(num);
		System.out.println (num + " = " + resp);
		}

}
