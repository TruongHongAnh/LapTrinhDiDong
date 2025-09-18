package Bai1.Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo204;
    private int mauSo204;
    public PhanSo(){
        tuSo204=0;
        mauSo204=1;
    }
    public PhanSo(int tuSo, int mauSo){
        this.tuSo204=tuSo;
        this.mauSo204=mauSo;
    }
    public void nhapPS(Scanner sc){
        int a;
        int b;
        do {
            System.out.print("\tNhap tu so : ");
            a=sc.nextInt();
            System.out.print("\tNhap mau so : ");
            b=sc.nextInt();
            if (b==0) {
                System.out.println("\tMau so khong duoc bang 0.Hay nhap lai!");
            }else{
                tuSo204=a;
                mauSo204=b;
            }
        } while (b==0);
    }
    public void hienThiPS(){
        if(tuSo204*mauSo204<0){
            System.out.println("\t-" + Math.abs(tuSo204)+"/" + Math.abs(mauSo204) );
        }else{
            System.out.println("\t"+ Math.abs(tuSo204)+"/" + Math.abs(mauSo204) );
        }
    }

    public PhanSo congPS(PhanSo ps2){
        int a=tuSo204*ps2.mauSo204 + ps2.tuSo204*mauSo204;
        int b=mauSo204*ps2.mauSo204;
        return new PhanSo(a,b);
    }
    
    public PhanSo truPS(PhanSo ps2){
        int a=tuSo204*ps2.mauSo204 - ps2.tuSo204*mauSo204;
        int b=mauSo204*ps2.mauSo204;
        return new PhanSo(a,b);
    }
    public PhanSo nhanPS(PhanSo ps2){
        int a=tuSo204*ps2.tuSo204;
        int b=mauSo204*ps2.mauSo204;
        return new PhanSo(a,b);
    }
    public PhanSo chiaPS(PhanSo ps2){
        int a=tuSo204*ps2.mauSo204;
        int b=mauSo204*ps2.tuSo204;
        return new PhanSo(a,b);
    }
    private int timUSCLN(int a, int b){
        int r=a%b;
        while (r!=0) {
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    public boolean kiemTraToiGian(){
        if (timUSCLN(mauSo204, mauSo204)==1) {
            return true;
        }
        return false;
    }
    public void toiGianPS(){
        int x=timUSCLN(mauSo204, mauSo204);
        tuSo204/=x;
        mauSo204/=x;

    }

}
