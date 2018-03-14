/**
 * 
 */
package JHExam;
import java.util.Date;
/**
 * @author narayana tangudu
 *
 */

	public class PolicyInfo {
	private int policyNumber;
	private String policyHolderName;
	private Date issueDate;
	private Date expireDate;
	private double policyPremium;


	public PolicyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolicyInfo(int policyNumber, String policyHolderName, Date issueDate, Date expireDate, double policyPremium) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.issueDate = issueDate;
		this.expireDate = expireDate;
		this.policyPremium = policyPremium;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + policyNumber;
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
		PolicyInfo other = (PolicyInfo) obj;
		if (policyNumber != other.policyNumber)
			return false;
		return true;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public double getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(double policyPremium) {
		this.policyPremium = policyPremium;
	}

	public String toString() {
		
		return ("Policy [policyNo=" + policyNumber + ", issueDate=" + issueDate + ", expireeDate=" + expireDate +", premium=" + policyPremium);
		
	}
	}