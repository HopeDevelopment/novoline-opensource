/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.ao9
 */
class ao9_0 {
    static int[] a;
    private static String b = "CL_00001955";

    ao9_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "n\u000e@$\r*T\u001c{*!".toCharArray();
        int n2 = 0;
        int n3 = 17;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3C));
            n3 = n3;
        }
    }
}

