package gui;
import java.awt.Dimension;
import javax.swing.JPanel;
import kata3.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    
    
    public HistogramDisplay(String title) {
        super(title);
        setContentPane(CreatePanel());
        pack();
    }
    
    private JPanel CreatePanel(){
        ChartPanel chartPanel = new ChartPanel(CreateChart(CreateDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart CreateChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histogram", "Dominios email", "Nº Emails",
                dataSet, PlotOrientation.VERTICAL,false,
                rootPaneCheckingEnabled,rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset CreateDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(7, "", "ull.es");
        dataSet.addValue(15, "", "alejandro.es");
        dataSet.addValue(18, "", "aaronsincamiseta.es");
        dataSet.addValue(2, "", "acer.es");
        return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
}
