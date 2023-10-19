package com.study3fx.study3fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class HelloApplication extends Application {
    TextField txt;
    TextField txt2=new TextField();
    TextField txt3=new TextField();
    TextField txt4=new TextField();
    TextField txt5=new TextField();
    TextField txt6=new TextField();
    TextField fNo=new TextField();
    TextField sNo=new TextField();
    TextField answer =new TextField();


    RadioButton rd1,rd2,rd3,rd4;
    Label msg=new Label();

    @Override
    public void start(Stage primaryStage) {
/*        Button btn1=new Button("hey there");
        Scene scene1=new Scene(btn1,200,200);


        primaryStage.setTitle("my fx");
        primaryStage.setScene(scene1);
        primaryStage.show();
        //primaryStage.setResizable(true); unnecessary
        System.out.println(scene1.getWidth());
        System.out.println(scene1.getHeight());
        System.out.println(primaryStage.getWidth());
        System.out.println(primaryStage.getHeight());



        Stage stage2=new Stage();
        Button btn2=new Button("this is the second page");
        Scene scene2=new Scene(btn2);
        stage2.setTitle("title goes here");
        stage2.setScene(scene2);
        stage2.show();
        System.out.println(scene2.getWidth());
        System.out.println(scene2.getHeight());
        System.out.println(stage2.getWidth());
        System.out.println(stage2.getHeight());*/

        Button btn1=new Button("hey there");
        Button btn2=new Button("hey there2");
        Button btn3=new Button("hey there3");
        //VBox box1=new VBox(50,btn1,btn2,btn3);//50 is spacing
        //box1.setSpacing(10);
        //btn1.setText(JOptionPane.showInputDialog(null, "select button test"));
        //btn2.setVisible(false);
        //btn3.setDisable(true);
        btn1.setWrapText(true);
        //btn1.setPrefWidth(350);
        //btn1.setPrefHeight(350);
        //btn1.setPrefSize(350,200);
        btn3.setTranslateX(150);
        btn3.setTranslateY(90);
        btn3.setScaleX(3);
        btn3.setScaleY(3);
        btn3.setRotate(45);
        Color ct=new Color(0.6,0.3,0.7,1);
        btn2.setTextFill(ct);
        Color ct2=Color.color(0.5,0.7,0.4);
        Color c=Color.rgb(155,0,0);
        btn1.setTextFill(c);
        btn3.setTextFill(Color.GOLD);
        System.out.println(Font.getFamilies());
        //Font fnt1=new Font("Franklin Gothic Book",20);
        Font fnt2=Font.font("Times New Roman", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20);
        btn3.setFont(fnt2);
        btn1.setStyle("-fx-base :#80B366FF");
        Image imObj=new Image("file:///C:\\Users\\mousa\\OneDrive\\Pictures\\splashicon.jpeg");
        ImageView imv=new ImageView(imObj);
        imv.setFitHeight(350);
        imv.setPreserveRatio(true);
        imv.setX(250); //might be a problem with the HBox yep
        Line l=new Line(0,0,500,600);
        l.setStroke(Color.DARKGOLDENROD);
        l.setStrokeWidth(4);
        Circle crcl=new Circle(70,250,40);
        crcl.setStroke(Color.PALEGREEN);
        crcl.setFill(Color.BLUEVIOLET);
        crcl.setStrokeWidth(5);
        Rectangle r=new Rectangle(10,120,50,30);
        r.setStroke(Color.LIGHTBLUE);
        r.setFill(Color.HOTPINK);
        r.setStrokeWidth(5);
        r.setArcHeight(5);
        r.setArcWidth(5);
        Label lbl=new Label("my name is label");
        lbl.setTextFill(Color.DARKSALMON);
        lbl.setFont(Font.font("Times New Roman"));
        //lbl.setLayoutY(400);
         txt=new TextField("delete me");
        HBox box11=new HBox(lbl,txt);
        box11.setLayoutY(400);

        Label select=new Label("select your major");
        rd1=new RadioButton("sc");
        rd2=new RadioButton("se");
        rd3=new RadioButton("cis");
        rd4=new RadioButton("cga");
        Button exam=new Button("see exam date");
        VBox vbx=new VBox(select,rd1,rd2,rd3,rd4,exam,msg);
        vbx.setLayoutY(500);
        exam.setTextFill(ct2);
        select.setTextFill(c);
        rd1.setTextFill(Color.PALEGREEN);   rd2.setTextFill(Color.GOLDENROD);
        rd3.setTextFill(Color.NAVAJOWHITE);   rd4.setTextFill(Color.VIOLET);
        msg.setTextFill(ct);
        rd1.setSelected(true);
        rd2.setSelected(true);
        ToggleGroup g1=new ToggleGroup();
        rd1.setToggleGroup(g1);   rd2.setToggleGroup(g1);
        rd3.setToggleGroup(g1);   rd4.setToggleGroup(g1);
        radioHandler et=new radioHandler();
        exam.setOnAction(et);
        CheckBox b1=new CheckBox("ls");
        CheckBox b2=new CheckBox("vc");
        CheckBox b3=new CheckBox("sa");
        CheckBox b4=new CheckBox("tbd");
        b1.setTextFill(Color.SLATEBLUE);   b2.setTextFill(Color.AQUAMARINE);
        b3.setTextFill(Color.SADDLEBROWN);   b4.setTextFill(Color.KHAKI);
        b1.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
            if (b1.isSelected())
                JOptionPane.showMessageDialog(null,"nice");
        }
        }
        );
        b2.setOnAction(e->{
            if (b2.isSelected())
                JOptionPane.showMessageDialog(null,"the best");
        });

        VBox vbx2=new VBox(b1,b2,b3,b4);
        vbx2.setLayoutY(500);
        vbx2.setLayoutX(200);
        MyHandlerClass handling=new MyHandlerClass();
        btn3.setOnAction(handling);
        MyHandlerClass2 handlingForRetards=new MyHandlerClass2();
        btn2.setOnAction(handlingForRetards);
        MyHandlerClass3 handling3=new MyHandlerClass3();
        btn1.setOnAction(handling3);
        btn1.setLayoutY(450);
        txt2.setPrefSize(100,50);
        txt2.setPromptText("try me");
        box11.getChildren().addAll(txt2);
        Button btn4=new Button("copy and paste");
        Button btn5=new Button("cut and so on");
        Button btn6=new Button("clear");
        Button btn7=new Button("are you on the square are you on the level");
        HBox boxMan=new HBox(txt5,txt6,btn7);
        VBox bx=new VBox(btn4,btn5,btn6,txt3,txt4);
        bx.setLayoutX(540);
        bx.setLayoutY(600);
        copyPaster copier=new copyPaster();
        btn4.setOnAction(copier);
        cutPaster cutter=new cutPaster();
        btn5.setOnAction(cutter);
        clear clearer=new clear();
        btn6.setOnAction(clearer);
        boxMan.setLayoutX(550);
        boxMan.setLayoutY(500);
        txt5.setFont(Font.font("Ink Free",FontPosture.ITALIC,15));
        txt5.setStyle("-fx-text-fill: HOTPINK");
        square squareGhost=new square();
        btn7.setOnAction(squareGhost);

        Font ff= Font.font("Ink Free");
        Color myC=Color.rgb(81,19,34);
        Label n1=new Label("First Number");
        Label n2=new Label("Second Number");
        Label rslt=new Label("Results");
        Button add=new Button("add");
        Button sub=new Button("sub");
        n1.setFont(ff);     n2.setFont(ff);
        rslt.setFont(ff);
        add.setFont(ff);    sub.setFont(ff);
        n1.setTextFill(myC);    n2.setTextFill(myC);
        rslt.setTextFill(myC);
        add.setTextFill(myC);   sub.setTextFill(myC);
        HBox mth=new HBox(10,n1,fNo,n2,sNo,add,sub,rslt,answer);
        mth.setLayoutY(740);
        add adder=new add();
        add.setOnAction(adder);
        sub subtracter=new sub();
        sub.setOnAction(subtracter);


        Stage stage2=new Stage();
        Pane pane2=new Pane(mth);//cannot use in two panes
        Scene scene2=new Scene(pane2,1000,800);
        stage2.setTitle("page 2");
        stage2.setScene(scene2);

        Button np=new Button("next page");
        np.setLayoutX(850);
        np.setLayoutY(750);
        np.setOnAction(e->{
            stage2.show();
            primaryStage.close();
        });

        Button pp=new Button("previous page");
        pane2.getChildren().addAll(pp);
        pp.setOnAction(e->{
            primaryStage.show();
            stage2.close();
        });


        //HBox box2=new HBox(50,btn1,btn2,btn3,imv,l,crcl,r);
        Pane pane= new Pane (btn1,btn2,btn3,imv,l,crcl,r,box11,vbx,vbx2,bx,boxMan,mth,np);
        //pane.getChildren().addAll();
        //pane.setPadding(10,10,10,10);
        Scene scene1=new Scene(pane,1000,800);
        primaryStage.setTitle("my fx");
        primaryStage.setScene(scene1);
        primaryStage.show();

        //primaryStage.setFullScreen(true);



    }
