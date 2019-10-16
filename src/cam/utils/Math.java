package cam.utils;

public interface Math {


    float min(float min, float max);
    float max(float min, float max);
    float clamp(float min, float max, float val);
    float add(float amount, float val);
    float sub(float amount, float val);
    float mul(float val, float times);


    // Vec2D
    float[] Vec2Add(float[] x, float[] y);
    float[] Vec2Sub(float[] x, float[] y);
    float[] Vec2Mul(float[] x, float[] y);
    float[] Vec2Dot(float[] x, float[] y);
    float[] Vec2Cross(float[] x, float[] y);


    // Vec3D
    float[] Vec3Add(float[] x, float[] y, float[] z);
    float[] Vec3Sub(float[] x, float[] y, float[] z);
    float[] Vec3Mul(float[] x, float[] y, float[] z);
    float[] Vec3Dot(float[] x, float[] y, float[] z);
    float[] Vec3Cross(float[] x, float[] y, float[] z);


}
