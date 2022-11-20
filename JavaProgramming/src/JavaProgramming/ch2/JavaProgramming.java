package JavaProgramming.ch2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JavaProgramming {
	static String Calcu = "";
	static String res;
	static int num1;
	static int num2;
	static double code;
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ㅡ ㅁ X 표시 만들고
			setTitle("계산기 by 19011850_박수환"); // 계산기 이름

			this.setLayout(new BorderLayout()); // 레이아웃 BorderLayout으로 설정
			
			JPanel panel = new JPanel(); // 위쪽 패널 설정
			Container c = this.getContentPane();
			c.setBackground(Color.GRAY);
			
			JTextField Cal = new JTextField(20);
			panel.add(new JLabel("수식입력 "));
			panel.add(Cal);
			panel.setBackground(Color.GRAY);
			// 배경색, 수식입력칸 패널에 추가
			// 패널을 맨 위로 보내기
			this.add(panel, BorderLayout.NORTH);
			
			// 수식입력 패널 완성
			
			JPanel btn; // 계산기의 버튼패널 설정
			btn = new JPanel(new GridLayout(4, 4, 5, 5)); // 버튼 패널속 패널(GRID) 4행 4열, 수직수평간격 각각 5
			btn.setBackground(Color.WHITE);
			
			/*
			String[] BB = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "X", "/"};
			*/
			
			 // btn_1(16개 버튼)을 btn의 패널로 추가
			
			
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn0.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn0);
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn1.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn2.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn2);
			
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn3.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn3);
			
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn4.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn5.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn6.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn6);
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn7.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn8.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn9.getText();
					Calcu += num;
					Cal.setText(Calcu);
				}
			});
			btn.add(btn9);
			
	
			JButton btn10 = new JButton("CE");
			btn.add(btn10);
			
			
			JButton btn11 = new JButton("계산");
			btn.add(btn11);
			
		
			JButton btn12 = new JButton("+");
			btn12.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Calcu += '+';
					Cal.setText(Calcu);
				}
			});
			btn12.setBackground(Color.CYAN);
			btn.add(btn12);
			
					
			JButton btn13 = new JButton("-");
			btn13.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String num = btn13.getText();
					Calcu += '-';
					Cal.setText(Calcu);
				}
			});
			btn13.setBackground(Color.CYAN);
			btn.add(btn13);
			
			
			JButton btn14 = new JButton("X");
			btn14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String mul = btn14.getText();
					Calcu += mul;
					Cal.setText(Calcu);
				}
			});
			btn14.setBackground(Color.CYAN);
			btn.add(btn14);
			
			
			JButton btn15 = new JButton("/");
			btn15.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String div = btn15.getText();
					Calcu += "/";
					Cal.setText(Calcu);
				}
			});
			btn15.setBackground(Color.CYAN);
			btn.add(btn15);
			
			
			// 패널에 버튼들 추가 완료
			// 패널을 아래쪽에 붙이기
			this.add(btn, BorderLayout.CENTER);
			
			// 계산기 중앙 버튼부분 완성
			
			JPanel result = new JPanel(); // 아래쪽 패널 설정 (결과패널)
			Container c1 = this.getContentPane();
			c1.setBackground(Color.GRAY);
			
			JTextField Cal_result = new JTextField(15);
			result.add(new JLabel("계산결과 "));
			result.add(Cal_result);
			result.setBackground(Color.YELLOW);
			// 배경색, 수식입력칸 패널에 추가
			// 패널을 맨 위로 보내기
			this.add(result, BorderLayout.SOUTH);
			// 수식출력 부분 완성
			
			
			// 간단한 계산문제 (1회성)
			btn11.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) 
				{
					int i = 0;
					// 첫번째 숫자 num1에 저장
					while(true)
					{
						if (Calcu.length() == i + 1)
						{
							break;
						}
						
						if (Calcu.charAt(i) >= '0' && Calcu.charAt(i) <= '9')
						{
							num1 = 10 * num1 + Calcu.charAt(i) - '0';
							i++;
						}
						else
						{
							break;
						}
					}
					
					// 수식부호가 있는 인덱스를 저장
					int count = i;
					i++;
					
					// 두번째 숫자 num2에 저장
					while(true)
					{
						if (Calcu.length() == i)
						{
							break;
						}
						
						if (Calcu.charAt(i) >= '0' && Calcu.charAt(i) <= '9')
						{
							num2 = 10 * num2 + Calcu.charAt(i) - '0';
							i++;
						}
						else
						{
							break;
						}
					}
					
					// 계산 후 계산결과 JTextField에 출력
					if (Calcu.charAt(count) == '+')
					{
						code = (double)num1 + (double)num2;
					}
					else if (Calcu.charAt(count) == '-')
					{
						code = (double)num1 - (double)num2;
					}
					else if (Calcu.charAt(count) == '/')
					{
						code = (double)num1 / (double)num2;
					}
					else if (Calcu.charAt(count) == 'X')
					{
						code = (double)num1 * (double)num2;
					}
					
					Cal_result.setText(Double.toString(code));
					
				}			
			});
			
			// CE를 누르면 모두 초기화
			btn10.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					num1 = 0;
					num2 = 0;
					code = 0;
					Calcu = "";
					res = "";
					Cal.setText(Calcu);
					Cal_result.setText("");
				}
			});
			
					
			setSize(350, 320);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}
}
