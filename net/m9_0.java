/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.m9
 */
public class m9_0
extends mi_1 {
    float az;

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        this.c(7 - this.ay * 8 / this.am);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.96f;
        this.motionY *= (double)0.96f;
        this.motionZ *= (double)0.96f;
        EntityPlayer entityPlayer = aV8.a(this.worldObj, (Entity)this, 2.0);
        if (this.posY > entityPlayer.getEntityBoundingBox().a) {
            this.posY += (entityPlayer.getEntityBoundingBox().a - this.posY) * 0.2;
            this.motionY += (entityPlayer.motionY - this.motionY) * 0.2;
            this.j(this.posX, this.posY, this.posZ);
        }
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        this.au = this.az * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }

    protected m9_0(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        float f = 2.5f;
        this.motionX *= (double)0.1f;
        this.motionY *= (double)0.1f;
        this.motionZ *= (double)0.1f;
        this.motionX += d4;
        this.motionY += d5;
        this.motionZ += d6;
        this.ao = this.av = 1.0f - (float)(MathInvoker.a() * (double)0.3f);
        this.an = this.av;
        this.au *= 0.75f;
        this.au *= f;
        this.az = this.au;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.3));
        this.am = (int)((float)this.am * f);
        this.H = false;
    }
}

