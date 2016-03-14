class Petugas{
	
	private String nama;
	private int id;
	int type;
	int jumlah;

	public Petugas(String nama, int id)
	{
		this.nama = nama;
		this.id = id;
	}

	public void setType (int type)
	{
		if (type >=1 && type < 3)
		{
			this.type = type;
		}
	}

	public void setStatus (String status)   //prosedur untuk menambah status pada peminjam
	{
		this.status = status;
		if (type == 1) 
		{
			System.out.println("Sudah dikembalikan");
		}

		else if (type == 2)
		{
			System.out.println("Belum dikembalikan");
		}
	}

	public int getType ()
	{
		return type;
	}

	public void addBarang (Barang barang)
	{
		this.barang = barang;
		Barang[] barang = new Barang[];
		if (type == 1)
		{
			System.out.println("Barang yang dikurangi sebanyak "+jumlah);
		}
		else if (type == 2)
		{
			System.out.println("Barang yang ditambahkan sebanyak "+jumlah);
		}
	}
}