package SpringJdbc.com.spring.jdbc;


public class Student {
	private int id;
	private String name;
	private String city;
	private String college;
	private String state;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", college=" + college + ", state=" + state
				+ "]";
	}

	public Student(int id, String name, String city, String college, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
		this.state = state;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
