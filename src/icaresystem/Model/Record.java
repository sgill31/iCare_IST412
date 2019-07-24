/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.Model;

/**
 *
 * @author ericgutierrez
 */
public class Record {
    /**
     * create a new iCare record
     */
    public Record(int record_id, String recordName) {
        this.record_id = record_id;
        this.recordName = recordName;
    }
    
    private int record_id;
    private String recordName;
    
    void calculateHistory(){
            /**
     * calculates the Record based on History
     */
    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }
    
}
