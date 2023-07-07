package com.fas.farmer.entities;

import com.fas.farmer.constants.ComplaintStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplaintTest {

    @Test
    public void testGetFarmerId() {
        Long farmerId = 1L;
        Complaint complaint = new Complaint();
        complaint.setFarmerId(farmerId);
        assertEquals(farmerId, complaint.getFarmerId());
    }

    @Test
    public void testGetComplaintDescription() {
        String complaintDescription = "This is a complaint";
        Complaint complaint = new Complaint();
        complaint.setComplaintDescription(complaintDescription);
        assertEquals(complaintDescription, complaint.getComplaintDescription());
    }

//    @Test
//    public void testGetStatus() {
//        ComplaintStatus status = ComplaintStatus.OPEN;
//        Complaint complaint = new Complaint();
//        complaint.setStatus(status);
//        assertEquals(status, complaint.getStatus());
//    }
//
//    @Test
//    public void testEquals() {
//        Complaint complaint1 = new Complaint();
//        complaint1.setFarmerId(1L);
//        complaint1.setComplaintDescription("This is a complaint");
//        complaint1.setStatus(ComplaintStatus.OPEN);
//
//        Complaint complaint2 = new Complaint();
//        complaint2.setFarmerId(1L);
//        complaint2.setComplaintDescription("This is a complaint");
//        complaint2.setStatus(ComplaintStatus.OPEN);
//
//        assertTrue(complaint1.equals(complaint2));
//    }
//
//    @Test
//    public void testNotEquals() {
//        Complaint complaint1 = new Complaint();
//        complaint1.setFarmerId(1L);
//        complaint1.setComplaintDescription("This is a complaint");
//        complaint1.setStatus(ComplaintStatus.OPEN);
//
//        Complaint complaint2 = new Complaint();
//        complaint2.setFarmerId(2L);
//        complaint2.setComplaintDescription("This is a different complaint");
//        complaint2.setStatus(ComplaintStatus.CLOSED);
//
//        assertFalse(complaint1.equals(complaint2));
//    }
//
//    @Test
//    public void testHashCode() {
//        Complaint complaint = new Complaint();
//        complaint.setFarmerId(1L);
//        complaint.setComplaintDescription("This is a complaint");
//        complaint.setStatus(ComplaintStatus.OPEN);
//
//        assertEquals(31, complaint.hashCode());
//    }
//
//    @Test
//    public void testToString() {
//        Long farmerId = 1L;
//        String complaintDescription = "This is a complaint";
//        ComplaintStatus status = ComplaintStatus.OPEN;
//
//        Complaint complaint = new Complaint();
//        complaint.setFarmerId(farmerId);
//        complaint.setComplaintDescription(complaintDescription);
//        complaint.setStatus(status);
//
//        String expectedToString = "Complaint{" +
//                "id=null" +
//                ", farmerId=" + farmerId +
//                ", complaintDescription='" + complaintDescription + '\'' +
//                ", status=" + status +
//                '}';
//
//        assertEquals(expectedToString, complaint.toString());
//    }
}
