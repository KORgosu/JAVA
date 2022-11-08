package JavaProgramming.ch2;
import java.awt.*;
import javax.swing.*;

public class JavaProgramming {
	
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
			
			JButton[] btn_1 = null; // Button 초기화
			btn_1 = new JButton[16];
			
			 // btn_1(16개 버튼)을 btn의 패널로 추가
			for (int i = 0; i < 10; i++)
			{
				btn_1[i] = new JButton("" + (i));
				btn.add(btn_1[i]);
			}
			
			btn_1[10] = new JButton("CE");
			btn.add(btn_1[10]);
			
			btn_1[11] = new JButton("계산");
			btn.add(btn_1[11]);
			
			btn_1[12] = new JButton("+");
			btn_1[12].setBackground(Color.CYAN);
			btn.add(btn_1[12]);
					
			btn_1[13] = new JButton("-");
			btn_1[13].setBackground(Color.CYAN);
			btn.add(btn_1[13]);
			
			btn_1[14] = new JButton("X");
			btn_1[14].setBackground(Color.CYAN);
			btn.add(btn_1[14]);
			
			btn_1[15] = new JButton("/");
			btn_1[15].setBackground(Color.CYAN);
			btn.add(btn_1[15]);
			
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
			
					
			setSize(350, 320);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();

	}

}
