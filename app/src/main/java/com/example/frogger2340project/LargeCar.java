package com.example.frogger2340project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class LargeCar {
    private Bitmap[] large = new Bitmap[3];
    private int vehicleFrame = 0;
    private int vehicleX;
    private int vehicleY;
    private int vehicleVelocity;
    private Random random;

    public LargeCar(Context context) {
        large[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.largecar);
        large[0] = Bitmap.createScaledBitmap(large[0], large[0].getWidth() * 2,
                large[0].getHeight() * 2, false);
        large[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.largecar);
        large[1] = Bitmap.createScaledBitmap(large[1], large[1].getWidth() * 2,
                large[1].getHeight() * 2, false);
        large[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.largecar);
        large[2] = Bitmap.createScaledBitmap(large[2], large[2].getWidth() * 2,
                large[2].getHeight() * 2, false);
        random = new Random();
        resetPosition();
    }

    public Bitmap getLargeCar(int carFrame) {
        return large[carFrame];
    }

    public int getLargeCarWidth() {
        return large[0].getWidth();
    }

    public int getLargeCarHeight() {
        return large[0].getHeight();
    }
    public void resetPosition() {
        vehicleX = 0 - getLargeCarWidth();
        vehicleY = 1436;
        vehicleVelocity = 10;
    }

    public Bitmap[] getLarge() {
        return large;
    }
    public int getVehicleFrame() {
        return vehicleFrame;
    }
    public int getVehicleX() {
        return vehicleX;
    }
    public int getVehicleY() {
        return vehicleY;
    }
    public int getVehicleVelocity() {
        return vehicleVelocity;
    }
    public void setLarge(Bitmap[] newLarge) {
        large = newLarge;
    }
    public void setVehicleFrame(int newVehicleFrame) {
        vehicleFrame = newVehicleFrame;
    }
    public void setVehicleX(int newVehicleX) {
        vehicleX = newVehicleX;
    }
    public void setVehicleY(int newVehicleY) {
        vehicleY = newVehicleY;
    }
    public void setVehicleVelocity(int newVehicleVelocity) {
        vehicleVelocity = newVehicleVelocity;
    }

}
