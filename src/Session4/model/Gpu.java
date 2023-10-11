package Session4.model;

public abstract class Gpu {
	public String name;
	public int vram;

	public Gpu(String name, int vram){
		this.name = name;
		this.vram = vram;
	}
	
	public abstract void assemble();
}

