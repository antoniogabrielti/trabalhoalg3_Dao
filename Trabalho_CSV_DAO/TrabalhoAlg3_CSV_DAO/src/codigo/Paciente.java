package codigo;


public class Paciente implements Comparable<Paciente> {
	private String rg;
	private String nome;
	private String dataNascimento;
	public Paciente(String rg,String nome,String dataNascimento) {
		this.nome=nome;
		this.rg=rg;
		this.dataNascimento=dataNascimento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public String getRg() {
		return rg;
	}

    @Override
    public int compareTo(Paciente OutroPaciente) {
        return(this.getRg().compareTo(OutroPaciente.getRg()));
    }

    @Override
    public String toString() {
        return "Nome Paciente: "+nome+"\nRg: "+rg+"\nData Nascimento: "+dataNascimento;
    }
    
}
