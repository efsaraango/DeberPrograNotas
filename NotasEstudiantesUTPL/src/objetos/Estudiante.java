package objetos;

import informacion.Operaciones;

/**
 *
 * @author SARANGO
 */
public class Estudiante {

    /*
    Nombre estudiante = nombre
    Alerta = rendir fina1, final2
    Promocion = aprovado,reprobado
    Foro = for1 , for2
    Chat = chat1, chat2 
    Video Colaboracion = vid1, vid2
    Tarea = tra1, tra2
    Examen precial = pre1, pre2
    Examen Final = fin1, fin2
     */
    private String nombre, alerta, promocion;

    private double for1, cha1, vid1, tra1, pre1, for2, cha2, vid2, tra2, pre2, fin1, fin2, total, totalBim1 = 0, totalBim2 = 0;

    //Creacion del constructor.
    public Estudiante(String nombre, double for1, double cha1, double vid1, double tra1, double pre1, double for2, double cha2, double vid2, double tra2, double pre2) {
        this.nombre = nombre;
        this.for1 = for1;
        this.cha1 = cha1;
        this.tra1 = tra1;
        this.pre1 = pre1;
        this.for2 = for2;
        this.cha2 = cha2;
        this.tra2 = tra2;
        this.pre2 = pre2;
        this.fin1 = 0;
        this.fin2 = 0;
        this.total = 0;
        this.totalBim1 = 0;
        this.totalBim2 = 0;
        this.alerta = "";
        this.promocion = "";

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public void setFor1(double for1) {
        this.for1 = for1;
    }

    public void setCha1(double cha1) {
        this.cha1 = cha1;
    }

    public void setVid1(double vid1) {
        this.vid1 = vid1;
    }

    public void setTra1(double tra1) {
        this.tra1 = tra1;
    }

    public void setPre1(double pre1) {
        this.pre1 = pre1;
    }

    public void setFor2(double for2) {
        this.for2 = for2;
    }

    public void setCha2(double cha2) {
        this.cha2 = cha2;
    }

    public void setVid2(double vid2) {
        this.vid2 = vid2;
    }

    public void setTra2(double tra2) {
        this.tra2 = tra2;
    }

    public void setPre2(double pre2) {
        this.pre2 = pre2;
    }

    public void setFin1(double fin1) {
        this.fin1 = fin1;
    }

    public void setFin2(double fin2) {
        this.fin2 = fin2;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlerta() {
        return alerta;
    }

    public String getPromocion() {
        return promocion;
    }

    public double getFor1() {
        return for1;
    }

    public double getCha1() {
        return cha1;
    }

    public double getVid1() {
        return vid1;
    }

    public double getTra1() {
        return tra1;
    }

    public double getPre1() {
        return pre1;
    }

    public double getFor2() {
        return for2;
    }

    public double getCha2() {
        return cha2;
    }

    public double getVid2() {
        return vid2;
    }

    public double getTra2() {
        return tra2;
    }

    public double getPre2() {
        return pre2;
    }

    public double getFin1() {
        return fin1;
    }

    public double getFin2() {
        return fin2;
    }

    public double getTotal() {
        return total;
    }

    //Este 
    public int calAlerta() {
        int opcion = 0;
        if (totalBim1 + totalBim2 == 0 && pre1 + pre2 == 0) {
            opcion = 4;
        } else {
            if (pre1 < 8 && pre2 < 8) {
                opcion = 3;

            } else if (pre1 < 8) {
                opcion = 1;

            } else if (pre2 < 8) {
                opcion = 2;
            }

            if (pre1 == pre2 && totalBim1 + totalBim2 < 28) {
                opcion = 2;

            } else if (pre1 > 8 && totalBim1 < 8) {
                opcion = 1;
            } else if (pre2 > 8 && totalBim2 < 8) {
                opcion = 2;
            }
        }
        return opcion;
    }

    /*
    * Metodo en el cual se calcula la promoicion.
     */
    public void calPromocion() {
        if (total >= 28) {
            promocion = "APROVADO";
        } else {
            promocion = "REPROVADO";
        }
    }

    public void calcular() {
        calTotalBimestre();
        switch (calAlerta()) {
            case 0:
                total = totalBim1 + totalBim2;

                break;
            case 1:
                fin1 = Operaciones.nota(20);
                total = fin1 + totalBim2;
                alerta = "Rendir Final 1";
                break;
            case 2:
                fin2 = Operaciones.nota(20);
                total = totalBim1 + fin2;
                alerta = "Rendir Final 2";
                break;
            case 3:
                fin1 = Operaciones.nota(20);
                fin2 = Operaciones.nota(20);
                total = fin1 + fin2;
                alerta = "Rendir Final 1 y Final 2";
                break;
            case 4:
                total = 0;
                alerta = "Reprobado falta trabajo";
                break;

        }
        if (total > 40) {
            total = 40;

        }
        calPromocion();

    }

    public void calTotalBimestre() {
        totalBim1 = for1 + cha1 + vid1 + tra1 + pre1;
        totalBim2 = for2 + cha2 + vid2 + tra2 + pre2;

    }

    @Override
    public String toString() {
        return String.format("%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%s;%s", nombre, for1, cha1, vid1, tra1, pre1, for2, cha2, vid2, tra2, pre2, fin1, fin2, total, alerta, promocion);

    }
}
