package JDBCmaven.onetomany;
import java.util.List;

import javax.persistence.*; 

@Table(name="question")
@Entity

public class question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String qname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="type")
	private List<Answer>answer;
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	
}
