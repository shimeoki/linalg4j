package ru.vsu.cs.course2.a1pha.linear_algebra.vectors;

import ru.vsu.cs.course2.a1pha.linear_algebra.Copyable;

/**
 * Vec4
 */
public class Vec4 implements Vector4 {

    private final Vec vector;

    public Vec4(final float x, final float y, final float z, final float w) {
        vector = new Vec(x, y, z, w);
    }

    @Override
    public float get(final int i) {
        return vector.get(i);
    }

    @Override
    public float x() {
        return vector.get(0);
    }

    @Override
    public float y() {
        return vector.get(1);
    }

    @Override
    public float z() {
        return vector.get(2);
    }

    @Override
    public float w() {
        return vector.get(3);
    }

    @Override
    public void set(final int i, final float value) {
        vector.set(i, value);
    }

    @Override
    public void setX(final float value) {
        vector.set(0, value);
    }

    @Override
    public void setY(final float value) {
        vector.set(1, value);
    }

    @Override
    public void setZ(final float value) {
        vector.set(2, value);
    }

    @Override
    public void setW(final float value) {
        vector.set(3, value);
    }

    @Override
    public int size() {
        return 4;
    }

    @Override
    public float length() {
        return vector.length();
    }

    @Override
    public void add(final Vector4 other) {
        UncheckedVectorOperations.addTo(this, other);
    }

    @Override
    public void subtract(final Vector4 other) {
        UncheckedVectorOperations.subtractFrom(this, other);
    }

    @Override
    public float dot(final Vector4 other) {
        return UncheckedVectorOperations.dot(this, other);
    }

    @Override
    public void divide(final float divisor) {
        vector.divide(divisor);
    }

    @Override
    public void multiply(final float multiplier) {
        vector.multiply(multiplier);
    }

    @Override
    public boolean equalsTo(final Vector4 other) {
        return UncheckedVectorOperations.equalTo(this, other);
    }

    @Override
    public Vector4 copy() {
        return new Vec4(this.x(), this.y(), this.z(), this.w());
    }

    @Override
    public void normalize() {
        vector.normalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
