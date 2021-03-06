package ru.sfedu.mydiplom.model.dto;

import java.io.Serializable;

/**
 *
 * @author seyran
 */
public class Applications extends GenericDto{
	private float sum;
	private long credit;
	private int maturity;
	private float rate;
	private long date;
	private int status;
	private long clientID;
        private long typeCredit;

    /**
     *
     * @throws java.lang.InterruptedException
     * @throws InterruptedException
     */
    public Applications() throws InterruptedException{
        super(ClassType.APP, 1l);
    }

    /**
     *
     * @param sum
     * @param credit
     * @param maturity
     * @param rate
     * @param date
     * @param status
     * @param clientID
     * @param typeCredit
     * @param id
     * @throws InterruptedException
     */
    public Applications(float sum, long credit, int maturity, float rate, long date, int status, long clientID, long typeCredit, long id) throws InterruptedException {
        super(ClassType.APP, id);
        this.sum = sum;
        this.credit = credit;
        this.maturity = maturity;
        this.rate = rate;
        this.date = date;
        this.status = status;
        this.clientID = clientID;
        this.typeCredit = typeCredit;
    }

    /**
     *
     * @return
     */
    public long getTypeCredit() {
        return typeCredit;
    }

    /**
     *
     * @param typeCredit
     */
    public void setTypeCredit(long typeCredit) {
        this.typeCredit = typeCredit;
    }

    /**
     * @return the sum
     */
    public float getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(float sum) {
        this.sum = sum;
    }

    /**
     * @return the credit
     */
    public long getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(long credit) {
        this.credit = credit;
    }

    /**
     * @return the maturity
     */
    public int getMaturity() {
        return maturity;
    }

    /**
     * @param maturity the maturity to set
     */
    public void setMaturity(int maturity) {
        this.maturity = maturity;
    }

    /**
     * @return the rate
     */
    public float getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(float rate) {
        this.rate = rate;
    }

    /**
     * @return the date
     */
    public long getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(long date) {
        this.date = date;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the clientID
     */
    public long getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    @Override
    public String toString() {
        return "Applications{" + "sum=" + sum + ", credit=" + credit + ", maturity=" + maturity + ", rate=" + rate + ", date=" + date + ", status=" + status + ", clientID=" + clientID + ", typeCredit=" + typeCredit + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Applications other = (Applications) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
