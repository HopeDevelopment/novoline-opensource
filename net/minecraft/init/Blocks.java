/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import cc.novoline.invoke.BootstrapInvoker;
import cc.novoline.string.StringPool4;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.ResourceLocation;
import net.a82;
import net.f2_0;
import net.f8_0;
import net.f9_0;
import net.fc_2;
import net.ff_1;
import net.ff_2;
import net.fg_1;
import net.fg_2;
import net.fl_1;
import net.fq_1;
import net.fs_1;
import net.ft_1;
import net.fu_0;
import net.fy_1;
import net.g3_0;
import net.g6_0;
import net.g8_0;
import net.gi_2;
import net.gl_1;
import net.gn_1;
import net.gp_1;
import net.gs_1;
import net.gu_2;
import net.gy_1;
import net.hd_1;
import net.hj_2;

public class Blocks {
    public static BlockGrass grass;
    public static Block aU;
    public static Block cb;
    public static fq_1 h;
    public static Block Q;
    public static Block bc;
    public static Block cr;
    public static Block ar;
    public static fg_2 am;
    public static Block z;
    public static Block ax;
    public static g3_0 ci;
    public static Block ap;
    public static Block ao;
    public static Block cg;
    public static Block aS;
    public static Block bI;
    public static Block aG;
    public static Block b8;
    public static Block o;
    public static BlockDynamicLiquid flowing_lava;
    public static Block v;
    public static Block bb;
    public static f2_0 ca;
    public static ff_2 au;
    public static gp_1 aE;
    public static Block coal_ore;
    public static Block U;
    public static fc_2 bn;
    public static BlockSand sand;
    public static Block a7;
    public static Block a8;
    public static Block by;
    public static Block ch;
    public static Block T;
    public static Block bJ;
    public static Block at;
    public static Block aV;
    public static Block aC;
    public static Block q;
    public static BlockLeaves bP;
    public static Block O;
    public static Block bO;
    public static Block al;
    public static Block b1;
    public static Block cq;
    public static Block co;
    public static fy_1 t;
    public static f9_0 u;
    public static Block ae;
    public static Block bh;
    public static Block J;
    public static Block H;
    public static g8_0 bj;
    public static Block b2;
    public static Block Y;
    public static Block C;
    public static Block bW;
    public static gn_1 ad;
    public static gy_1 P;
    public static Block bG;
    public static Block aA;
    public static Block an;
    public static Block D;
    public static Block b7;
    public static Block bq;
    public static Block bX;
    public static Block ak;
    public static Block planks;
    public static BlockLeaves bM;
    public static Block w;
    public static Block bQ;
    public static Block as;
    public static Block p;
    public static Block N;
    public static Block cj;
    public static Block a5;
    public static ft_1 aR;
    public static Block air;
    public static Block ab;
    public static g6_0 ck;
    public static hd_1 be;
    public static Block bm;
    public static Block cp;
    public static hj_2 a_;
    public static Block ac;
    public static Block aN;
    public static Block bs;
    public static Block S;
    public static Block aD;
    public static Block aB;
    public static f9_0 aI;
    public static gu_2 bR;
    public static Block bK;
    public static BlockDynamicLiquid flowing_water;
    public static Block K;
    public static Block br;
    public static Block aj;
    public static Block bF;
    public static BlockStaticLiquid lava;
    public static Block bt;
    public static Block I;
    public static Block B;
    public static hj_2 e;
    public static Block cf;
    public static Block aQ;
    public static gu_2 bk;
    public static Block iron_ore;
    public static Block aL;
    public static Block bz;
    public static Block stone;
    public static Block a;
    public static ff_1 a9;
    public static Block aa;
    public static Block cd;
    public static fc_2 A;
    public static Block bV;
    public static Block ct;
    public static Block j;
    public static BlockStaticLiquid water;
    public static Block cobblestone;
    public static Block bZ;
    public static Block av;
    public static Block bo;
    public static Block aM;
    public static Block bl;
    public static Block sapling;
    public static Block bd;
    public static Block f;
    public static Block b4;
    public static g3_0 aP;
    public static Block aW;
    public static Block gold_ore;
    public static fs_1 R;
    public static Block aY;
    public static Block a2;
    public static Block aJ;
    public static Block b9;
    public static f8_0 d;
    public static hj_2 X;
    public static Block bL;
    public static Block m;
    public static Block bx;
    public static Block a6;
    public static fu_0 bY;
    public static Block y;
    public static Block bp;
    public static Block b_;
    public static Block a1;
    public static fg_1 bN;
    public static Block aw;
    public static Block bg;
    public static fu_0 G;
    public static Block aK;
    public static Block s;
    public static Block F;
    public static Block aH;
    public static Block Z;
    public static gi_2 bB;
    public static Block cs;
    public static Block a3;
    public static Block bw;
    public static Block ba;
    public static Block az;
    public static fl_1 ai;
    public static gl_1 c;
    public static Block L;
    public static Block cm;
    public static Block g;
    public static Block bT;
    public static hj_2 bf;
    public static Block b5;
    public static Block dirt;
    public static Block aZ;
    public static Block b6;
    public static Block aO;
    public static Block n;
    public static Block cl;
    public static Block bH;
    public static Block bedrock;
    public static hj_2 bA;
    public static Block bu;
    public static hj_2 ah;
    public static Block bD;
    public static Block ag;
    public static Block M;
    public static gs_1 af;
    public static Block i;
    public static Block aq;
    public static Block aX;
    public static Block a4;
    public static Block ay;
    public static Block b;
    public static Block aT;
    public static Block x;
    public static gi_2 E;
    public static Block gravel;
    public static Block r;

