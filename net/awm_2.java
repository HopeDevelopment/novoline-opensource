/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.StatBase;
import java.util.Comparator;
import net.R8;
import net.a8I;
import net.aH_;
import net.alp_1;
import net.aop_1;
import net.px_0;

/*
 * Renamed from net.awm
 */
class awm_2
implements Comparator<aH_> {
    a8I b;
    R8 a;

    public int a(aH_ aH_2, aH_ aH_3) {
        int n = px_0.a(alp_1.a(aH_2));
        int n2 = px_0.a(alp_1.a(aH_3));
        if (this.b.C == 0) {
            StatBase cfr_ignored_0 = aop_1.x[n];
            StatBase cfr_ignored_1 = aop_1.x[n2];
        } else if (this.b.C == 1) {
            StatBase cfr_ignored_2 = aop_1.V[n];
            StatBase cfr_ignored_3 = aop_1.V[n2];
        } else if (this.b.C == 2) {
            StatBase cfr_ignored_4 = aop_1.p[n];
            StatBase cfr_ignored_5 = aop_1.p[n2];
        }
        return 1;
    }

    awm_2(a8I a8I2, R8 r8) {
        this.b = a8I2;
        this.a = r8;
    }
}

