package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int teamA3 = 3;
    int teamA2 = 2;
    int teamA1 = 1;
    int scoreTeamB = 0;
    int teamB3 = 3;
    int teamB2 = 2;
    int teamB1 = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A Button from here.
     */

    public void teamA3 (View view) {
        scoreTeamA = scoreTeamA + teamA3;
        displayForTeamA(scoreTeamA);
    }

    public void teamA2 (View view) {
        scoreTeamA = scoreTeamA + teamA2;
        displayForTeamA(scoreTeamA);
    }

    public void teamA1 (View view) {
        scoreTeamA = scoreTeamA + teamA1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Team B Button from here.
     */

    public void teamB3 (View view) {
        scoreTeamB = scoreTeamB + teamB3;
        displayForTeamB(scoreTeamB);
    }

    public void teamB2 (View view) {
        scoreTeamB = scoreTeamB + teamB2;
        displayForTeamB(scoreTeamB);
    }

    public void teamB1 (View view) {
        scoreTeamB = scoreTeamB + teamB1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset
     */

    public void reset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
