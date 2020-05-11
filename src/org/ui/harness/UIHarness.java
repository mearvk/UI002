package org.ui.harness;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class UIHarness
{
    public static class Test01
    {
        public Test01()
        {
            ExtendedJFrame jframe = new ExtendedJFrame();
        }

        public static class ExtendedJFrame extends JFrame
        {
            public ExtendedJPanel01 jpanel01 = new ExtendedJPanel01(this);

            public ExtendedJPanel02 jpanel02 = new ExtendedJPanel02(this);

            public ExtendedJPanel03 jpanel03 = new ExtendedJPanel03(this);

            public ExtendedJFrame()
            {
                new Settings(this);

                new Hierarchy(this);

                new Listeners(this);

                //

                this.getContentPane().add(jpanel01);

                this.getContentPane().add(jpanel02);

                this.getContentPane().add(jpanel03);

                this.getContentPane().setBackground(Color.GRAY.darker().darker());
            }

            public static class Settings
            {
                ExtendedJFrame jframe;

                public Settings(ExtendedJFrame jframe)
                {
                    this.jframe = jframe;

                    this.jframe.setTitle("Java Swing ™");

                    this.jframe.setLayout(new FlowLayout());

                    this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    this.jframe.setSize(new Dimension(1200,800));

                    this.jframe.setVisible(true);
                }
            }

            public static class Hierarchy
            {
                ExtendedJFrame jframe;

                public Hierarchy(ExtendedJFrame jframe)
                {
                    this.jframe = jframe;

                    this.jframe.setJMenuBar(new ExtendedJMenuBar());

                    this.jframe.validate();
                }
            }

            public static class Listeners
            {
                ExtendedJFrame jframe;

                public Listeners(ExtendedJFrame jframe)
                {
                    this.jframe = jframe;
                }
            }
        }

        public static class ExtendedJPanel01 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton01 jbutton01 = new ExtendedJButton01(this);

            public ExtendedJButton02 jbutton02 = new ExtendedJButton02(this);

            public ExtendedJPanel01(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);

                new Hierarchy(this);

                new Listeners(this);
            }

            public static class Settings
            {
                public Settings(ExtendedJPanel01 jpanel01)
                {
                    jpanel01 = jpanel01;

                    jpanel01.setLayout(new FlowLayout());

                    jpanel01.setBackground(new Color(8,8,8 ));
                }
            }

            public static class Hierarchy
            {
                ExtendedJPanel01 jpanel01;

                public Hierarchy(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;

                    this.jpanel01.add(this.jpanel01.jbutton01);

                    this.jpanel01.add(this.jpanel01.jbutton02);
                }
            }

            public static class Listeners
            {
                ExtendedJPanel01 jpanel01;

                public Listeners(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\dota001.png"));

                    graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = 200;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel02 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton03 jbutton03 = new ExtendedJButton03(this);

            public ExtendedJButton04 jbutton04 = new ExtendedJButton04(this);

            public ExtendedJTree jtree = new ExtendedJTree(new DefaultMutableTreeNode("Java Swing ™"));

            public ExtendedJPanel02(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);

                new Hierarchy(this);

                new Listeners(this);
            }

            public static class Settings
            {
                ExtendedJPanel02 jpanel02;

                public Settings(ExtendedJPanel02 jpanel02)
                {
                    this.jpanel02 = jpanel02;

                    this.jpanel02.setLayout(new FlowLayout(FlowLayout.LEFT));

                    this.jpanel02.setBackground(new Color(8,8,8));
                }
            }

            public static class Hierarchy
            {
                ExtendedJPanel02 jpanel02;

                public Hierarchy(ExtendedJPanel02 jpanel02)
                {
                    this.jpanel02 = jpanel02;

                    this.jpanel02.add(this.jpanel02.jtree);
                }
            }

            public static class Listeners
            {
                ExtendedJPanel02 jpanel02;

                public Listeners(ExtendedJPanel02 jpanel02)
                {
                    this.jpanel02 = jpanel02;
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    //image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\supercar002.png"));

                    //graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = this.jframe.getHeight()-284;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel03 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton05 jbutton05 = new ExtendedJButton05();

            public ExtendedJButton06 jbutton06 = new ExtendedJButton06();

            public ExtendedJPanel03(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);

                new Hierarchy(this);

                new Listeners(this);
            }

            public static class Settings
            {
                public ExtendedJPanel03 jpanel03;

                public Settings(ExtendedJPanel03 jpanel03)
                {
                    this.jpanel03 = jpanel03;
                }
            }

            public static class Hierarchy
            {
                public ExtendedJPanel03 jpanel03;

                public Hierarchy(ExtendedJPanel03 jpanel03)
                {
                    this.jpanel03 = jpanel03;
                }
            }

            public static class Listeners
            {
                public ExtendedJPanel03 jpanel03;

                public Listeners(ExtendedJPanel03 jpanel03)
                {
                    this.jpanel03 = jpanel03;
                }
            }
        }

        public static class ExtendedJMenuBar extends JMenuBar
        {
            public ExtendedJMenu01 jmenu01 = new ExtendedJMenu01();

            public ExtendedJMenu02 jmenu02 = new ExtendedJMenu02();

            public ExtendedJMenu03 jmenu03 = new ExtendedJMenu03();

            public ExtendedJMenuBar()
            {
                this.add(jmenu01);

                this.add(jmenu02);

                this.add(jmenu03);

                this.setBorder(new SilentBorder());

                this.setFocusable(false);
            }

            public static class ExtendedJMenu01 extends JMenu
            {
                public ExtendedJMenuItem01 jmenuitem01 = new ExtendedJMenuItem01();

                public ExtendedJMenuItem02 jmenuitem02 = new ExtendedJMenuItem02();

                public ExtendedJMenu01()
                {
                    super("File .");

                    this.add(this.jmenuitem01);

                    this.add(this.jmenuitem02);
                }

                @Override
                public void paintComponent(Graphics graphics)
                {
                    super.paintComponent(graphics);

                    Image image;

                    try
                    {
                        if(this.model.isSelected())
                        {
                            graphics.setColor(new Color(130,130,130));

                            graphics.fillRect(0,0,getWidth()-1, getHeight()-1);
                        }
                        else
                        {
                            graphics.setColor(new Color(48,48,48));

                            graphics.fillRect(0,0,getWidth()+10, getHeight()-1);
                        }

                        graphics.setColor(new Color(148,148,148));

                        graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                        graphics.drawString("File",8,14);
                    }
                    catch (Exception e)
                    {
                        System.err.println(e);
                    }
                }
            }

            public static class ExtendedJMenu02 extends JMenu
            {
                public ExtendedJMenuItem03 jmenuitem03 = new ExtendedJMenuItem03();

                public ExtendedJMenuItem04 jmenuitem04 = new ExtendedJMenuItem04();

                public ExtendedJMenu02()
                {
                    super("Edit ");

                    this.add(this.jmenuitem03);

                    this.add(this.jmenuitem04);
                }

                @Override
                public void paintComponent(Graphics graphics)
                {
                    super.paintComponent(graphics);

                    Image image;

                    try
                    {
                        if(this.model.isSelected())
                        {
                            graphics.setColor(new Color(148,148,148));

                            graphics.fillRect(0,0,getWidth()-1, getHeight()-1);
                        }
                        else
                        {
                            graphics.setColor(new Color(48,48,48));

                            graphics.fillRect(0,0,getWidth()+10, getHeight()-1);
                        }

                        graphics.setColor(new Color(148,148,148));

                        graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                        graphics.drawString("Edit",8,14);
                    }
                    catch (Exception e)
                    {
                        System.err.println(e);
                    }
                }
            }

            public static class ExtendedJMenu03 extends JMenu
            {
                public ExtendedJMenuItem05 jmenuitem05 = new ExtendedJMenuItem05();

                public ExtendedJMenuItem06 jmenuitem06 = new ExtendedJMenuItem06();

                public ExtendedJMenu03()
                {
                    super("Settings ");

                    this.add(this.jmenuitem05);

                    this.add(this.jmenuitem06);
                }

                @Override
                public void paintComponent(Graphics graphics)
                {
                    super.paintComponent(graphics);

                    Image image;

                    try
                    {
                        if(this.model.isSelected())
                        {
                            graphics.setColor(new Color(148,148,148));

                            graphics.fillRect(0,0,getWidth()-1, getHeight()-1);
                        }
                        else
                        {
                            graphics.setColor(new Color(48,48,48));

                            graphics.fillRect(0,0,getWidth()+10, getHeight()-1);
                        }

                        graphics.setColor(new Color(148,148,148));

                        graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                        graphics.drawString("Settings",8,14);
                    }
                    catch (Exception e)
                    {
                        System.err.println(e);
                    }
                }
            }

            public static class ExtendedJMenuItem01 extends JMenuItem
            {
                public ExtendedJMenuItem01()
                {
                    super("ExtendedJMenuItem01");
                }
            }

            public static class ExtendedJMenuItem02 extends JMenuItem
            {
                public ExtendedJMenuItem02()
                {
                    super("ExtendedJMenuItem02");
                }
            }

            public static class ExtendedJMenuItem03 extends JMenuItem
            {
                public ExtendedJMenuItem03()
                {
                    super("ExtendedJMenuItem03");
                }
            }

            public static class ExtendedJMenuItem04 extends JMenuItem
            {
                public ExtendedJMenuItem04()
                {
                    super("ExtendedJMenuItem04");
                }
            }

            public static class ExtendedJMenuItem05 extends JMenuItem
            {
                public ExtendedJMenuItem05()
                {
                    super("ExtendedJMenuItem05");
                }
            }

            public static class ExtendedJMenuItem06 extends JMenuItem
            {
                public ExtendedJMenuItem06()
                {
                    super("ExtendedJMenuItem06");
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    graphics.setColor(new Color(48,48,48));

                    graphics.fillRect(0,0,getWidth()-1, getHeight()-1);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }
        }

        public static class ExtendedJButton01 extends JButton
        {
            public ExtendedJPanel01 jpanel01;

            public ExtendedJButton01(ExtendedJPanel01 jpanel01)
            {
                this.jpanel01 = jpanel01;

                new Settings(this);

                new Hierarchy(this);

                new Listeners(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                    if(this.model.isRollover() || this.model.isPressed())
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);

                        if(this.model.isRollover())
                        {
                            graphics.setColor(Color.GRAY.brighter());
                        }

                        if(this.model.isPressed())
                        {
                            graphics.setColor(new Color(200,200,200));
                        }
                    }
                    else
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")), 0, 0, null);

                        graphics.setColor(Color.GRAY);
                    }

                    graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                    graphics.drawString("ExtendedJButton01",10,18);

                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public static class Settings
            {
                public Settings(ExtendedJButton01 jbutton01)
                {
                    jbutton01.setBorder(new EmptyBorder(5,5,5,5));

                    //jbutton01.setBorder(new RoundedBorder());

                    jbutton01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    jbutton01.setPreferredSize(new Dimension(140,30));
                }
            }

            public static class Hierarchy
            {
                public Hierarchy(ExtendedJButton01 jbutton01)
                {

                }
            }

            public static class Listeners
            {
                public Listeners(ExtendedJButton01 jbutton01)
                {
                    jbutton01.addMouseListener(new ImplementedMouseListener(jbutton01));
                }
            }

            public static class ImplementedMouseListener implements MouseListener
            {
                public ExtendedJButton01 jbutton01;

                public ImplementedMouseListener(ExtendedJButton01 jbutton01)
                {
                    this.jbutton01 = jbutton01;
                }

                @Override
                public void mouseClicked(MouseEvent e)
                {

                }

                @Override
                public void mousePressed(MouseEvent e)
                {

                }

                @Override
                public void mouseReleased(MouseEvent e)
                {

                }

                @Override
                public void mouseEntered(MouseEvent e)
                {

                }

                @Override
                public void mouseExited(MouseEvent e)
                {

                }
            }
        }

        public static class ExtendedJButton02 extends JButton
        {
            ExtendedJPanel01 jpanel01;

            public ExtendedJButton02(ExtendedJPanel01 jpanel01)
            {
                this.jpanel01 = jpanel01;

                new Settings(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    if(this.model.isRollover() || this.model.isPressed())
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);

                        if(this.model.isRollover())
                        {
                            graphics.setColor(Color.GRAY.brighter());
                        }

                        if(this.model.isPressed())
                        {
                            graphics.setColor(new Color(200,200,200));
                        }
                    }
                    else
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                        graphics.setColor(Color.GRAY);
                    }

                    graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                    graphics.drawString("ExtendedJButton02",10,18);
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public static class Settings
            {
                ExtendedJButton02 jbutton02;

                public Settings(ExtendedJButton02 jbutton02)
                {
                    jbutton02.setBorder(new EmptyBorder(5,5,5,5));

                    jbutton02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    jbutton02.setPreferredSize(new Dimension(140,30));
                }
            }
        }

        public static class ExtendedJButton03 extends JButton
        {
            ExtendedJPanel02 jpanel02;

            public ExtendedJButton03(ExtendedJPanel02 jpanel02)
            {
                this.jpanel02 = jpanel02;

                new Settings(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    if(this.model.isRollover() || this.model.isPressed())
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);

                        if(this.model.isRollover())
                        {
                            graphics.setColor(Color.GRAY.brighter());
                        }

                        if(this.model.isPressed())
                        {
                            graphics.setColor(new Color(200,200,200));
                        }
                    }
                    else
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                        graphics.setColor(Color.GRAY);
                    }

                    graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                    graphics.drawString("ExtendedJButton02",10,18);
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public static class Settings
            {
                ExtendedJButton03 jbutton03;

                public Settings(ExtendedJButton03 jbutton03)
                {
                    jbutton03.setBorder(new EmptyBorder(5,5,5,5));

                    jbutton03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    jbutton03.setPreferredSize(new Dimension(140,30));
                }
            }
        }

        public static class ExtendedJButton04 extends JButton
        {
            ExtendedJPanel02 jpanel02;

            public ExtendedJButton04(ExtendedJPanel02 jpanel02)
            {
                this.jpanel02 = jpanel02;

                new Settings(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    if(this.model.isRollover() || this.model.isPressed())
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);

                        if(this.model.isRollover())
                        {
                            graphics.setColor(Color.GRAY.brighter());
                        }

                        if(this.model.isPressed())
                        {
                            graphics.setColor(new Color(200,200,200));
                        }
                    }
                    else
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                        graphics.setColor(Color.GRAY);
                    }

                    graphics.setFont(new Font("Georgia", Font.PLAIN, 12));

                    graphics.drawString("ExtendedJButton02",10,18);
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public static class Settings
            {
                ExtendedJButton04 jbutton04;

                public Settings(ExtendedJButton04 jbutton04)
                {
                    jbutton04.setBorder(new EmptyBorder(5,5,5,5));

                    jbutton04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    jbutton04.setPreferredSize(new Dimension(140,30));
                }
            }
        }

        public static class ExtendedJButton05 extends JButton
        {

        }

        public static class ExtendedJButton06 extends JButton
        {

        }

        public static class ExtendedJTree extends JTree
        {
            public DefaultMutableTreeNode root;

            public DefaultMutableTreeNode users;

            public DefaultMutableTreeNode groups;

            public DefaultMutableTreeNode developers;

            public DefaultMutableTreeNode rooms;

            public ExtendedJTree(DefaultMutableTreeNode root)
            {
                super(root);

                //

                this.setCellRenderer(new ExtendedJTreeCellRenderer());

                //

                root.add(users = new DefaultMutableTreeNode("Users"));

                users.add(new DefaultMutableTreeNode("John Stephens"));

                users.add(new DefaultMutableTreeNode("Davis Johnston"));

                users.add(new DefaultMutableTreeNode("William Draer"));

                root.add(groups = new DefaultMutableTreeNode("Groups"));

                groups.add(new DefaultMutableTreeNode("Open JDK"));

                groups.add(new DefaultMutableTreeNode("Oracle JDK"));

                root.add(developers = new DefaultMutableTreeNode("Developers"));

                developers.add(new DefaultMutableTreeNode("John Stephens"));

                developers.add(new DefaultMutableTreeNode("Davis Johnston"));

                developers.add(new DefaultMutableTreeNode("William Draer"));

                root.add(rooms = new DefaultMutableTreeNode("Rooms"));

                rooms.add(new DefaultMutableTreeNode("Casual"));

                rooms.add(new DefaultMutableTreeNode("Java Developers"));

                rooms.add(new DefaultMutableTreeNode("Python Developers"));

                //

                this.setBackground(new Color(8,8,8));
            }

            public static class ExtendedJTreeCellRenderer extends DefaultTreeCellRenderer
            {
                @Override
                public Component getTreeCellRendererComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row, boolean hasFocus)
                {
                    JComponent c = (JComponent) super.getTreeCellRendererComponent(tree, value, isSelected, expanded, leaf, row, hasFocus);

                    c.setForeground(new Color(40,40,40));

                    c.setBackground(new Color(8,8,8));

                    c.setFont(new Font("Georgia", Font.PLAIN, 12));

                    c.setOpaque(true);
                    
                    return c;
                }
            }
        }

        public static class SilentBorder implements Border
        {
            @Override
            public void paintBorder(Component c, Graphics graphics, int x, int y, int width, int height)
            {
                graphics.drawRoundRect(x, y, width-1, height-1, 0, 0);
            }

            @Override
            public Insets getBorderInsets(Component c)
            {
                return new Insets(5,5,5,5);
            }

            @Override
            public boolean isBorderOpaque()
            {
                return true;
            }
        }

        public static class RoundedBorder implements Border
        {
            public int radius = 10;

            @Override
            public void paintBorder(Component c, Graphics graphics, int x, int y, int width, int height)
            {
                graphics.drawRoundRect(x, y, width-1, height-1, this.radius, this.radius);
            }

            @Override
            public Insets getBorderInsets(Component c)
            {
                return new Insets(5,5,5,5);
            }

            @Override
            public boolean isBorderOpaque()
            {
                return true;
            }
        }
    }

    /*

    public static class Test02
    {
        public Test02()
        {
            ExtendedJFrame jframe = new ExtendedJFrame();
        }

        public static class ExtendedJFrame extends JFrame
        {
            public ExtendedJPanel01 jpanel01 = new ExtendedJPanel01(this);

            public ExtendedJPanel02 jpanel02 = new ExtendedJPanel02(this);

            public ExtendedJFrame()
            {
                new Settings(this);

                //

                this.setJMenuBar(new JMenuBar());

                this.getContentPane().add(jpanel01);

                this.getContentPane().add(jpanel02);

                this.getContentPane().setBackground(Color.GRAY.darker());
            }

            public static class Settings
            {
                ExtendedJFrame jframe;

                public Settings(ExtendedJFrame jframe)
                {
                    this.jframe = jframe;

                    this.jframe.setTitle("Java APML GUI");

                    this.jframe.setLayout(new FlowLayout());

                    this.jframe.setBackground(Color.GRAY.darker());

                    this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    this.jframe.setSize(new Dimension(1200,800));

                    this.jframe.setVisible(true);
                }
            }
        }

        public static class ExtendedJPanel01 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton01 jbutton01 = new ExtendedJButton01();

            public ExtendedJButton02 jbutton02 = new ExtendedJButton02();

            public ExtendedJPanel01(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);

                new Hierarchy(this);
            }

            public static class Settings
            {
                ExtendedJPanel01 jpanel01;

                public Settings(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;

                    this.jpanel01.setBackground(new Color(02,02,02 ));
                }
            }

            public static class Hierarchy
            {
                ExtendedJPanel01 jpanel01;

                public Hierarchy(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;

                    this.jpanel01.add(this.jpanel01.jbutton01);

                    this.jpanel01.add(this.jpanel01.jbutton02);
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\supercar003.png"));

                    graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = 200;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel02 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton03 jbutton03 = new ExtendedJButton03();

            public ExtendedJButton04 jbutton04 = new ExtendedJButton04();

            public ExtendedJPanel02(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);
            }

            public static class Settings
            {
                ExtendedJPanel02 jpanel02;

                public Settings(ExtendedJPanel02 jpanel02)
                {
                    this.jpanel02 = jpanel02;

                    this.jpanel02.setBackground(new Color(48,48,48));
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    //image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\supercar002.png"));

                    //graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = this.jframe.getHeight()-253;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel03 extends JPanel
        {
            public ExtendedJButton05 jbutton05 = new ExtendedJButton05();

            public ExtendedJButton06 jbutton06 = new ExtendedJButton06();
        }

        public static class ExtendedJButton01 extends JButton
        {
            public ExtendedJButton01()
            {
                super();

                this.setBorder(new RoundedBorder());

                this.setOpaque(false);

                this.setSize(new Dimension(80,50));

                this.setBounds(new Rectangle(20,20,80,50));

                this.addMouseListener(new ImplementedMouseListener(this));
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                    graphics.setColor(Color.GRAY.darker().darker().darker().darker());

                    graphics.drawString("ExtendedJButton01",0,0);
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public class ImplementedMouseListener implements MouseListener
            {
                public ExtendedJButton01 jbutton01;

                public ImplementedMouseListener(ExtendedJButton01 jbutton01)
                {
                    this.jbutton01 = jbutton01;
                }

                @Override
                public void mouseClicked(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button001.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }
            }
        }

        public static class ExtendedJButton02 extends JButton
        {
            public ExtendedJButton02()
            {
                super("JButton02");

                new Settings(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);
            }

            public static class Settings
            {
                ExtendedJButton02 jbutton02;

                public Settings(ExtendedJButton02 jbutton02)
                {
                    this.jbutton02 = jbutton02;

                    this.jbutton02.setBackground(new Color(48,48,48));

                    this.jbutton02.setFocusPainted(false);

                    this.jbutton02.setFocusable(false);

                    this.jbutton02.setBorder(new EmptyBorder(4,4,4,4));
                }
            }
        }

        public static class ExtendedJButton03 extends JButton
        {

        }

        public static class ExtendedJButton04 extends JButton
        {

        }

        public static class ExtendedJButton05 extends JButton
        {

        }

        public static class ExtendedJButton06 extends JButton
        {

        }

        public static class RoundedBorder implements Border
        {
            public int radius = 10;

            @Override
            public void paintBorder(Component c, Graphics graphics, int x, int y, int width, int height)
            {
                graphics.drawRoundRect(x, y, width-1, height-1, this.radius, this.radius);
            }

            @Override
            public Insets getBorderInsets(Component c)
            {
                return new Insets(5,5,5,5);
            }

            @Override
            public boolean isBorderOpaque()
            {
                return true;
            }
        }
    }

    public static class Test03
    {
        public Test03()
        {
            ExtendedJFrame jframe = new ExtendedJFrame();
        }

        public static class ExtendedJFrame extends JFrame
        {
            public ExtendedJPanel01 jpanel01 = new ExtendedJPanel01(this);

            public ExtendedJPanel02 jpanel02 = new ExtendedJPanel02(this);

            public ExtendedJFrame()
            {
                new Settings(this);

                //

                this.setJMenuBar(new JMenuBar());

                this.getContentPane().add(jpanel01);

                this.getContentPane().add(jpanel02);

                this.getContentPane().setBackground(Color.GRAY.darker());
            }

            public static class Settings
            {
                ExtendedJFrame jframe;

                public Settings(ExtendedJFrame jframe)
                {
                    this.jframe = jframe;

                    this.jframe.setTitle("Java APML GUI");

                    this.jframe.setLayout(new FlowLayout());

                    this.jframe.setBackground(Color.GRAY.darker());

                    this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    this.jframe.setSize(new Dimension(1200,800));

                    this.jframe.setVisible(true);
                }
            }
        }

        public static class ExtendedJPanel01 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton01 jbutton01 = new ExtendedJButton01();

            public ExtendedJButton02 jbutton02 = new ExtendedJButton02();

            public ExtendedJPanel01(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);

                new Hierarchy(this);
            }

            public static class Settings
            {
                ExtendedJPanel01 jpanel01;

                public Settings(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;

                    this.jpanel01.setBackground(new Color(02,02,02 ));
                }
            }

            public static class Hierarchy
            {
                ExtendedJPanel01 jpanel01;

                public Hierarchy(ExtendedJPanel01 jpanel01)
                {
                    this.jpanel01 = jpanel01;

                    this.jpanel01.add(this.jpanel01.jbutton01);

                    this.jpanel01.add(this.jpanel01.jbutton02);
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\supercar003.png"));

                    graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = 200;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel02 extends JPanel
        {
            public ExtendedJFrame jframe;

            public ExtendedJButton03 jbutton03 = new ExtendedJButton03();

            public ExtendedJButton04 jbutton04 = new ExtendedJButton04();

            public ExtendedJPanel02(ExtendedJFrame jframe)
            {
                this.jframe = jframe;

                new Settings(this);
            }

            public static class Settings
            {
                ExtendedJPanel02 jpanel02;

                public Settings(ExtendedJPanel02 jpanel02)
                {
                    this.jpanel02 = jpanel02;

                    this.jpanel02.setBackground(new Color(48,48,48));
                }
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                Image image;

                try
                {
                    //image = ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\supercar002.png"));

                    //graphics.drawImage(image, 0, 0, this);
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }

            @Override
            public Dimension getPreferredSize()
            {
                int width = this.jframe.getWidth()-24;

                int height = this.jframe.getHeight()-253;

                return new Dimension(width, height);
            }
        }

        public static class ExtendedJPanel03 extends JPanel
        {
            public ExtendedJButton05 jbutton05 = new ExtendedJButton05();

            public ExtendedJButton06 jbutton06 = new ExtendedJButton06();
        }

        public static class ExtendedJButton01 extends JButton
        {
            public ExtendedJButton01()
            {
                super();

                this.setBorder(new RoundedBorder());

                this.setOpaque(false);

                this.setSize(new Dimension(80,50));

                this.setBounds(new Rectangle(20,20,80,50));

                this.addMouseListener(new ImplementedMouseListener(this));
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);

                try
                {
                    graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);

                    graphics.setColor(Color.GRAY.darker().darker().darker().darker());

                    graphics.drawString("ExtendedJButton01",0,0);
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
            }

            public class ImplementedMouseListener implements MouseListener
            {
                public ExtendedJButton01 jbutton01;

                public ImplementedMouseListener(ExtendedJButton01 jbutton01)
                {
                    this.jbutton01 = jbutton01;
                }

                @Override
                public void mouseClicked(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button003.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button002.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e)
                {
                    Graphics graphics = this.jbutton01.getGraphics();

                    try
                    {
                        //graphics.drawImage(ImageIO.read(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\button001.png")),0,0,null);
                    }
                    catch(Exception exception)
                    {
                        System.err.println(exception);
                    }
                }
            }
        }

        public static class ExtendedJButton02 extends JButton
        {
            public ExtendedJButton02()
            {
                super("JButton02");

                new Settings(this);
            }

            @Override
            public void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);
            }

            public static class Settings
            {
                ExtendedJButton02 jbutton02;

                public Settings(ExtendedJButton02 jbutton02)
                {
                    this.jbutton02 = jbutton02;

                    this.jbutton02.setBackground(new Color(48,48,48));

                    this.jbutton02.setFocusPainted(false);

                    this.jbutton02.setFocusable(false);

                    this.jbutton02.setBorder(new EmptyBorder(4,4,4,4));
                }
            }
        }

        public static class ExtendedJButton03 extends JButton
        {

        }

        public static class ExtendedJButton04 extends JButton
        {

        }

        public static class ExtendedJButton05 extends JButton
        {

        }

        public static class ExtendedJButton06 extends JButton
        {

        }

        public static class RoundedBorder implements Border
        {
            public int radius = 10;

            @Override
            public void paintBorder(Component c, Graphics graphics, int x, int y, int width, int height)
            {
                graphics.drawRoundRect(x, y, width-1, height-1, this.radius, this.radius);
            }

            @Override
            public Insets getBorderInsets(Component c)
            {
                return new Insets(5,5,5,5);
            }

            @Override
            public boolean isBorderOpaque()
            {
                return true;
            }
        }
    }

    */
}
