/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aQM {
    private static String c = "variant";
    public static String a = "variant";
    private static long b = a1c.a(-6915834635660759865L, 3372091333529306997L, null).a(263793521881021L);

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6873479D3174L;
        long l5 = l4 ^ 0x6D0E019231ADL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u0007jToY32".toCharArray();
        int n = 0;
        int n2 = 46;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5F));
            n2 = n2;
        }
    }
}

