//BIBLIOTEKI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {

        //ZMIENNE
        final double[] memLiczba = {0};
        final char[] buttonClicked = {' '};
        final boolean[] darkMode = {false};

        //OKNO
        CalcFrame win = new CalcFrame();

        //POLE NA LICZBĘ
        JLabel liczba = new JLabel("0");
        liczba.setBounds(2, -2, 110, 30);

        //PRZYCISKI
        //...LICZBY
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        //...FUNKCJE
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bRownosc = new JButton("=");
        JButton bPrzecinek = new JButton(",");
        JButton bRazy = new JButton("×");
        JButton bDzielenie = new JButton("÷");
        JButton bPierw = new JButton("√");
        JButton bClear = new JButton("C");
        JButton bPM = new JButton("±");
        JButton bDarkMode = new JButton("DM");
        JButton bDel = new JButton("<");

        {

            b0.setBackground(Color.lightGray);
            b1.setBackground(Color.lightGray);
            b2.setBackground(Color.lightGray);
            b3.setBackground(Color.lightGray);
            b4.setBackground(Color.lightGray);
            b5.setBackground(Color.lightGray);
            b6.setBackground(Color.lightGray);
            b7.setBackground(Color.lightGray);
            b8.setBackground(Color.lightGray);
            b9.setBackground(Color.lightGray);

            bClear.setBackground(Color.lightGray);
            bDarkMode.setBackground(Color.lightGray);
            bDel.setBackground(Color.lightGray);
            bDzielenie.setBackground(Color.lightGray);
            bMinus.setBackground(Color.lightGray);
            bPierw.setBackground(Color.lightGray);
            bPlus.setBackground(Color.lightGray);
            bPM.setBackground(Color.lightGray);
            bPrzecinek.setBackground(Color.lightGray);
            bRazy.setBackground(Color.lightGray);
            bRownosc.setBackground(Color.lightGray);

            b0.setFocusable(false);
            b1.setFocusable(false);
            b2.setFocusable(false);
            b3.setFocusable(false);
            b4.setFocusable(false);
            b5.setFocusable(false);
            b6.setFocusable(false);
            b7.setFocusable(false);
            b8.setFocusable(false);
            b9.setFocusable(false);

            bClear.setFocusable(false);
            bDarkMode.setFocusable(false);
            bDel.setFocusable(false);
            bDzielenie.setFocusable(false);
            bMinus.setFocusable(false);
            bPierw.setFocusable(false);
            bPlus.setFocusable(false);
            bPM.setFocusable(false);
            bPrzecinek.setFocusable(false);
            bRazy.setFocusable(false);
            bRownosc.setFocusable(false);

        }

        //ROZMIAR I POLOZENIE PRZYCISKOW
        bDarkMode.setBounds(120, 3, 55, 20);

        //TWORZENIE PANELU
        JPanel upperPanel = new JPanel(null);
        upperPanel.setSize(100, 10);

        JPanel buttonPanel = new JPanel(new GridLayout(5,4));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        //USTAWIANIE FUNKCJI PRZYCISKOW
        //...LICZBY
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("1");

                } else {

                    liczba.setText(liczba.getText() + "1");

                }

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("2");

                } else {

                    liczba.setText(liczba.getText() + "2");

                }

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("3");

                } else {

                    liczba.setText(liczba.getText() + "4");

                }

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("4");

                } else {

                    liczba.setText(liczba.getText() + "4");

                }

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("5");

                } else {

                    liczba.setText(liczba.getText() + "5");

                }

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("6");

                } else {

                    liczba.setText(liczba.getText() + "6");

                }

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("7");

                } else {

                    liczba.setText(liczba.getText() + "7");

                }

            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("8");

                } else {

                    liczba.setText(liczba.getText() + "8");

                }

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0")) {

                    liczba.setText("");
                    liczba.setText("9");

                } else {

                    liczba.setText(liczba.getText() + "9");

                }

            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((liczba.getText()).equals("0")) {

                    liczba.setText("");
                    liczba.setText("0");

                } else {

                    liczba.setText(liczba.getText() + "0");

                }

            }
        });
        //...FUNKCJE
        bPrzecinek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean commaExist = false;

                String strLiczba = liczba.getText();

                for (int i = 0; i < liczba.getText().length(); i++) {

                    if (strLiczba.charAt(i) == '.') {
                        commaExist = true;
                    }

                }

                if (!commaExist) {
                    liczba.setText(liczba.getText() + ".");
                }

            }
        });
        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                liczba.setText("0");

            }
        });
        bPM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!((liczba.getText()).equals("0") || (liczba.getText()).equals("-0") || (liczba.getText()).equals("0.0") || (liczba.getText()).equals("-0.0"))) {
                    String Xliczba = liczba.getText();

                    if (liczba.getText().charAt(0) == '-') {
                        liczba.setText(liczba.getText().substring(1));
                    } else {
                        liczba.setText("-" + liczba.getText());
                    }

                }
            }
        });
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                memLiczba[0] = Double.parseDouble(liczba.getText());
                liczba.setText("0");

                buttonClicked[0] = '+';

                bDzielenie.setEnabled(false);
                bRazy.setEnabled(false);
                bMinus.setEnabled(false);
                bPlus.setEnabled(false);

            }
        });
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                memLiczba[0] = Double.parseDouble(liczba.getText());
                liczba.setText("0");

                buttonClicked[0] = '-';

                bDzielenie.setEnabled(false);
                bRazy.setEnabled(false);
                bMinus.setEnabled(false);
                bPlus.setEnabled(false);

            }
        });
        bRazy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                memLiczba[0] = Double.parseDouble(liczba.getText());
                liczba.setText("0");

                buttonClicked[0] = '*';

                bDzielenie.setEnabled(false);
                bRazy.setEnabled(false);
                bMinus.setEnabled(false);
                bPlus.setEnabled(false);

            }
        });
        bDzielenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                memLiczba[0] = Double.parseDouble(liczba.getText());
                liczba.setText("0");

                buttonClicked[0] = '/';

                bDzielenie.setEnabled(false);
                bRazy.setEnabled(false);
                bMinus.setEnabled(false);
                bPlus.setEnabled(false);

            }
        });
        bRownosc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                bDzielenie.setEnabled(true);
                bRazy.setEnabled(true);
                bMinus.setEnabled(true);
                bPlus.setEnabled(true);
                b0.setEnabled(true);

                double Xliczba = Double.parseDouble(liczba.getText());

                double wynik = 0;

                switch (buttonClicked[0]) {
                    case '+':
                        wynik = memLiczba[0] + Xliczba;
                        break;
                    case '-':
                        wynik = memLiczba[0] - Xliczba;
                        break;
                    case '*':
                        wynik = memLiczba[0] * Xliczba;
                        break;
                    case '/':
                        if (Xliczba != 0 || Xliczba != -0 || Xliczba != 0.0 || Xliczba != -0.0) {
                            wynik = memLiczba[0] / Xliczba;
                        } else {
                            wynik = 0;
                        }
                        break;
                }

                liczba.setText(String.valueOf(wynik));
            }
        });
        bPierw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Double.parseDouble(liczba.getText()) >= 0) {
                    liczba.setText(String.valueOf(Math.sqrt(Double.parseDouble(liczba.getText()))));
                }

            }
        });
        bDarkMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!darkMode[0]) {
                    bDarkMode.setText("LM");
                    upperPanel.setBackground(Color.DARK_GRAY);
                    buttonPanel.setBackground(Color.DARK_GRAY);
                    mainPanel.setBackground(Color.DARK_GRAY);
                    liczba.setForeground(Color.white);
                    darkMode[0] = true;

                    {

                        b0.setBackground(Color.ORANGE);
                        b1.setBackground(Color.ORANGE);
                        b2.setBackground(Color.ORANGE);
                        b3.setBackground(Color.ORANGE);
                        b4.setBackground(Color.ORANGE);
                        b5.setBackground(Color.ORANGE);
                        b6.setBackground(Color.ORANGE);
                        b7.setBackground(Color.ORANGE);
                        b8.setBackground(Color.ORANGE);
                        b9.setBackground(Color.ORANGE);

                        bClear.setBackground(Color.ORANGE);
                        bDarkMode.setBackground(Color.ORANGE);
                        bDel.setBackground(Color.ORANGE);
                        bDzielenie.setBackground(Color.ORANGE);
                        bMinus.setBackground(Color.ORANGE);
                        bPierw.setBackground(Color.ORANGE);
                        bPlus.setBackground(Color.ORANGE);
                        bPM.setBackground(Color.ORANGE);
                        bPrzecinek.setBackground(Color.ORANGE);
                        bRazy.setBackground(Color.ORANGE);
                        bRownosc.setBackground(Color.ORANGE);

                    }

                } else {
                    bDarkMode.setText("DM");
                    upperPanel.setBackground(Color.white);
                    buttonPanel.setBackground(Color.white);
                    mainPanel.setBackground(Color.white);
                    liczba.setForeground(Color.black);
                    darkMode[0] = false;

                    {

                        b0.setBackground(Color.lightGray);
                        b1.setBackground(Color.lightGray);
                        b2.setBackground(Color.lightGray);
                        b3.setBackground(Color.lightGray);
                        b4.setBackground(Color.lightGray);
                        b5.setBackground(Color.lightGray);
                        b6.setBackground(Color.lightGray);
                        b7.setBackground(Color.lightGray);
                        b8.setBackground(Color.lightGray);
                        b9.setBackground(Color.lightGray);

                        bClear.setBackground(Color.lightGray);
                        bDarkMode.setBackground(Color.lightGray);
                        bDel.setBackground(Color.lightGray);
                        bDzielenie.setBackground(Color.lightGray);
                        bMinus.setBackground(Color.lightGray);
                        bPierw.setBackground(Color.lightGray);
                        bPlus.setBackground(Color.lightGray);
                        bPM.setBackground(Color.lightGray);
                        bPrzecinek.setBackground(Color.lightGray);
                        bRazy.setBackground(Color.lightGray);
                        bRownosc.setBackground(Color.lightGray);

                    }

                }

            }
        });
        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (liczba.getText().length() > 0) {
                    liczba.setText(liczba.getText().substring(0, liczba.getText().length() - 1));
                }

                if (liczba.getText().equals("-") || liczba.getText().isEmpty()) {
                    liczba.setText("0");
                }

            }
        });

        //DODAWANIE PRZYCISKÓW
        {

            //1 row
            buttonPanel.add(bClear);
            buttonPanel.add(bPM);
            buttonPanel.add(bDel);
            buttonPanel.add(bDzielenie);

            //2 row
            buttonPanel.add(b7);
            buttonPanel.add(b8);
            buttonPanel.add(b9);

            buttonPanel.add(bRazy);

            //3 row
            buttonPanel.add(b4);
            buttonPanel.add(b5);
            buttonPanel.add(b6);

            buttonPanel.add(bMinus);

            //4 row
            buttonPanel.add(b1);
            buttonPanel.add(b2);
            buttonPanel.add(b3);

            buttonPanel.add(bPlus);

            //5 row
            buttonPanel.add(bPrzecinek);
            buttonPanel.add(b0);
            buttonPanel.add(bPierw);
            buttonPanel.add(bRownosc);

            upperPanel.add(liczba);
            upperPanel.add(bDarkMode);

        }

        mainPanel.add(upperPanel);
        mainPanel.add(buttonPanel);

        win.add(mainPanel);
        win.setVisible(true);

    }
}

/*

    Tytuł: Kalkulator podstawowy

    Autor: Maciej Sepeta

    Opis: Kalkulator zawiera podstawowe funkcje do obliczeń matematycznych

        PROCES TWORZENIA:
     stowrzenie okienka > stworzenie guzików > ustawienie wymiarówi lokacji guzików >
     ustawienie funkcji guzików > dodawanie przycisków do okienka > GOTOWE! :D

        DOSTĘPNE GUZIKI:
     1-9, czyszczenie, ciemny/jasny motyw, dodawanie, odejmowanie, mnożenie,
     dzielenie, równa się, pierwiastek, przecinek, zmiana znaku, usuwanie znaku

     ver. 0.1.1

     Nowości:
     0.1.0
     0.1.1
        - poprawiono znak:
            zmiany znaku,
            mnożenia,
            dzielenia,
            pierwiastka,
        - poprawienie błędów
    0.1.2
        - zmieniono wygląd przycisków DarkMode i LightMode
        - zoptymalizowano kod

*/