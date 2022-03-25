package JDBCmaven.onetomany;
import javax.persistence.*;

@Table(name="Answer")
@Entity
public class Answer {
	
@Id
@GeneratedValue(strategy=GenerationType.TABLE)

private int id;
private String ans;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
