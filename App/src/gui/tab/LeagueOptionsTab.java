package gui.tab;

import constants.Constants;
import constants.Dimensions;
import constants.TextConstants;
import database.controller.ClubController;
import database.controller.TableController;
import listener.ClubListener;
import model.Club;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LeagueOptionsTab extends JComponent {

    private JLabel addMessageLabel;
    private JLabel removeMessageLabel;
    private JComboBox addClubComboBox;
    private JComboBox removeClubComboBox;
    private JButton addClubButton;
    private JButton removeClubButton;

    private final int leagueId;
    private final int seasonId;

    private final ArrayList<Club> clubs;

    private ClubListener clubListener;

    public LeagueOptionsTab(int leagueId, int seasonId) {

        this.leagueId = leagueId;
        this.seasonId = seasonId;

        clubs = ClubController.getClubs();

        initComponents();
        setListeners();
    }

    public void setClubListener(ClubListener clubListener) { this.clubListener = clubListener; }

    //
    private void initComponents() {

        GroupLayout groupLayout = new GroupLayout(this);
        setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        //
        // add club
        JLabel addClubInLeagueLabel = new JLabel(TextConstants.ADD_CLUB_IN_LEAGUE);
        addClubInLeagueLabel.setFont(new Font(Constants.DEFAULT_FONT, Font.BOLD, 16));

        JLabel clubLabel1 = new JLabel(TextConstants.SELECT_CLUB);

        addMessageLabel = new JLabel();
        addMessageLabel.setHorizontalAlignment(JLabel.CENTER);

        addClubButton = new JButton(TextConstants.BUTTON_ADD_CLUB);

        addClubComboBox = new JComboBox(clubs.toArray());

        JPanel linePanel1 = new JPanel();
        linePanel1.setBackground(new Color(0, 0, 0));

        //
        // remove club
        JLabel removeClubFromLeagueLabel = new JLabel(TextConstants.REMOVE_CLUB_FROM_LEAGUE);
        removeClubFromLeagueLabel.setFont(new Font(Constants.DEFAULT_FONT, Font.BOLD, 16));

        JLabel clubLabel2 = new JLabel(TextConstants.SELECT_CLUB);

        removeMessageLabel = new JLabel();
        removeMessageLabel.setHorizontalAlignment(JLabel.CENTER);

        removeClubButton = new JButton(TextConstants.BUTTON_REMOVE_CLUB);

        removeClubComboBox = new JComboBox(clubs.toArray());

        JPanel linePanel2 = new JPanel();
        linePanel2.setBackground(new Color(0, 0, 0));

        //
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(addClubInLeagueLabel)
                        .addGroup(
                                groupLayout.createSequentialGroup()
                                        .addGap(Dimensions.MARGIN)
                                        .addGroup(
                                                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(clubLabel1)
                                        )
                                        .addGap(Dimensions.MARGIN * 3)
                                        .addGroup(
                                                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(addClubComboBox)
                                        )
                        )
                        .addComponent(addMessageLabel)
                        .addComponent(addClubButton)
                        .addComponent(linePanel1)
                        .addComponent(removeClubFromLeagueLabel) // new
                        .addGroup(
                                groupLayout.createSequentialGroup()
                                        .addGap(Dimensions.MARGIN)
                                        .addGroup(
                                                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(clubLabel2)
                                        )
                                        .addGap(Dimensions.MARGIN * 3)
                                        .addGroup(
                                                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(removeClubComboBox)
                                        )
                        )
                        .addComponent(removeMessageLabel)
                        .addComponent(removeClubButton)
                        .addComponent(linePanel2)
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(addClubInLeagueLabel)
                        .addGroup(
                                groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(clubLabel1)
                                        .addComponent(addClubComboBox, Dimensions.COMBO_BOX_HEIGHT, Dimensions.COMBO_BOX_HEIGHT, Dimensions.COMBO_BOX_HEIGHT)
                        )
                        .addComponent(addMessageLabel)
                        .addGap(Dimensions.MARGIN)
                        .addComponent(addClubButton)
                        .addGap(Dimensions.MARGIN)
                        .addComponent(linePanel1, Dimensions.THICK_LINE_HEIGHT, Dimensions.THICK_LINE_HEIGHT, Dimensions.THICK_LINE_HEIGHT)
                        .addComponent(removeClubFromLeagueLabel) // new
                        .addGroup(
                                groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(clubLabel2)
                                        .addComponent(removeClubComboBox, Dimensions.COMBO_BOX_HEIGHT, Dimensions.COMBO_BOX_HEIGHT, Dimensions.COMBO_BOX_HEIGHT)
                        )
                        .addComponent(removeMessageLabel)
                        .addGap(Dimensions.MARGIN)
                        .addComponent(removeClubButton)
                        .addGap(Dimensions.MARGIN)
                        .addComponent(linePanel2, Dimensions.THICK_LINE_HEIGHT, Dimensions.THICK_LINE_HEIGHT, Dimensions.THICK_LINE_HEIGHT)
        );
    }

    private void setListeners() {

        addClubButton.addActionListener(l -> {

            int index = addClubComboBox.getSelectedIndex();

            int error = TableController.addClubOnTable(leagueId, seasonId, clubs.get(index).getId());

            if (error == 0) {
                addMessageLabel.setText(TextConstants.MESSAGE_CLUB_ADDED_SUCCESSFULLY);
                clubListener.onClubAdded();
            } else
                addMessageLabel.setText(TextConstants.MESSAGE_CLUB_ADDING_ERROR);
        });
    }
}
