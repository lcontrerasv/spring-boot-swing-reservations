package pl.dmichalski.reservations.business.ui.address.view;

import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.util.ConstMessages;

import javax.swing.*;

@Component
public class AddressTableBtnPanel extends JPanel {

    private JButton addBtn;
    private JButton removeBtn;

    public AddressTableBtnPanel() {
        initComponents();
    }

    private void initComponents() {
        addBtn = new JButton(ConstMessages.Labels.ADD_BTN);
        add(addBtn);

        removeBtn = new JButton(ConstMessages.Labels.REMOVE_BTN);
        add(removeBtn);
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public JButton getRemoveBtn() {
        return removeBtn;
    }

}