package com.translate.api;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.translate.api.translate.GoogleTranslate;

public class TranslateMain  {

	public static void main(String[] args) throws IOException {
	String palabra	= JOptionPane.showInputDialog("Ingresa el dialogo en ingles a traducir");
    String mensajeTraducido = GoogleTranslate.translate("es", palabra);
    JOptionPane.showMessageDialog(null, "Mensaje traducido: "+mensajeTraducido);
	}
}
