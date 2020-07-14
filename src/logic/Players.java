package logic;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//Comparable для сравнения игроков между собой
public class Players implements Comparable{

    // поле ИД ИГРОКА
    private int playerId;
    // поле ИМЯ
    private String firstName;
    // поле ФАМИЛИЯ
    private String surName;
    // поле ОТЧЕСТВО
    private String patronymic;
    // поле ДАТА РОЖДЕНИЯ
    private Date dateOfBirth;
    // поле ПОЛ
    private char sex;
    // поле В КАКОМ КЛУБЕ ЧИСЛИТСЯ ИГРОК
    private int footballClubId;
    // поле ЗАРПЛАТА ИГРОКА
    private float playerSalary;

    public int getPlayerId() {
        return playerId;
    }

    // ГЕТТЕРЫ И СЕТТЕРЫ ДЛЯ ПОЛЕЙ УКАЗАННЫХ ВЫШЕ
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getFootballClubId() {
        return footballClubId;
    }

    public void setFootballClubId(int footballClubId) {
        this.footballClubId = footballClubId;
    }

    public float getPlayerSalary() {
        return playerSalary;
    }

    public void setPlayerSalary(float playerSalary) {
        this.playerSalary = playerSalary;
    }

// КОНЕЦ ГЕТТЕРОВ И СЕТТЕРОВ

    // DateFormat - класс для преобразования даты
    // в строку в определеннном формате
    @Override
    public String toString() {
        return surName + " " + firstName + " " + patronymic+", "
                + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth)
                + ", ИД футбольного клуба=" + footballClubId + " Зарплата игрока:" + playerSalary;
    }

    //СРАВНЕНИЕ ИГРОКОВ
    @Override
    public int compareTo(Object obj) {
        Collator collator = Collator.getInstance(new Locale("ru"));
        collator.setStrength(Collator.PRIMARY);
        return collator.compare(this.toString(),obj.toString());
    }
}
