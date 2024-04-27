import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    public static void main(String[] args){
        JFrame frame=new JFrame("ATM");
        Dimension framesize=new Dimension(600,600);
        frame.setSize(framesize);

        //first panel for choosing language
        JPanel panel1=new JPanel();
        panel1.setSize(framesize);
        panel1.setBackground(Color.lightGray);
        panel1.setLayout( new FlowLayout(FlowLayout.CENTER,10,250));
        panel1.add(new JButton("ENGLISH")); //english button doesn't work
        panel1.add(new JLabel("CHOOSE YOUR LANGUAGE"));
        panel1.add(new JLabel("زبان خود را انتخاب كنيد"));
        JButton persian =new JButton("فارسي");
        panel1.add(persian);
        JPanel panel2=new JPanel();
        persian.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setSize(framesize);
                panel2.setBackground(Color.lightGray);
                frame.remove(panel1);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
            }
        });
        
        //second panel for getting the password
        panel2.setLayout(null);
        JLabel ramz =new JLabel("رمز خود را وارد كنيد:");
        ramz.setBounds(250,100,200,50);
        panel2.add(ramz);
        TextField pass=new TextField();
        pass.setBounds(200,200,200,50);
        panel2.add(pass);
        JButton next=new JButton("ثبت");
        next.setBounds(200,500,200,50);
        panel2.add(next);
        JPanel panel3 =new JPanel();
        next.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setSize(framesize);
                panel3.setBackground(Color.lightGray);
                frame.remove(panel2);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });

        //third panel and its buttons
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,100,160));
        //button1
        JButton jabejaei=new JButton("كارت به كارت");
        panel3.add(jabejaei);
        JPanel kartbkart=new JPanel();
        jabejaei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               kartbkart.setSize(framesize);
                kartbkart.setBackground(Color.lightGray);
                frame.remove(panel3);
                frame.add(kartbkart);
                frame.revalidate();
                frame.repaint();
            }
        });
        kartbkart.setLayout(null);
        JLabel mablagh=new JLabel("مبلغ مورد نظر ر وارد كنيد:");
        mablagh.setBounds(100,200,200,50);
        kartbkart.add(mablagh);
        TextField mablaghvared=new TextField();
        mablaghvared.setBounds(300,200,200,50);
        kartbkart.add(mablaghvared);
        JLabel maghsad=new JLabel("شماره كارت مقصد را وارد كنيد:");
        maghsad.setBounds(100,300,200,50);
        kartbkart.add(maghsad);
        TextField maghsadvared=new TextField();
        maghsadvared.setBounds(300,300,200,50);
        kartbkart.add(maghsadvared);
        JButton sabtButton1=new JButton("ثبت");
       sabtButton1.setBounds(200,400,200,50);
        kartbkart.add(sabtButton1);
        JPanel lastpanel=new JPanel();
        sabtButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(kartbkart);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel lastlabel=new JLabel("عمليات با موفقيت انجام شد!");
        lastpanel.setLayout(null);
        lastlabel.setBounds(230,230,250,60);
        lastpanel.add(lastlabel);
        JButton back = new JButton("بازگشت");
        back.setBounds(200,500,200,50);
        kartbkart.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(kartbkart);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });


        //button2
        JButton mojodi=new JButton("اعلام موجودي");
        panel3.add(mojodi);
        JPanel mojodiKart=new JPanel();
        mojodi.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mojodiKart.setSize(framesize);
                mojodiKart.setBackground(Color.lightGray);
                frame.remove(panel3);
                frame.add(mojodiKart);
                frame.revalidate();
                frame.repaint();
            }
        });
        mojodiKart.setLayout(null);
        JLabel mandeHesab=new JLabel("موجودي حساب شما : ١،٦٥٣،٤٣٧،٨٠٦ ريال");
        mandeHesab.setBounds(200,230,300,50);
        JButton back2 = new JButton("بازگشت");
        back2.setBounds(210,300,200,50);
        mojodiKart.add(back2);
        mojodiKart.add(mandeHesab);
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mojodiKart);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        lastpanel.setLayout(null);
        lastlabel.setBounds(230,230,250,60);
        lastpanel.add(lastlabel);
        JButton sabtButton3=new JButton("ثبت");
        sabtButton3.setBounds(210,400,200,50);
        mojodiKart.add(sabtButton3);
        sabtButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(mojodiKart);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        //button3
        JButton taghir=new JButton("تغيير رمز");
        panel3.add(taghir);
        JPanel taghirRamz=new JPanel();
        taghir.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taghirRamz.setSize(framesize);
                taghirRamz.setBackground(Color.lightGray);
                frame.remove(panel3);
                frame.add(taghirRamz);
                frame.revalidate();
                frame.repaint();
            }
        });
        taghirRamz.setLayout(null);
        JLabel newpass =new JLabel("رمز جديد را وارد كنيد:");
        newpass.setBounds(250,100,200,50);
        taghirRamz.add(newpass);
        TextField enterpass=new TextField();
        enterpass.setBounds(200,200,200,50);
        taghirRamz.add(enterpass);
        JButton sabtButton2=new JButton("ثبت");
       sabtButton2.setBounds(200,400,200,50);
        taghirRamz.add(sabtButton2);
        JButton back3 = new JButton("بازگشت");
        back3.setBounds(200,500,200,50);
        taghirRamz.add(back3);
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(taghirRamz);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        sabtButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(taghirRamz);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });


        //button4
        JButton bardasht=new JButton("برداشت وجه");
        panel3.add(bardasht);
        JPanel bardashtvajh=new JPanel();
        bardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bardashtvajh.setSize(framesize);
               bardashtvajh.setBackground(Color.lightGray);
                frame.remove(panel3);
                frame.add(bardashtvajh);
                frame.revalidate();
                frame.repaint();
            }
        });
       bardashtvajh.setLayout( new FlowLayout(FlowLayout.CENTER,200,160));
       JButton one=new JButton("500000");
       JButton two=new JButton("1000000");
       JButton three=new JButton("1500000");
       JButton four=new JButton("2000000");
        JButton back4= new JButton("بازگشت");
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(bardashtvajh);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
       bardashtvajh.add(one);
       one.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               lastpanel.setSize(framesize);
               lastpanel.setBackground(Color.lightGray);
               frame.remove(bardashtvajh);
               frame.add(lastpanel);
               frame.revalidate();
               frame.repaint();
           }
       });
       bardashtvajh.add(two);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(bardashtvajh);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });
       bardashtvajh.add(three);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(bardashtvajh);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });
       bardashtvajh.add(four);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastpanel.setSize(framesize);
                lastpanel.setBackground(Color.lightGray);
                frame.remove(bardashtvajh);
                frame.add(lastpanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        bardashtvajh.add(back4);
        lastpanel.setLayout(null);
        lastlabel.setBounds(230,230,250,60);
        lastpanel.add(lastlabel);
        frame.add(panel1);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }}