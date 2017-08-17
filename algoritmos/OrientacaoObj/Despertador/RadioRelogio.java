package Despertador;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RadioRelogio implements Radio, Relogio {
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	private String emissora;
	private String tipoemissora;
	private int volumeRadio;
	private Date horario;
	private Date horarioAlarme;
	private int volumeRelogio;
	
	public String info(){
		String estacao = "";
		estacao += this.getEmissora()+"   "+this.getTipoEmissora();
		return estacao;		
	}
	public String infodesperta(){
		String hora = "";
		hora += sdf.format(this.getHorarioAlarme());
		return hora;
	}

	public RadioRelogio(String emissora, String tipoemissora) {
		this.setEmissora(emissora);
		this.setTipoEmissora(tipoemissora);
	}
	public RadioRelogio(int volume) {
		this.setVolumeRadio(volume);
	}
	public RadioRelogio(Date horario) {
		this.setHorario(horario);
	}
	public  RadioRelogio() {
		
	}
	@Override
	public void LigarAlarme() {
	}

	@Override
	public void DesligarAlarme() {
	}

	// IMPLEMENTAÇÃO DO RADIO
	@Override
	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	@Override
	public String getEmissora() {
		return emissora;
	}

	@Override
	public void setTipoEmissora(String tipoemissora) {
		this.tipoemissora = tipoemissora;
	}

	@Override
	public String getTipoEmissora() {
		return tipoemissora;
	}

	@Override
	public void setVolumeRadio(int volRadio) {
		this.volumeRadio = volRadio;
	}

	@Override
	public int getVolumeRadio() {
		return volumeRadio;
	}

	// IMPLEMENTAÇÃO DO RELOGIO
	@Override
	public void setHorario(Date horario) {
		this.horario = horario;
	}

	@Override
	public Date getHorario() {
		return horario;
	}

	@Override
	public void setHorarioAlarme(Date horarioalarme) {
		this.horarioAlarme = horarioalarme;
	}

	@Override
	public Date getHorarioAlarme() {
		return horarioAlarme;
	}

	@Override
	public void setVolumeRelogio(int volRelogio) {
		this.volumeRelogio = volRelogio;
	}

	@Override
	public int getVolumeRelogio() {
		return volumeRelogio;
	}

}
