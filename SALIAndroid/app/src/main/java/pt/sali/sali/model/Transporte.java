package pt.sali.sali.model;

public class Transporte {

	private String id;
	private boolean comAmbulancia;
	private boolean comMedico;
	
	public Transporte(boolean comAmbulancia, boolean comMedico) {
		super();
		this.id = null;
		this.comAmbulancia = comAmbulancia;
		this.comMedico = comMedico;
	}

	public Transporte() {
		super();
	}

	public boolean isComAmbulancia() {
		return comAmbulancia;
	}

	public void setComAmbulancia(boolean comAmbulancia) {
		this.comAmbulancia = comAmbulancia;
	}

	public boolean isComMedico() {
		return comMedico;
	}

	public void setComMedico(boolean comMedico) {
		this.comMedico = comMedico;
	}

	public String getId() {
		return id;
	}

}
