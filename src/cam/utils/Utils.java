package cam.utils;

public class Utils implements Math{
    @Override
    public float min(final float min, final float max) {
        if(min < max) return min;
        if(max < min) return max;
        return min;
    }

    @Override
    public float max(final float min, final float max) {
        if(min > max) return max;
        if(max > min) return min;
        return max;
    }

    @Override
    public float clamp(final float min, final float max, final float val) {
        if(val < min) return min;
        if(val > max) return max;
        return val;
    }

    @Override
    public float add(final float amount, final float val) {
        return val + amount;
    }

    @Override
    public float sub(final float amount, final float val) {
        return val - amount;
    }

    @Override
    public float mul(final float val, final float times) {
        return val * times;
    }

    @Override
    public float[] Vec2Add(final float[] x, final float[] y) {
        float[] res = new float[2];
        res[0] = x[0] + y[0];
        res[1] = x[1] + y[1];
        return res;
    }

    @Override
    public float[] Vec2Sub(final float[] x, final float[] y) {
        float[] res = new float[2];
        res[0] = x[0] - y[0];
        res[1] = x[1] - y[1];
        return res;
    }

    @Override
    public float[] Vec2Mul(final float[] x, final float[] y) {
        float[] res = new float[2];
        res[0] = x[0] * y[0];
        res[1] = x[1] * y[1];
        return res;
    }

    @Override
    public float[] Vec2Dot(final float[] x, final float[] y) {
        float[] res = new float[2];
        res[0] = x[0] + y[0];
        res[1] = x[1] + y[1];
        return res;
    }

    @Deprecated
    @Override
    public float[] Vec2Cross(final float[] x, final float[] y) {
        float[] res = new float[2];
        res[0] = x[0] + y[0];
        res[1] = x[1] + y[1];
        return res;
    }

    @Override
    public float[] Vec3Add(final float[] x, final float[] y, final float[] z) {
        float[] res = new float[3];
        res[0] = x[0] + x[1] + x[2];
        res[1] = y[0] + y[1] + y[2];
        res[2] = z[0] + z[1] + z[2];
        return res;
    }

    @Override
    public float[] Vec3Sub(final float[] x, final float[] y, final float[] z) {
        float[] res = new float[3];
        res[0] = x[0] - x[1] - x[2];
        res[1] = y[0] - y[1] - y[2];
        res[2] = z[0] - z[1] - z[2];
        return res;
    }

    @Override
    public float[] Vec3Mul(final float[] x, final float[] y, final float[] z) {
        float[] res = new float[3];
        res[0] = x[0] * x[1] * x[2];
        res[1] = y[0] * y[1] * y[2];
        res[2] = z[0] * z[1] * z[2];
        return res;
    }

    @Override
    public float[] Vec3Dot(final float[] x, final float[] y, final float[] z) {
        float[] res = new float[3];
        res[0] = (x[0] * x[1]) + (x[1] * y[0]);
        res[1] = (y[1] * y[2]) + (y[1] * z[0]);
        res[2] = (z[1] * z[1]) + (z[1] * x[0]);
        return res;
    }

    @Deprecated
    @Override
    public float[] Vec3Cross(final float[] x, final float[] y, final float[] z) {
        return new float[0];
    }
}
