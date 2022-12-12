/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author meghi
 */
public class Vaccine {
 private int qty;
    private int batchId;
    private String status;
    private String Name;
    
    public Vaccine(int qty,int batchId,String status,String Name){
        this.qty=qty;
        this.batchId=batchId;
        this.Name=Name;
        this.status=status;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    @Override
        public String toString(){
            return Name;
        }
    
}
