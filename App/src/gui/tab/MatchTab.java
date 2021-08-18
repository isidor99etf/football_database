package gui.tab;

import constants.Dimensions;
import database.controller.MatchController;
import gui.component.MatchItemComponent;
import model.Match;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MatchTab extends JComponent {

    private final ArrayList<Match> matches;

    public MatchTab(int leagueId, int seasonId) {

        matches = MatchController.getMatchesForLeagueInSeason(leagueId, seasonId);

        initComponents();
    }

    private void initComponents() {

        GroupLayout groupLayout = new GroupLayout(this);
        GridLayout gridLayout = new GridLayout(matches.size(), 1);

        setLayout(groupLayout);

        JPanel matchesPanel = new JPanel(gridLayout);

        for (Match match : matches) {
            MatchItemComponent matchItemComponent = new MatchItemComponent(match);
            matchesPanel.add(matchItemComponent);
        }

        JScrollPane scrollPane = new JScrollPane(matchesPanel);

        //
        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(scrollPane, Dimensions.TABLE_PANE_WIDTH, Dimensions.TABLE_PANE_WIDTH, Dimensions.TABLE_PANE_WIDTH)
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(scrollPane, Dimensions.TABLE_PANE_WIDTH, Dimensions.TABLE_PANE_WIDTH, Dimensions.TABLE_PANE_WIDTH)
        );

    }
}
