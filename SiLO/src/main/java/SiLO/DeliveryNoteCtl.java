/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SiLO;

/**
 *
 * @author VincentT
 */
public class DeliveryNoteCtl {
    
    private DeliveryNoteForm deliveryNoteForm;
    
    public DeliveryNoteCtl(){
        
    }
    
    public DeliveryNoteCtl(DeliveryNoteForm deliveryNoteForm){
        this.deliveryNoteForm = deliveryNoteForm;
    }
    
    public void addNewDeliveryNote(String invoiceNumber, String deliveryNoteNumber, String customerName, String orderDate, 
            String deliveryDate , String status ){
        //insert data ke dbhandler
        deliveryNoteForm.setVisible(false);
        
    }
    
    public void requestDeliveryNoteForm(){
        deliveryNoteForm.setVisible(true);
    }
    
}
