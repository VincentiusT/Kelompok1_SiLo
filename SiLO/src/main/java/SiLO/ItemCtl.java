/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SiLO;

/**
 *
 * @author feral
 */
public class ItemCtl {

    public void requestNewItemForm(ItemForm addNewItemForm) {
//        mainpage.addNewItem.setVisible(true);
    }
    
    public void submit(String barcode,String description, String manufacturer, String title, String url){
//        mainpage.addNewItem.setVisible(false);
        dbhandler.insertData(barcode, description, manufacturer, title, url);
//        mainpage.refreshItemList();
    }
    
    private DBHandler dbhandler;
    private Mainpage mainpage;
}
