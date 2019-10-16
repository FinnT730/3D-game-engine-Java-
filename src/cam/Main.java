package cam;

import cam.utils.Utils;
import org.codehaus.groovy.runtime.DefaultGroovyMethods;

import javax.swing.*;
import java.awt.*;

public class Main extends Component {

    float[][] mat3D(float[] x, float[] y, float[] z) {
        float[][] res = new float[3][3];
        float[][] matrix = {
                {(float) Math.sin(x[0]),0,0, (float) Math.cos(1*x[0])},
                {0,1,0,0,1*y[0]},
                {0,0,1,0,1*z[0]},
                {0,0,0,1}
        };
        x[0] = x[0] * matrix[0][0];
        x[1] = x[1] * matrix[0][1];
        x[1] = x[1] * matrix[0][2];

        y[0] = y[0] * matrix[1][0];
        y[1] = y[1] * matrix[1][1];
        y[1] = y[1] * matrix[1][2];

        z[0] = z[0] * matrix[2][0];
        z[1] = z[1] * matrix[2][1];
        z[1] = z[1] * matrix[2][2];

        res[0] = x;
        res[1] = y;
        res[2] = z;

        return res;

    }



    public static JFrame frame = new JFrame("Testing");


    public static void main(String[] args) {
        Utils u = new Utils();
        float[] a = {2,2,2};
        float[] b = {2,2,3};
        float[] c = {1,1,1};


        frame.setSize(640,480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());

        

    }


    @Override
    public void paint(final Graphics g) {
        super.paint(g);
        Utils util = new Utils();
        for(int p = 0; p < 360; p++) {
            float[] i = new float[]{p + 50, 30, 16};
            float[] j = new float[]{75, 50, p * 7};
            float[] k = new float[]{2 * 40, p + 5, p * p};
            float[][] x = mat3D(i, j, k);
            g.setColor(Color.RED);
//            g.drawLine(frame.getWidth() / 2, frame.getHeight() / 2 + 50, (int) x[0][1], (int) util.Vec3Mul(i,j,k)[0]);
            g.drawLine(frame.getWidth() / 2 - (int)x[0][1],frame.getHeight() / 2 - (int)x[0][1],(int)util.Vec3Add(i,j,k)[0],(int)util.Vec3Add(i,j,k)[1] / 5);
            g.setColor(Color.BLACK);
//            g.drawLine(frame.getWidth() / 2, frame.getHeight() / 2 + 50, (int) x[0][0], (int) util.Vec3Mul(i,j,k)[1]);
            g.drawLine(frame.getWidth() / 2 - (int)x[0][1],frame.getHeight() / 2 - (int)x[1][0],(int)util.Vec3Add(i,j,k)[0],(int)util.Vec3Add(i,j,k)[1]);
            g.setColor(Color.BLUE);
//            g.drawLine(frame.getWidth() / 2, frame.getHeight() / 2 + 50, (int) x[1][1], (int) util.Vec3Mul(i,j,k)[2]);
            g.drawLine(frame.getWidth() / 2 - (int)x[0][1],frame.getHeight() / 2 - (int)x[1][1],(int)util.Vec3Add(i,j,k)[0],(int)util.Vec3Add(i,j,k)[0]);
        }
    }
}
