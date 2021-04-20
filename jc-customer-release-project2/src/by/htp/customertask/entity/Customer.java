package by.htp.customertask.entity;

public class Customer {
	public int id;
	public String name;
	public String surname;
	public String secondname;
	public String adress;
	public long cardnumber;
	public long banknumber;

	public Customer(int id, String name, String surname, String secondname, String adress, long cardnumber,
			long banknumber) {
		this.id = id;
		this.adress = adress;
		this.banknumber = banknumber;
		this.name = name;
		this.surname = surname;
		this.secondname = secondname;
		this.cardnumber = cardnumber;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return secondname;
	}

	public void setPatronymic(String secondname) {
		this.secondname = secondname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public long getBanknumber() {
		return banknumber;
	}

	public void setBanknumber(long banknumber) {
		this.banknumber = banknumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + (int) (banknumber ^ (banknumber >>> 32));
		result = prime * result + (int) (cardnumber ^ (cardnumber >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((secondname == null) ? 0 : secondname.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (banknumber != other.banknumber)
			return false;
		if (cardnumber != other.cardnumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (secondname == null) {
			if (other.secondname != null)
				return false;
		} else if (!secondname.equals(other.secondname))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", secondname=" + secondname
				+ ", adress=" + adress + ", cardnumber=" + cardnumber + ", banknumber=" + banknumber + "]";
	}

}
