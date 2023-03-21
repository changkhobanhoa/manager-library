package Controller;

import model.*;
import service.*;
import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import dao.SQLConnect;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class QuanLyThongKeController {

	private ThongKeService thongKeService = null;
	private DefaultPieDataset priDataset;

	public QuanLyThongKeController() {
		this.thongKeService = new ThongKeServiceImpl();

	}

	public void setDateToChart1(JPanel pnItem) {
		List<Muon> listItem = thongKeService.getListByMuon();

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		if (listItem != null) {
			for (Muon m : listItem) {
				dataset.addValue(Integer.parseInt(m.getMaSach()), "Mượn", m.getNgayMuon());
			}
		}
		JFreeChart barChart = ChartFactory.createBarChart("Biểu đồ thống kê số sách mượn trong 1 ngày".toUpperCase(),
				"Thời Gian", "Số Lượng", dataset, PlotOrientation.VERTICAL, false, true, false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(pnItem.getWidth(), 321));

		pnItem.removeAll();
		pnItem.setLayout(new CardLayout());
		pnItem.add(chartPanel);
		pnItem.validate();
		pnItem.repaint();
	}

	public void setDateToChart2(JPanel pnItem) {
		List<Sach> listItem = thongKeService.getListBySach();
		priDataset = new DefaultPieDataset<>();
		if (listItem != null) {
			for (Sach s : listItem) {
				priDataset.setValue(s.getTHELOAI(), Double.parseDouble(s.getTENSACH()));
			}
		}
		JFreeChart chart = ChartFactory.createPieChart("Thống kê các loại sách", priDataset, true, true, true);
		ChartPanel plot = new ChartPanel(chart);
		plot.setPreferredSize(new Dimension(pnItem.getWidth(), 321));

		pnItem.removeAll();
		pnItem.setLayout(new CardLayout());
		pnItem.add(plot);
		pnItem.validate();
		pnItem.repaint();

	}

	public void setDateToChart3(JPanel pnItem) {
		List<Tra> listItem = thongKeService.getListByTra();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		if (listItem != null) {
			for (Tra t : listItem) {
				dataset.addValue(Integer.parseInt(t.getMasach()), "Trả", t.getNgaytra());
			}
		}
		JFreeChart barChart = ChartFactory.createBarChart("Biểu đồ Số Sách trả trong 1 ngày".toUpperCase(), "Thời Gian",
				"Số lượng", dataset, PlotOrientation.VERTICAL, false, true, false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(pnItem.getWidth(), 321));

		pnItem.removeAll();
		pnItem.setLayout(new CardLayout());
		pnItem.add(chartPanel);
		pnItem.validate();
		pnItem.repaint();
	}

	public void setDateToChart4(JPanel pnItem) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "select DISTINCT s.TENSACH,(m.SOSACHMUON-t.SOSACHTRA) as SOLUONGCHUATRA\r\n"
					+ "from MUON m ,TRA t,SACH s\r\n" + "where m.MATHE=t.MATHE and s.MASACH=t.MASACH\r\n"
					+ "group by s.TENSACH, (m.SOSACHMUON-t.SOSACHTRA)\r\n" + "having (m.SOSACHMUON-t.SOSACHTRA)>0";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			priDataset = new DefaultPieDataset<>();
			while (rs.next()) {
				priDataset.setValue(rs.getString(1), (rs.getInt(2)));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFreeChart chart = ChartFactory.createPieChart("Số lượng sách và tên sách chưa trả đủ", priDataset, true, true,
				true);
		PiePlot p = (PiePlot) chart.getPlot();
		ChartPanel plot = new ChartPanel(chart);
		plot.setPreferredSize(new Dimension(pnItem.getWidth(), 321));

		pnItem.removeAll();
		pnItem.setLayout(new CardLayout());
		pnItem.add(plot);
		pnItem.validate();
		pnItem.repaint();

	}

}
