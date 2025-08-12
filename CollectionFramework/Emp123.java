package CollectionFramework;

import java.util.Objects;

public class Emp123 
{
     @Override
	public int hashCode() {
		return 31*id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp123 other = (Emp123) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	int id;
     String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp123(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
