package voting_app;

public class Voter {
	private int voter_id;
	private String name;
	private String state;
	private String district;
	private int age;
	
	
	public int getVoter_id() {
		return voter_id;
	}


	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Voter [voter_id=" + voter_id + ", name=" + name + ", state=" + state + ", district=" + district
				+ ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Voter vote =new Voter();
		System.out.println(vote);
	}

}
