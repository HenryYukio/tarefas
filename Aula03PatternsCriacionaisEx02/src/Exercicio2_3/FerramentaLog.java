package Exercicio2_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class FerramentaLog {
	
	protected DateFormat dateFormat = new SimpleDateFormat("[dd/MM/yyyy, HH:mm:ss:SSS] ");
	
	public abstract void registrarLog(String mensagem);
} 