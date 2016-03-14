class abstract Orang
{
	private String nama;
	private String identitas;

	public Orang (String nama, String identitas)
	{
		this.nama = nama
		this.identitas = identitas;
	}

	public void setNama (String nama)
	{
		this.nama = nama;
	}

	public String getNama()
	{
		return nama;
	}

	public void setIdentitas (String identitas)
	{
		this.identitas = identitas;
	}

	public String getIdentitas()
	{
		return identitas;
	}

	public String toString()
	{
		return String.format (getNama(),getIdentitas());
	}
}