//keep them out of start but use global when using in both places
    class MyHandlerClass implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null,"loading...");
            System.out.println("you have entered the endgame");
        }
    }

    class MyHandlerClass2 implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null,"i said loading you dumb brick!!");
            //System.out.println("you don't even deserve a console message");
        }
    }

    class MyHandlerClass3 implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null,"hello "+ txt.getText()+" "+txt2.getText());
        }
    }

    class copyPaster implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            txt4.setText(txt3.getText());
        }
    }

    class cutPaster implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            txt4.setText(txt3.getText());
            txt3.setText("");
            //txt3.clear();//or txt3.setText("");
        }
    }

    class clear implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            txt3.clear();
            txt4.clear();
        }
    }

    class square implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            int num=Integer.parseInt(txt5.getText());
            int square=num*num;
            txt6.setText(String.valueOf(square));//or Integer.tpString(square);
        }
    }

    class add implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            int num1=Integer.parseInt(fNo.getText());
            int num2=Integer.parseInt(sNo.getText());
            int sum=num1+num2;
            answer.setText(Integer.toString(sum));
        }
    }

    class sub implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            int num1=Integer.parseInt(fNo.getText());
            int num2=Integer.parseInt(sNo.getText());
            int sub=num1-num2;
            answer.setText(Integer.toString(sub));
        }
    }

    class radioHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            if(rd1.isSelected())
                msg.setText("cs is fine");
            else if (rd2.isSelected())
                msg.setText("se is the best");
            else if (rd3.isSelected())
                msg.setText("cis is not bad");
            else if (rd4.isSelected())
                msg.setText("cga is meh");
            else
                msg.setText("select something you dumbass");
        }
    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}