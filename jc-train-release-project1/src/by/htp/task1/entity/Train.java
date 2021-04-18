package by.htp.task1.entity;

public class Train {
	
	public String city;
    public int trainnumber;
    public int date;
    
    
    public Train (String city,int trainnumber,int date) {
    	this.city=city;
    	this.date = date;
    	this.trainnumber=trainnumber;
    	
    }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(int trainnumber) {
		this.trainnumber = trainnumber;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + date;
		result = prime * result + trainnumber;
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
		Train other = (Train) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (date != other.date)
			return false;
		if (trainnumber != other.trainnumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Train [city=" + city + ", trainnumber=" + trainnumber + ", date=" + date + "]";
	}
	
    

	
}
