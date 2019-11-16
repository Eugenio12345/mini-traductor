package com.translate.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.translate.api.translate.GoogleTranslate;

public class TranslateBussines {

	Logger LOGGER = Logger.getAnonymousLogger();
	public String getFinalMessage(String source, String target, String text){
		String message = "";
		try {
			source = this.validateLanguage(source);
			target = this.validateLanguage(target);
			String idioma = GoogleTranslate.detectLanguage(text);
			LOGGER.info("Detectando lenguaje: "+ idioma);
			LOGGER.info("source:::: "+source);
			LOGGER.info("target:::: "+target);
			message = GoogleTranslate.translate(source, target, text);
		} catch (IOException e) {
			message ="Ocurrio un error al traducir, motivo: "+e.getMessage();
		}
		return message;
	}
	
	public String validateLanguage(String text){
		Map<String, String>languages = new HashMap<>();
		languages.put("Español", "es");
		languages.put("Ingles", "en");
		languages.put("Portugues", "pt");
		languages.put("Frances", "fr");
		languages.put("Aleman", "de");
		
		return languages.get(text);
	}
}