    private static Block getRegisteredBlock(String string) {
        return (Block)a82.a(Block.m, new ResourceLocation(string));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    static {
        if (!BootstrapInvoker.b()) {
            throw new RuntimeException(StringPool4.al);
        }
        air = Blocks.getRegisteredBlock(StringPool4.bK);
        stone = Blocks.getRegisteredBlock(StringPool4.aa);
        grass = (BlockGrass)Blocks.getRegisteredBlock(StringPool4.cj);
        dirt = Blocks.getRegisteredBlock(StringPool4.ae);
        cobblestone = Blocks.getRegisteredBlock(StringPool4.a1);
        planks = Blocks.getRegisteredBlock(StringPool4.a4);
        sapling = Blocks.getRegisteredBlock(StringPool4.aD);
        bedrock = Blocks.getRegisteredBlock(StringPool4.j);
        flowing_water = (BlockDynamicLiquid)Blocks.getRegisteredBlock(StringPool4.ci);
        water = (BlockStaticLiquid)Blocks.getRegisteredBlock(StringPool4.z);
        flowing_lava = (BlockDynamicLiquid)Blocks.getRegisteredBlock(StringPool4.bl);
        lava = (BlockStaticLiquid)Blocks.getRegisteredBlock(StringPool4.b5);
        sand = (BlockSand)Blocks.getRegisteredBlock(StringPool4.ck);
        gravel = Blocks.getRegisteredBlock(StringPool4.y);
        gold_ore = Blocks.getRegisteredBlock(StringPool4.Y);
        iron_ore = Blocks.getRegisteredBlock(StringPool4.a9);
        coal_ore = Blocks.getRegisteredBlock(StringPool4.an);
        b2 = Blocks.getRegisteredBlock(StringPool4.aZ);
        bO = Blocks.getRegisteredBlock(StringPool4.t);
        bP = (BlockLeaves)Blocks.getRegisteredBlock(StringPool4.bN);
        bM = (BlockLeaves)Blocks.getRegisteredBlock(StringPool4.aY);
        aM = Blocks.getRegisteredBlock(StringPool4.av);
        a8 = Blocks.getRegisteredBlock(StringPool4.aQ);
        bH = Blocks.getRegisteredBlock(StringPool4.ap);
        ba = Blocks.getRegisteredBlock(StringPool4.b8);
        aB = Blocks.getRegisteredBlock(StringPool4.aA);
        bG = Blocks.getRegisteredBlock(StringPool4.cm);
        q = Blocks.getRegisteredBlock(StringPool4.at);
        aw = Blocks.getRegisteredBlock(StringPool4.bQ);
        bg = Blocks.getRegisteredBlock(StringPool4.bm);
        bX = Blocks.getRegisteredBlock(StringPool4.cq);
        E = (gi_2)Blocks.getRegisteredBlock(StringPool4.U);
        bI = Blocks.getRegisteredBlock(StringPool4.p);
        bN = (fg_1)Blocks.getRegisteredBlock(StringPool4.bk);
        ca = (f2_0)Blocks.getRegisteredBlock(StringPool4.D);
        bB = (gi_2)Blocks.getRegisteredBlock(StringPool4.o);
        bj = (g8_0)Blocks.getRegisteredBlock(StringPool4.bu);
        b_ = Blocks.getRegisteredBlock(StringPool4.bc);
        aR = (ft_1)Blocks.getRegisteredBlock(StringPool4.F);
        G = (fu_0)Blocks.getRegisteredBlock(StringPool4.aG);
        bY = (fu_0)Blocks.getRegisteredBlock(StringPool4.bb);
        A = (fc_2)Blocks.getRegisteredBlock(StringPool4.ce);
        bn = (fc_2)Blocks.getRegisteredBlock(StringPool4.e);
        D = Blocks.getRegisteredBlock(StringPool4.J);
        co = Blocks.getRegisteredBlock(StringPool4.bn);
        X = (hj_2)Blocks.getRegisteredBlock(StringPool4.a7);
        bA = (hj_2)Blocks.getRegisteredBlock(StringPool4.G);
        bL = Blocks.getRegisteredBlock(StringPool4.a_);
        Y = Blocks.getRegisteredBlock(StringPool4.bE);
        at = Blocks.getRegisteredBlock(StringPool4.bI);
        L = Blocks.getRegisteredBlock(StringPool4.ca);
        O = Blocks.getRegisteredBlock(StringPool4.ct);
        bD = Blocks.getRegisteredBlock(StringPool4.ah);
        c = (gl_1)Blocks.getRegisteredBlock(StringPool4.bg);
        p = Blocks.getRegisteredBlock(StringPool4.bd);
        a7 = Blocks.getRegisteredBlock(StringPool4.k);
        R = (fs_1)Blocks.getRegisteredBlock(StringPool4.ag);
        af = (gs_1)Blocks.getRegisteredBlock(StringPool4.bB);
        C = Blocks.getRegisteredBlock(StringPool4.l);
        ar = Blocks.getRegisteredBlock(StringPool4.bC);
        aq = Blocks.getRegisteredBlock(StringPool4.am);
        ay = Blocks.getRegisteredBlock(StringPool4.a2);
        al = Blocks.getRegisteredBlock(StringPool4.aM);
        ab = Blocks.getRegisteredBlock(StringPool4.bZ);
        a = Blocks.getRegisteredBlock(StringPool4.cc);
        bp = Blocks.getRegisteredBlock(StringPool4.ad);
        bh = Blocks.getRegisteredBlock(StringPool4.aW);
        o = Blocks.getRegisteredBlock(StringPool4.bD);
        aC = Blocks.getRegisteredBlock(StringPool4.bs);
        ax = Blocks.getRegisteredBlock(StringPool4.aS);
        aV = Blocks.getRegisteredBlock(StringPool4.bX);
        az = Blocks.getRegisteredBlock(StringPool4.q);
        bm = Blocks.getRegisteredBlock(StringPool4.aj);
        bQ = Blocks.getRegisteredBlock(StringPool4.P);
        U = Blocks.getRegisteredBlock(StringPool4.X);
        cj = Blocks.getRegisteredBlock(StringPool4.b6);
        aG = Blocks.getRegisteredBlock(StringPool4.Z);
        j = Blocks.getRegisteredBlock(StringPool4.aX);
        bb = Blocks.getRegisteredBlock(StringPool4.aJ);
        ae = Blocks.getRegisteredBlock(StringPool4.W);
        b5 = Blocks.getRegisteredBlock(StringPool4.cg);
        b4 = Blocks.getRegisteredBlock(StringPool4.c);
        i = Blocks.getRegisteredBlock(StringPool4.aV);
        br = Blocks.getRegisteredBlock(StringPool4.ak);
        bF = Blocks.getRegisteredBlock(StringPool4.cr);
        cm = Blocks.getRegisteredBlock(StringPool4.aq);
        I = Blocks.getRegisteredBlock(StringPool4.be);
        bq = Blocks.getRegisteredBlock(StringPool4.bS);
        a9 = (ff_1)Blocks.getRegisteredBlock(StringPool4.M);
        T = Blocks.getRegisteredBlock(StringPool4.cf);
        P = (gy_1)Blocks.getRegisteredBlock(StringPool4.b);
        a5 = Blocks.getRegisteredBlock(StringPool4.bx);
        Z = Blocks.getRegisteredBlock(StringPool4.aE);
        cg = Blocks.getRegisteredBlock(StringPool4.ac);
        n = Blocks.getRegisteredBlock(StringPool4.aF);
        m = Blocks.getRegisteredBlock(StringPool4.n);
        bo = Blocks.getRegisteredBlock(StringPool4.bT);
        cp = Blocks.getRegisteredBlock(StringPool4.b2);
        ap = Blocks.getRegisteredBlock(StringPool4.b4);
        bu = Blocks.getRegisteredBlock(StringPool4.Q);
        s = Blocks.getRegisteredBlock(StringPool4.g);
        bs = Blocks.getRegisteredBlock(StringPool4.ai);
        h = (fq_1)Blocks.getRegisteredBlock(StringPool4.b9);
        a1 = Blocks.getRegisteredBlock(StringPool4.bq);
        aX = Blocks.getRegisteredBlock(StringPool4.A);
        aP = (g3_0)Blocks.getRegisteredBlock(StringPool4.cl);
        ci = (g3_0)Blocks.getRegisteredBlock(StringPool4.aK);
        ac = Blocks.getRegisteredBlock(StringPool4.aN);
        bV = Blocks.getRegisteredBlock(StringPool4.aH);
        z = Blocks.getRegisteredBlock(StringPool4.co);
        aj = Blocks.getRegisteredBlock(StringPool4.v);
        Q = Blocks.getRegisteredBlock(StringPool4.bR);
        by = Blocks.getRegisteredBlock(StringPool4.a3);
        cd = Blocks.getRegisteredBlock(StringPool4.bG);
        aQ = Blocks.getRegisteredBlock(StringPool4.a6);
        aL = Blocks.getRegisteredBlock(StringPool4.m);
        b9 = Blocks.getRegisteredBlock(StringPool4.a);
        as = Blocks.getRegisteredBlock(StringPool4.C);
        ch = Blocks.getRegisteredBlock(StringPool4.bt);
        a4 = Blocks.getRegisteredBlock(StringPool4.aB);
        aZ = Blocks.getRegisteredBlock(StringPool4.b3);
        S = Blocks.getRegisteredBlock(StringPool4.aI);
        cb = Blocks.getRegisteredBlock(StringPool4.a8);
        x = Blocks.getRegisteredBlock(StringPool4.bw);
        aU = Blocks.getRegisteredBlock(StringPool4.K);
        bZ = Blocks.getRegisteredBlock(StringPool4.bF);
        aE = (gp_1)Blocks.getRegisteredBlock(StringPool4.bp);
        an = Blocks.getRegisteredBlock(StringPool4.bi);
        ak = Blocks.getRegisteredBlock(StringPool4.bW);
        a6 = Blocks.getRegisteredBlock(StringPool4.d);
        ct = Blocks.getRegisteredBlock(StringPool4.bj);
        a2 = Blocks.getRegisteredBlock(StringPool4.bU);
        bw = Blocks.getRegisteredBlock(StringPool4.S);
        B = Blocks.getRegisteredBlock(StringPool4.ay);
        au = (ff_2)Blocks.getRegisteredBlock(StringPool4.s);
        aS = Blocks.getRegisteredBlock(StringPool4.u);
        aK = Blocks.getRegisteredBlock(StringPool4.cn);
        H = Blocks.getRegisteredBlock(StringPool4.E);
        bW = Blocks.getRegisteredBlock(StringPool4.aP);
        M = Blocks.getRegisteredBlock(StringPool4.br);
        f = Blocks.getRegisteredBlock(StringPool4.aO);
        a_ = (hj_2)Blocks.getRegisteredBlock(StringPool4.V);
        e = (hj_2)Blocks.getRegisteredBlock(StringPool4.R);
        aN = Blocks.getRegisteredBlock(StringPool4.by);
        aO = Blocks.getRegisteredBlock(StringPool4.ao);
        K = Blocks.getRegisteredBlock(StringPool4.L);
        g = Blocks.getRegisteredBlock(StringPool4.b_);
        be = (hd_1)Blocks.getRegisteredBlock(StringPool4.x);
        b7 = Blocks.getRegisteredBlock(StringPool4.N);
        av = Blocks.getRegisteredBlock(StringPool4.cu);
        aT = Blocks.getRegisteredBlock(StringPool4.bh);
        F = Blocks.getRegisteredBlock(StringPool4.cp);
        aa = Blocks.getRegisteredBlock(StringPool4.az);
        bz = Blocks.getRegisteredBlock(StringPool4.T);
        d = (f8_0)Blocks.getRegisteredBlock(StringPool4.au);
        w = Blocks.getRegisteredBlock(StringPool4.bL);
        N = Blocks.getRegisteredBlock(StringPool4.ab);
        aY = Blocks.getRegisteredBlock(StringPool4.cs);
        b8 = Blocks.getRegisteredBlock(StringPool4.H);
        cq = Blocks.getRegisteredBlock(StringPool4.f);
        ck = (g6_0)Blocks.getRegisteredBlock(StringPool4.aT);
        J = Blocks.getRegisteredBlock(StringPool4.b0);
        aA = Blocks.getRegisteredBlock(StringPool4.bH);
        bd = Blocks.getRegisteredBlock(StringPool4.ch);
        aW = Blocks.getRegisteredBlock(StringPool4.bV);
        bR = (gu_2)Blocks.getRegisteredBlock(StringPool4.bM);
        bk = (gu_2)Blocks.getRegisteredBlock(StringPool4.w);
        u = (f9_0)Blocks.getRegisteredBlock(StringPool4.O);
        aI = (f9_0)Blocks.getRegisteredBlock(StringPool4.aC);
        bT = Blocks.getRegisteredBlock(StringPool4.h);
        cl = Blocks.getRegisteredBlock(StringPool4.bP);
        t = (fy_1)Blocks.getRegisteredBlock(StringPool4.ax);
        v = Blocks.getRegisteredBlock(StringPool4.I);
        a3 = Blocks.getRegisteredBlock(StringPool4.cb);
        bc = Blocks.getRegisteredBlock(StringPool4.af);
        ag = Blocks.getRegisteredBlock(StringPool4.a0);
        cr = Blocks.getRegisteredBlock(StringPool4.aw);
        ao = Blocks.getRegisteredBlock(StringPool4.bJ);
        bt = Blocks.getRegisteredBlock(StringPool4.bY);
        y = Blocks.getRegisteredBlock(StringPool4.a5);
        bl = Blocks.getRegisteredBlock(StringPool4.aU);
        aJ = Blocks.getRegisteredBlock(StringPool4.bO);
        bK = Blocks.getRegisteredBlock(StringPool4.B);
        bJ = Blocks.getRegisteredBlock(StringPool4.ba);
        bx = Blocks.getRegisteredBlock(StringPool4.aR);
        cf = Blocks.getRegisteredBlock(StringPool4.aL);
        b = Blocks.getRegisteredBlock(StringPool4.bA);
        ai = (fl_1)Blocks.getRegisteredBlock(StringPool4.as);
        am = (fg_2)Blocks.getRegisteredBlock(StringPool4.i);
        ad = (gn_1)Blocks.getRegisteredBlock(StringPool4.r);
        aD = Blocks.getRegisteredBlock(StringPool4.bf);
        b6 = Blocks.getRegisteredBlock(StringPool4.cd);
        cs = Blocks.getRegisteredBlock(StringPool4.bo);
        aH = Blocks.getRegisteredBlock(StringPool4.b1);
        r = Blocks.getRegisteredBlock(StringPool4.bv);
        b1 = Blocks.getRegisteredBlock(StringPool4.b7);
        ah = (hj_2)Blocks.getRegisteredBlock(StringPool4.bz);
        bf = (hj_2)Blocks.getRegisteredBlock(StringPool4.ar);
    }
}

