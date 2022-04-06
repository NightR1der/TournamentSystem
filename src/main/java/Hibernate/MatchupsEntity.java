package Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Matchups", schema = "Tournament", catalog = "")
public class MatchupsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "Player_1")
    private String player1;
    @Basic
    @Column(name = "Player_2")
    private String player2;
    @Basic
    @Column(name = "Score_1")
    private String score1;
    @Basic
    @Column(name = "Score_2")
    private String score2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchupsEntity that = (MatchupsEntity) o;
        return id == that.id && Objects.equals(player1, that.player1) && Objects.equals(player2, that.player2) && Objects.equals(score1, that.score1) && Objects.equals(score2, that.score2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, player1, player2, score1, score2);
    }
}
