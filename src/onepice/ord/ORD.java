package onepice.ord;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Rectangle;
import java.awt.Canvas;


public class ORD extends JFrame{

	
	public ORD() {
		setTitle("원랜디 조합식");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JPanel mainbanner = new JPanel();
		Font font = new Font("굴림", Font.PLAIN, 12);
		setFont(font);
		mainbanner.setBounds(12, 0, 570, 120);
		getContentPane().add(mainbanner);
		mainbanner.setLayout(null);
		
		
		
		JLabel label_8 = new JLabel("\uC6D0\uB79C\uB514 \uC870\uD569\uBC95");
		label_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(0, 10, 570, 110);
		label_8.setFont(new Font("굴림", Font.PLAIN, 34));
		mainbanner.add(label_8);
		
		JLabel label_10 = new JLabel("\uC81C\uC791\uC790:\uBE0C\uC988\uC988");
		label_10.setFont(font);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(459, 95, 85, 15);
		mainbanner.add(label_10);
		
		JPanel 흔함유닛수 = new JPanel();
		흔함유닛수.setBounds(new Rectangle(2, 0, 2, 0));
		
		
		
		흔함유닛수.setBorder(new LineBorder(new Color(0, 0, 0)));
		흔함유닛수.setBounds(12, 126, 161, 264);
		getContentPane().add(흔함유닛수);
		GridBagLayout gbl_흔함유닛수 = new GridBagLayout();
		gbl_흔함유닛수.rowHeights = new int[] {29, 29, 29, 29, 29, 29, 29, 29, 29};
		gbl_흔함유닛수.columnWidths = new int[] {88, 52};
		gbl_흔함유닛수.columnWeights = new double[]{0.0, 0.0};
		gbl_흔함유닛수.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		흔함유닛수.setLayout(gbl_흔함유닛수);
		
		JLabel ruppi_label = new JLabel("\uB8E8\uD53C");
		ruppi_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_ruppi_label = new GridBagConstraints();
		gbc_ruppi_label.fill = GridBagConstraints.VERTICAL;
		gbc_ruppi_label.insets = new Insets(0, 0, 5, 5);
		gbc_ruppi_label.gridx = 0;
		gbc_ruppi_label.gridy = 0;
		흔함유닛수.add(ruppi_label, gbc_ruppi_label);
		
		JSpinner ruppi_number = new JSpinner();
		
		GridBagConstraints gbc_ruppi_number = new GridBagConstraints();
		gbc_ruppi_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_ruppi_number.insets = new Insets(0, 0, 5, 0);
		gbc_ruppi_number.gridx = 1;
		gbc_ruppi_number.gridy = 0;
		흔함유닛수.add(ruppi_number, gbc_ruppi_number);
		
		JLabel zorro_label = new JLabel("\uC870\uB85C");
		zorro_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_zorro_label = new GridBagConstraints();
		gbc_zorro_label.insets = new Insets(0, 0, 5, 5);
		gbc_zorro_label.gridx = 0;
		gbc_zorro_label.gridy = 1;
		흔함유닛수.add(zorro_label, gbc_zorro_label);
		
		JSpinner zorro_number = new JSpinner();
		GridBagConstraints gbc_zorro_number = new GridBagConstraints();
		gbc_zorro_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_zorro_number.insets = new Insets(0, 0, 5, 0);
		gbc_zorro_number.gridx = 1;
		gbc_zorro_number.gridy = 1;
		흔함유닛수.add(zorro_number, gbc_zorro_number);
		
		JLabel uopsop_label = new JLabel("\uC6B0\uC19D");
		uopsop_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_uopsop_label = new GridBagConstraints();
		gbc_uopsop_label.fill = GridBagConstraints.VERTICAL;
		gbc_uopsop_label.insets = new Insets(0, 0, 5, 5);
		gbc_uopsop_label.gridx = 0;
		gbc_uopsop_label.gridy = 2;
		흔함유닛수.add(uopsop_label, gbc_uopsop_label);
		
		JSpinner uopsop_number = new JSpinner();
		GridBagConstraints gbc_uopsop_number = new GridBagConstraints();
		gbc_uopsop_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_uopsop_number.insets = new Insets(0, 0, 5, 0);
		gbc_uopsop_number.gridx = 1;
		gbc_uopsop_number.gridy = 2;
		흔함유닛수.add(uopsop_number, gbc_uopsop_number);
		
		JLabel nami_label = new JLabel("\uB098\uBBF8");
		nami_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_nami_label = new GridBagConstraints();
		gbc_nami_label.fill = GridBagConstraints.VERTICAL;
		gbc_nami_label.insets = new Insets(0, 0, 5, 5);
		gbc_nami_label.gridx = 0;
		gbc_nami_label.gridy = 3;
		흔함유닛수.add(nami_label, gbc_nami_label);
		
		JSpinner nami_number = new JSpinner();
		GridBagConstraints gbc_nami_number = new GridBagConstraints();
		gbc_nami_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_nami_number.insets = new Insets(0, 0, 5, 0);
		gbc_nami_number.gridx = 1;
		gbc_nami_number.gridy = 3;
		흔함유닛수.add(nami_number, gbc_nami_number);
		
		JLabel sangdi_label = new JLabel("\uC0C1\uB514");
		sangdi_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_sangdi_label = new GridBagConstraints();
		gbc_sangdi_label.insets = new Insets(0, 0, 5, 5);
		gbc_sangdi_label.gridx = 0;
		gbc_sangdi_label.gridy = 4;
		흔함유닛수.add(sangdi_label, gbc_sangdi_label);
		
		JSpinner sangdi_number = new JSpinner();
		GridBagConstraints gbc_sangdi_number = new GridBagConstraints();
		gbc_sangdi_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_sangdi_number.insets = new Insets(0, 0, 5, 0);
		gbc_sangdi_number.gridx = 1;
		gbc_sangdi_number.gridy = 4;
		흔함유닛수.add(sangdi_number, gbc_sangdi_number);
		
		JLabel chopper_label = new JLabel("\uCD78\uD30C");
		chopper_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_chopper_label = new GridBagConstraints();
		gbc_chopper_label.fill = GridBagConstraints.VERTICAL;
		gbc_chopper_label.insets = new Insets(0, 0, 5, 5);
		gbc_chopper_label.gridx = 0;
		gbc_chopper_label.gridy = 5;
		흔함유닛수.add(chopper_label, gbc_chopper_label);
		
		JSpinner chopper_number = new JSpinner();
		GridBagConstraints gbc_chopper_number = new GridBagConstraints();
		gbc_chopper_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_chopper_number.insets = new Insets(0, 0, 5, 0);
		gbc_chopper_number.gridx = 1;
		gbc_chopper_number.gridy = 5;
		흔함유닛수.add(chopper_number, gbc_chopper_number);
		
		JLabel buggy_label = new JLabel("\uBC84\uAE30");
		buggy_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_buggy_label = new GridBagConstraints();
		gbc_buggy_label.fill = GridBagConstraints.VERTICAL;
		gbc_buggy_label.insets = new Insets(0, 0, 5, 5);
		gbc_buggy_label.gridx = 0;
		gbc_buggy_label.gridy = 6;
		흔함유닛수.add(buggy_label, gbc_buggy_label);
		
		JSpinner buggy_number = new JSpinner();
		GridBagConstraints gbc_buggy_number = new GridBagConstraints();
		gbc_buggy_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_buggy_number.insets = new Insets(0, 0, 5, 0);
		gbc_buggy_number.gridx = 1;
		gbc_buggy_number.gridy = 6;
		흔함유닛수.add(buggy_number, gbc_buggy_number);
		
		JLabel navalsworld_label = new JLabel("\uD574\uAD70 \uCE7C\uBCD1");
		navalsworld_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_navalsworld_label = new GridBagConstraints();
		gbc_navalsworld_label.fill = GridBagConstraints.VERTICAL;
		gbc_navalsworld_label.insets = new Insets(0, 0, 5, 5);
		gbc_navalsworld_label.gridx = 0;
		gbc_navalsworld_label.gridy = 7;
		흔함유닛수.add(navalsworld_label, gbc_navalsworld_label);
		
		JSpinner navalsworld_number = new JSpinner();
		GridBagConstraints gbc_navalsworld_number = new GridBagConstraints();
		gbc_navalsworld_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_navalsworld_number.insets = new Insets(0, 0, 5, 0);
		gbc_navalsworld_number.gridx = 1;
		gbc_navalsworld_number.gridy = 7;
		흔함유닛수.add(navalsworld_number, gbc_navalsworld_number);
		
		JLabel navalgenderal_label = new JLabel("\uD574\uAD70 \uCD1D\uBCD1");
		navalgenderal_label.setFont(new Font("굴림", Font.PLAIN, 16));
		GridBagConstraints gbc_navalgenderal_label = new GridBagConstraints();
		gbc_navalgenderal_label.fill = GridBagConstraints.VERTICAL;
		gbc_navalgenderal_label.insets = new Insets(0, 0, 0, 5);
		gbc_navalgenderal_label.gridx = 0;
		gbc_navalgenderal_label.gridy = 8;
		흔함유닛수.add(navalgenderal_label, gbc_navalgenderal_label);
		
		JSpinner navalgeneral_number = new JSpinner();
		GridBagConstraints gbc_navalgeneral_number = new GridBagConstraints();
		gbc_navalgeneral_number.fill = GridBagConstraints.HORIZONTAL;
		gbc_navalgeneral_number.gridx = 1;
		gbc_navalgeneral_number.gridy = 8;
		흔함유닛수.add(navalgeneral_number, gbc_navalgeneral_number);
		
		JPanel 유닛정보 = new JPanel();
		유닛정보.setBorder(new LineBorder(new Color(0, 0, 0)));
		유닛정보.setBounds(179, 126, 403, 264);
		getContentPane().add(유닛정보);
		유닛정보.setLayout(null);
		
		JPanel 유닛헤더 = new JPanel();
		유닛헤더.setBounds(15, 10, 376, 52);
		유닛정보.add(유닛헤더);
		GridBagLayout gbl_유닛헤더 = new GridBagLayout();
		gbl_유닛헤더.columnWidths = new int[]{95, 146, 78, 52, 0};
		gbl_유닛헤더.rowHeights = new int[] {26, 19};
		gbl_유닛헤더.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_유닛헤더.rowWeights = new double[]{0.0, 0.0};
		유닛헤더.setLayout(gbl_유닛헤더);
		
		JLabel unit_name_label = new JLabel("\uC720\uB2DB \uC774\uB984");
		unit_name_label.setFont(font);
		GridBagConstraints gbc_unit_name_label = new GridBagConstraints();
		gbc_unit_name_label.insets = new Insets(0, 0, 5, 5);
		gbc_unit_name_label.gridx = 0;
		gbc_unit_name_label.gridy = 0;
		유닛헤더.add(unit_name_label, gbc_unit_name_label);
		
		JLabel unit_name = new JLabel("\uCC9C\uC2E0 \uAE08\uC0AC\uC790 \uC2DC\uD0A4");
		unit_name.setFont(font);
		GridBagConstraints gbc_unit_name = new GridBagConstraints();
		gbc_unit_name.insets = new Insets(0, 0, 5, 5);
		gbc_unit_name.gridx = 1;
		gbc_unit_name.gridy = 0;
		유닛헤더.add(unit_name, gbc_unit_name);
		
		JLabel unit_rank_label = new JLabel("\uC720\uB2DB \uB4F1\uAE09");
		unit_rank_label.setFont(font);
		GridBagConstraints gbc_unit_rank_label = new GridBagConstraints();
		gbc_unit_rank_label.insets = new Insets(0, 0, 5, 5);
		gbc_unit_rank_label.gridx = 2;
		gbc_unit_rank_label.gridy = 0;
		유닛헤더.add(unit_rank_label, gbc_unit_rank_label);
		
		JLabel unit_rank = new JLabel("\uBD88\uBA78");
		unit_rank.setFont(font);
		GridBagConstraints gbc_unit_rank = new GridBagConstraints();
		gbc_unit_rank.insets = new Insets(0, 0, 5, 0);
		gbc_unit_rank.gridx = 3;
		gbc_unit_rank.gridy = 0;
		유닛헤더.add(unit_rank, gbc_unit_rank);
		
		JLabel unit_command_label = new JLabel("\uBA85\uB839\uC5B4");
		unit_command_label.setFont(font);
		GridBagConstraints gbc_unit_command_label = new GridBagConstraints();
		gbc_unit_command_label.insets = new Insets(0, 0, 0, 5);
		gbc_unit_command_label.gridx = 0;
		gbc_unit_command_label.gridy = 1;
		유닛헤더.add(unit_command_label, gbc_unit_command_label);
		
		JLabel unit_command = new JLabel("\uCC9C\uC2E0 \uAE08\uC0AC\uC790 \uC2DC\uD0A4 ");
		unit_command.setFont(font);
		GridBagConstraints gbc_unit_command = new GridBagConstraints();
		gbc_unit_command.gridwidth = 3;
		gbc_unit_command.anchor = GridBagConstraints.NORTH;
		gbc_unit_command.gridx = 1;
		gbc_unit_command.gridy = 1;
		유닛헤더.add(unit_command, gbc_unit_command);
		
		JPanel 상세정보 = new JPanel();
		상세정보.setForeground(new Color(0, 51, 255));
		상세정보.setBounds(12, 67, 379, 187);
		유닛정보.add(상세정보);
		상세정보.setLayout(null);
		
		JPanel unit_img = new JPanel();
		unit_img.setBounds(12, 10, 48, 48);
		상세정보.add(unit_img);
		
		JLabel unit_attack_label = new JLabel("\uACF5\uACA9\uB825");
		unit_attack_label.setFont(font);
		unit_attack_label.setBounds(72, 10, 57, 15);
		상세정보.add(unit_attack_label);
		
		JLabel unit_attack = new JLabel("136001-136004");
		unit_attack.setFont(font);
		unit_attack.setHorizontalAlignment(SwingConstants.CENTER);
		unit_attack.setBounds(134, 10, 233, 15);
		상세정보.add(unit_attack);
		
		JLabel unit_speed_label = new JLabel("\uACF5\uACA9\uC18D\uB3C4");
		unit_speed_label.setFont(font);
		unit_speed_label.setBounds(72, 35, 63, 15);
		상세정보.add(unit_speed_label);
		
		JLabel unit_speed = new JLabel("1.01");
		unit_speed.setFont(font);
		unit_speed.setHorizontalAlignment(SwingConstants.CENTER);
		unit_speed.setBounds(122, 35, 98, 15);
		상세정보.add(unit_speed);
		
		JLabel unit_attacktype_label = new JLabel("\uACF5\uACA9\uD0C0\uC785");
		unit_attacktype_label.setFont(font);
		unit_attacktype_label.setBounds(235, 35, 57, 15);
		상세정보.add(unit_attacktype_label);
		
		JLabel unit_attacktype = new JLabel("\uCD1D");
		unit_attacktype.setFont(font);
		unit_attacktype.setHorizontalAlignment(SwingConstants.CENTER);
		unit_attacktype.setBounds(304, 35, 63, 15);
		상세정보.add(unit_attacktype);
		
		JLabel skill1_title = new JLabel("\uD568\uB300");
		skill1_title.setFont(font);
		skill1_title.setForeground(new Color(0, 51, 255));
		skill1_title.setHorizontalAlignment(SwingConstants.CENTER);
		skill1_title.setBounds(12, 59, 133, 15);
		상세정보.add(skill1_title);
		
		JLabel skill1_subtitle = new JLabel("\uC2DC\uD0A4\uC758 \uD568\uB300\uB97C \uD638\uCD9C\uD569\uB2C8\uB2E4.");
		skill1_subtitle.setFont(font);
		skill1_subtitle.setForeground(new Color(0, 0, 0));
		skill1_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		skill1_subtitle.setBounds(144, 60, 223, 15);
		상세정보.add(skill1_subtitle);
		
		JLabel skill2_title = new JLabel("\uC0AC\uC790:\uCC9C\uC2E0");
		skill2_title.setFont(font);
		skill2_title.setForeground(new Color(0, 51, 255));
		skill2_title.setHorizontalAlignment(SwingConstants.CENTER);
		skill2_title.setBounds(22, 84, 123, 15);
		상세정보.add(skill2_title);
		
		JLabel skill2_subtitle = new JLabel("\uCC9C\uC2E0\uC774\uB77C \uBD88\uB9AC\uAC8C\uB41C \uC2DC\uD0A4\uC785\uB2C8\uB2E4.");
		skill2_subtitle.setFont(font);
		skill2_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		skill2_subtitle.setBounds(144, 84, 223, 15);
		상세정보.add(skill2_subtitle);
		
		JLabel skill3_title = new JLabel("\uCC38\uD30C");
		skill3_title.setFont(font);
		skill3_title.setForeground(new Color(0, 51, 255));
		skill3_title.setHorizontalAlignment(SwingConstants.CENTER);
		skill3_title.setBounds(12, 109, 133, 15);
		상세정보.add(skill3_title);
		
		JLabel skill3_subtitle = new JLabel("\uC591 \uB2E4\uB9AC\uC5D0 \uB2EC\uB9B0 \uCE7C\uC744 \uBE60\uB974\uAC8C \uD718\uB458\uB7EC \uC801\uB4E4\uC744 \uB3C4\uB959\uD569\uB2C8\uB2E4.");
		skill3_subtitle.setFont(font);
		skill3_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		skill3_subtitle.setBounds(144, 109, 235, 15);
		상세정보.add(skill3_subtitle);
		
		JLabel skill4_title = new JLabel("\uB465\uC2E4\uB465\uC2E4 \uC5F4\uB9E4 \uB808\uBCA82");
		skill4_title.setFont(font);
		skill4_title.setForeground(new Color(0, 51, 255));
		skill4_title.setHorizontalAlignment(SwingConstants.CENTER);
		skill4_title.setBounds(12, 134, 133, 15);
		상세정보.add(skill4_title);
		
		JLabel skill4_subtitle = new JLabel("\uB465\uC2E4\uB465\uC2E4\uC5F4\uB9E4\uC758 \uB2A5\uB825\uC744 \uC0AC\uC6A9\uD569\uB2C8\uB2E4.");
		skill4_subtitle.setFont(font);
		skill4_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		skill4_subtitle.setBounds(144, 134, 235, 15);
		상세정보.add(skill4_subtitle);
		
		JLabel skill5_title = new JLabel("\uC0AC\uC790 \uB5A8\uC5B4\uD2B8\uB9AC\uAE30 : \uB208");
		skill5_title.setFont(font);
		skill5_title.setForeground(new Color(0, 51, 255));
		skill5_title.setHorizontalAlignment(SwingConstants.CENTER);
		skill5_title.setBounds(12, 159, 133, 15);
		상세정보.add(skill5_title);
		
		JLabel skill5_subtitle = new JLabel("\uC5EC\uC12F\uBC29\uD5A5\uC5D0\uC11C \uC0AC\uC790\uB97C \uD615\uC131\uD558\uC5EC \uB36E\uCE58\uC5B4 \uD070\uB370\uBBF8\uC9C0\uB97C \uC90D\uB2C8\uB2E4.");
		skill5_subtitle.setFont(font);
		skill5_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		skill5_subtitle.setBounds(144, 159, 235, 15);
		상세정보.add(skill5_subtitle);
		
		JPanel 재료 = new JPanel();
		재료.setBorder(new LineBorder(new Color(0, 0, 0)));
		재료.setFont(font);
		재료.setBounds(12, 400, 570, 125);
		getContentPane().add(재료);
		GridBagLayout gbl_재료 = new GridBagLayout();
		gbl_재료.columnWidths = new int[] {55, 55, 55, 55, 55, 55, 55, 55, 55, 55};
		gbl_재료.rowHeights = new int[] {30, 30, 30};
		gbl_재료.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_재료.rowWeights = new double[]{0.0, 0.0, 0.0};
		재료.setLayout(gbl_재료);
		
		JLabel unit_material_label = new JLabel("\uC7AC\uB8CC");
		unit_material_label.setFont(font);
		GridBagConstraints gbc_unit_material_label = new GridBagConstraints();
		gbc_unit_material_label.insets = new Insets(0, 0, 5, 5);
		gbc_unit_material_label.gridx = 0;
		gbc_unit_material_label.gridy = 0;
		재료.add(unit_material_label, gbc_unit_material_label);
		
		JLabel unit_material = new JLabel("\uAE08\uC0AC\uC790 \uC2DC\uD0A4/\uC0C1\uB514/\uCE74\uB974\uAC00\uB77C");
		unit_material.setFont(new Font("굴림", Font.PLAIN, 12));
		GridBagConstraints gbc_unit_material = new GridBagConstraints();
		gbc_unit_material.anchor = GridBagConstraints.WEST;
		gbc_unit_material.gridwidth = 9;
		gbc_unit_material.insets = new Insets(0, 0, 5, 0);
		gbc_unit_material.gridx = 1;
		gbc_unit_material.gridy = 0;
		재료.add(unit_material, gbc_unit_material);
		
		JLabel material_ruppi_label = new JLabel("\uB8E8\uD53C");
		GridBagConstraints gbc_material_ruppi_label = new GridBagConstraints();
		gbc_material_ruppi_label.insets = new Insets(0, 0, 5, 5);
		gbc_material_ruppi_label.gridx = 0;
		gbc_material_ruppi_label.gridy = 1;
		재료.add(material_ruppi_label, gbc_material_ruppi_label);
		
		JLabel material_ruppi = new JLabel("0");
		GridBagConstraints gbc_material_ruppi = new GridBagConstraints();
		gbc_material_ruppi.insets = new Insets(0, 0, 5, 5);
		gbc_material_ruppi.gridx = 1;
		gbc_material_ruppi.gridy = 1;
		재료.add(material_ruppi, gbc_material_ruppi);
		
		JLabel material__zorro_label = new JLabel("\uC870\uB85C");
		GridBagConstraints gbc_material__zorro_label = new GridBagConstraints();
		gbc_material__zorro_label.fill = GridBagConstraints.VERTICAL;
		gbc_material__zorro_label.insets = new Insets(0, 0, 5, 5);
		gbc_material__zorro_label.gridx = 2;
		gbc_material__zorro_label.gridy = 1;
		재료.add(material__zorro_label, gbc_material__zorro_label);
		
		JLabel material_zorro = new JLabel("0");
		material_zorro.setName("\uC870\uB85C_num");
		GridBagConstraints gbc_material_zorro = new GridBagConstraints();
		gbc_material_zorro.insets = new Insets(0, 0, 5, 5);
		gbc_material_zorro.gridx = 3;
		gbc_material_zorro.gridy = 1;
		재료.add(material_zorro, gbc_material_zorro);
		
		JLabel material_uopsop_label = new JLabel("\uC6B0\uC19D");
		GridBagConstraints gbc_material_uopsop_label = new GridBagConstraints();
		gbc_material_uopsop_label.insets = new Insets(0, 0, 5, 5);
		gbc_material_uopsop_label.gridx = 4;
		gbc_material_uopsop_label.gridy = 1;
		재료.add(material_uopsop_label, gbc_material_uopsop_label);
		
		JLabel material_uopsop = new JLabel("0");
		GridBagConstraints gbc_material_uopsop = new GridBagConstraints();
		gbc_material_uopsop.insets = new Insets(0, 0, 5, 5);
		gbc_material_uopsop.gridx = 5;
		gbc_material_uopsop.gridy = 1;
		재료.add(material_uopsop, gbc_material_uopsop);
		
		JLabel material_nami_label = new JLabel("\uB098\uBBF8");
		GridBagConstraints gbc_material_nami_label = new GridBagConstraints();
		gbc_material_nami_label.insets = new Insets(0, 0, 5, 5);
		gbc_material_nami_label.gridx = 6;
		gbc_material_nami_label.gridy = 1;
		재료.add(material_nami_label, gbc_material_nami_label);
		
		JLabel material_nami = new JLabel("0");
		GridBagConstraints gbc_material_nami = new GridBagConstraints();
		gbc_material_nami.insets = new Insets(0, 0, 5, 5);
		gbc_material_nami.gridx = 7;
		gbc_material_nami.gridy = 1;
		재료.add(material_nami, gbc_material_nami);
		
		JLabel material_sangdi_label = new JLabel("\uC0C1\uB514");
		GridBagConstraints gbc_material_sangdi_label = new GridBagConstraints();
		gbc_material_sangdi_label.insets = new Insets(0, 0, 5, 5);
		gbc_material_sangdi_label.gridx = 8;
		gbc_material_sangdi_label.gridy = 1;
		재료.add(material_sangdi_label, gbc_material_sangdi_label);
		
		JLabel material_sangdi = new JLabel("0");
		GridBagConstraints gbc_material_sangdi = new GridBagConstraints();
		gbc_material_sangdi.insets = new Insets(0, 0, 5, 0);
		gbc_material_sangdi.gridx = 9;
		gbc_material_sangdi.gridy = 1;
		재료.add(material_sangdi, gbc_material_sangdi);
		
		JLabel material_chopper_label = new JLabel("\uCD78\uD30C");
		GridBagConstraints gbc_material_chopper_label = new GridBagConstraints();
		gbc_material_chopper_label.insets = new Insets(0, 0, 0, 5);
		gbc_material_chopper_label.gridx = 0;
		gbc_material_chopper_label.gridy = 2;
		재료.add(material_chopper_label, gbc_material_chopper_label);
		
		JLabel material_chopper = new JLabel("0");
		GridBagConstraints gbc_material_chopper = new GridBagConstraints();
		gbc_material_chopper.insets = new Insets(0, 0, 0, 5);
		gbc_material_chopper.gridx = 1;
		gbc_material_chopper.gridy = 2;
		재료.add(material_chopper, gbc_material_chopper);
		
		JLabel material_buggy_label = new JLabel("\uBC84\uAE30");
		GridBagConstraints gbc_material_buggy_label = new GridBagConstraints();
		gbc_material_buggy_label.insets = new Insets(0, 0, 0, 5);
		gbc_material_buggy_label.gridx = 2;
		gbc_material_buggy_label.gridy = 2;
		재료.add(material_buggy_label, gbc_material_buggy_label);
		
		JLabel material_buggy = new JLabel("0");
		material_buggy.setName("\uC870\uB85C_num");
		GridBagConstraints gbc_material_buggy = new GridBagConstraints();
		gbc_material_buggy.insets = new Insets(0, 0, 0, 5);
		gbc_material_buggy.gridx = 3;
		gbc_material_buggy.gridy = 2;
		재료.add(material_buggy, gbc_material_buggy);
		
		JLabel material_navalsworld_label = new JLabel("\uD574\uAD70 \uCE7C\uBCD1");
		GridBagConstraints gbc_material_navalsworld_label = new GridBagConstraints();
		gbc_material_navalsworld_label.insets = new Insets(0, 0, 0, 5);
		gbc_material_navalsworld_label.gridx = 4;
		gbc_material_navalsworld_label.gridy = 2;
		재료.add(material_navalsworld_label, gbc_material_navalsworld_label);
		
		JLabel material_navalsworld = new JLabel("0");
		GridBagConstraints gbc_material_navalsworld = new GridBagConstraints();
		gbc_material_navalsworld.insets = new Insets(0, 0, 0, 5);
		gbc_material_navalsworld.gridx = 5;
		gbc_material_navalsworld.gridy = 2;
		재료.add(material_navalsworld, gbc_material_navalsworld);
		
		JLabel material_navalgeneral_label = new JLabel("\uD574\uAD70 \uCD1D\uBCD1");
		GridBagConstraints gbc_material_navalgeneral_label = new GridBagConstraints();
		gbc_material_navalgeneral_label.insets = new Insets(0, 0, 0, 5);
		gbc_material_navalgeneral_label.gridx = 6;
		gbc_material_navalgeneral_label.gridy = 2;
		재료.add(material_navalgeneral_label, gbc_material_navalgeneral_label);
		
		JLabel material_navalgeneral = new JLabel("0");
		GridBagConstraints gbc_material_navalgeneral = new GridBagConstraints();
		gbc_material_navalgeneral.insets = new Insets(0, 0, 0, 5);
		gbc_material_navalgeneral.gridx = 7;
		gbc_material_navalgeneral.gridy = 2;
		재료.add(material_navalgeneral, gbc_material_navalgeneral);
		
		
		
		/////////////////////조합 정보 //////////////////////////////
		JPanel 조합정보 = new JPanel();
		조합정보.setBorder(new LineBorder(new Color(0, 0, 0)));
		조합정보.setBounds(10, 535, 572, 226);
		getContentPane().add(조합정보);
		GridBagLayout gbl_조합정보 = new GridBagLayout();
		gbl_조합정보.columnWidths = new int[] {110, 110, 110, 110, 110};
		gbl_조합정보.rowHeights = new int[] {50, 50, 50, 50};
		gbl_조합정보.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_조합정보.rowWeights = new double[]{0.0, 0.0, 0.0};
		조합정보.setLayout(gbl_조합정보);
		
		////////////////////////////////////////////////////////////////////////////////////event/////////////////////////////////////////////////////////////
		ruppi_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		zorro_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		uopsop_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		nami_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		sangdi_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		chopper_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		buggy_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		navalsworld_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		navalgeneral_number.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Search search =new Search((int)ruppi_number.getValue(),(int)zorro_number.getValue(), (int)uopsop_number.getValue(), (int)nami_number.getValue(), (int)sangdi_number.getValue(), (int)chopper_number.getValue(), (int)buggy_number.getValue(), (int)navalsworld_number.getValue(), (int)navalgeneral_number.getValue());
				System.out.println(search.toString());
			}
		});
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/*for( int i=0; i<4; i++){
			for( int j =0; j<5;j++){
				JButton btnNewButton = new JButton("\uCE90\uB9AD\uD130 \uC774\uB984");
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.fill = GridBagConstraints.BOTH;
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton.gridx = j;
				gbc_btnNewButton.gridy = i;
				조합정보.add(btnNewButton, gbc_btnNewButton);
				
			}//출력 x축
		}//출력 y축
*/		setVisible(true);

		}
}

