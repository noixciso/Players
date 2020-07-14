package logic;

public class FootballClub {
    //поле ИД ФУТБОЛЬНОГО КЛУБА
    private int footballClubId;
    //поле НАЗВАНИЕ ФУТБОЛЬНОГО КЛУБА
    private String footballClubName;
    //поле ИМЯ ГЛАВНОГО ТРЕНЕРА
    private String coachName;
    //поле НАЗВАНИЕ НАЦИОНАЛЬНОГО ЧЕМПИОНАТА В КОТОРОМ ВЫСТУПАЕТ КЛУБ
    private String championship;

    //ГЕТТЕРЫ И СЕТТЕРЫ ДЛЯ ПОЛЕЙ УКАЗАННЫХ ВЫШЕ
    public int getFootballClubId() {
        return footballClubId;
    }

    public void setFootballClubId(int footballClubId) {
        this.footballClubId = footballClubId;
    }

    public String getFootballClubName() {
        return footballClubName;
    }

    public void setFootballClubName(String footballClubName) {
        this.footballClubName = footballClubName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getChampionship() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }
    // КОНЕЦ ГЕТТЕРОВ И СЕТТЕРОВ
}
