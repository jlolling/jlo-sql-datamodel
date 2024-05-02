package de.jlo.sql.model;

import java.util.EventListener;

public interface DatamodelListener extends EventListener {
	
	public void eventHappend(DatamodelEvent event);
	
}
