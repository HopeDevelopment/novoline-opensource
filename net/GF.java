/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.Items;
import net.World;
import net.a9z_0;
import net.mi_1;
import net.ms_1;

public class GF
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        return new ms_1(world, d, d2, d3, Items.slime_ball);
    }
}

