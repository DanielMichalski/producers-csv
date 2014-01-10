package gui.main_frame.controller;

import gui.loading.LoadingFrame;
import gui.zestawienie2.view.Zestawienie2Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController {

    class SluchaczPrzyciskuZad1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    LoadingFrame loadingFrame = new LoadingFrame(1);
                    loadingFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            });
        }
    }


    class SluchaczPrzyciskuZad2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    LoadingFrame loadingFrame = new LoadingFrame(2);
                    loadingFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            });
        }
    }

    class SluchaczPrzyciskuZestawD implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    LoadingFrame loadingFrame = new LoadingFrame(3);
                    loadingFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            });
        }
    }

    public void setZad1Btn(JButton zad1Btn) {
        zad1Btn.addActionListener(new SluchaczPrzyciskuZad1());
    }

    public void setZad2Btn(JButton zad2Btn) {
        zad2Btn.addActionListener(new SluchaczPrzyciskuZad2());
    }

    public void setZestawDBtn(JButton zestawDBtn) {
        zestawDBtn.addActionListener(new SluchaczPrzyciskuZestawD());
    }
}
