import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.font.*;

public class MSETGUI extends javax.swing.JFrame 
{

    public MSETGUI() 
    {
        initComponents();
    }

    public static void main(String[] args)
    {
    	new MSETGUI().setVisible(true);
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        maincontainer1 = new javax.swing.JPanel();
        tablecontainer = new javax.swing.JPanel();
        graphcontainer = new javax.swing.JPanel();
        graph = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        start = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maincontainer1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablecontainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        javax.swing.GroupLayout tablecontainerLayout = new javax.swing.GroupLayout(tablecontainer);
        tablecontainer.setLayout(tablecontainerLayout);
        tablecontainerLayout.setHorizontalGroup(
            tablecontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tablecontainerLayout.setVerticalGroup(
            tablecontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        graphcontainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Graph", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        graph.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        button1.setText("Graph 1");

        button2.setText("Graph 3");

        button3.setText("Graph 2");

        button4.setText("Graph 4");

        start.setText("Start");
        start.addActionListener(new ClickListener());

        javax.swing.GroupLayout graphcontainerLayout = new javax.swing.GroupLayout(graphcontainer);
        graphcontainer.setLayout(graphcontainerLayout);
        graphcontainerLayout.setHorizontalGroup(
            graphcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphcontainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graphcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(graphcontainerLayout.createSequentialGroup()
                        .addComponent(button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3)
                        .addGap(4, 4, 4)
                        .addComponent(button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        graphcontainerLayout.setVerticalGroup(
            graphcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphcontainerLayout.createSequentialGroup()
                .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graphcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3)
                    .addComponent(button4)
                    .addComponent(start))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout maincontainer1Layout = new javax.swing.GroupLayout(maincontainer1);
        maincontainer1.setLayout(maincontainer1Layout);
        maincontainer1Layout.setHorizontalGroup(
            maincontainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maincontainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graphcontainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablecontainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        maincontainer1Layout.setVerticalGroup(
            maincontainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maincontainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maincontainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tablecontainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graphcontainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maincontainer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(maincontainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private class ClickListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		while(StdIn.hasNextLine())
    		{
    			new Thread(new Grapher(StdIn.readFloat())).run();	
    		}
    	}
    }

    private class Grapher implements Runnable
    {
    	private float data;

    	public Grapher(float input)
    	{
    		data = input;
    	}

    	public void run()
    	{
    		graph = new GraphingData(data);
    		graph.revalidate();
    		graph.repaint();
    	}
    }

	private class GraphingData extends JPanel 
	{
    	ArrayList<Float> data = new ArrayList<Float>();
    final int PAD = 20;

    public GraphingData(float input)
    {
    	data.add(input);
    }
 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        // Draw ordinate.
        g2.draw(new Line2D.Double(PAD, PAD, PAD, h-PAD));
        // Draw abcissa.
        g2.draw(new Line2D.Double(PAD, h-PAD, w-PAD, h-PAD));
        // Draw labels.
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();
        // Ordinate label.
        String s = "data";
        float sy = PAD + ((h - 2*PAD) - s.length()*sh)/2 + lm.getAscent();
        for(int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            float sw = (float)font.getStringBounds(letter, frc).getWidth();
            float sx = (PAD - sw)/2;
            g2.drawString(letter, sx, sy);
            sy += sh;
        }
        // Abcissa label.
        s = "x axis";
        sy = h - PAD + (PAD - sh)/2 + lm.getAscent();
        float sw = (float)font.getStringBounds(s, frc).getWidth();
        float sx = (w - sw)/2;
        g2.drawString(s, sx, sy);
        // Draw lines.
        double xInc = (double)(w - 2*PAD)/(data.size()-1);
        double scale = (double)(h - 2*PAD)/getMax();
        g2.setPaint(Color.green.darker());
        for(int i = 0; i < data.size()-1; i++) {
            double x1 = PAD + i*xInc;
            double y1 = h - PAD - scale*data.get(i);
            double x2 = PAD + (i+1)*xInc;
            double y2 = h - PAD - scale*data.get(i+1);
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
        // Mark data points.
        g2.setPaint(Color.red);
        for(int i = 0; i < data.size(); i++) {
            double x = PAD + i*xInc;
            double y = h - PAD - scale*data.get(i);
            g2.fill(new Ellipse2D.Double(x-2, y-2, 4, 4));
        }
    }
 
    private float getMax() {
        float max = -Float.MAX_VALUE;
        for(int i = 0; i < data.size(); i++) {
            if(data.get(i) > max)
                max = data.get(i);
        }
        return max;
    }
}

    // Variables declaration - do not modify
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JPanel graph;
    private javax.swing.JPanel graphcontainer;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel maincontainer1;
    private javax.swing.JButton start;
    private javax.swing.JPanel tablecontainer;
    // End of variables declaration
}