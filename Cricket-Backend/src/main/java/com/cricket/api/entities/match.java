package com.cricket.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="cricket_matches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlingTeam;

    private String bowlingTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

     @Enumerated
    private matchStatus status;

     private Date date = new Date();

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status = matchStatus.LIVE;
        } else {
            this.status = matchStatus.COMPLETED;
        }
    }



}
