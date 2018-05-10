package com.rekik.binarytodecimal2018;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Binary {

    @NotNull
    @Min(value = 1)
    private int binary;

    public int getBinary() {
        return binary;
    }

    public void setBinary(int binary) {
        this.binary=binary;
    }
}
