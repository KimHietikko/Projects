package fxElokuvat;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/** Tulostuksen oma controlleri
 * @author kimhi
 * @version 14.2.2018
 *
 */
public class TulostusController implements ModalControllerInterface<Object> {

    /**
     * Tulostusalue, mit� halutaan tulostaa
     */
    @FXML TextArea tulostusAlue;
    
    
    /**
     * Sulkee tulostus-ikkunan
     */
    @FXML private void handleOK() {
        ModalController.closeStage(tulostusAlue);
    }
    
    
    /**
     * Tulostaa n�kyv�t tiedot
     */
    @FXML private void handleTulostus() {
        Dialogs.showMessageDialog("Viel� ei osata tulostaa");
    }


    /**
     * Ei k�yt�ss�
     */
    @Override
    public Object getResult() {
        // TODO Auto-generated method stub
        return null;
    }


    /**
     * Ei k�yt�ss�
     */
    @Override
    public void handleShown() {
        // TODO Auto-generated method stub
        
    }


    /**
     * Ei k�yt�ss�
     */
    @Override
    public void setDefault(Object arg0) {
        // TODO Auto-generated method stub
        
    }

}
