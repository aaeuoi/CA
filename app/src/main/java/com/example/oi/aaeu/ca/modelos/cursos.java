package com.example.oi.aaeu.ca.modelos;


import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import com.example.oi.aaeu.ca.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.String;

public class cursos {
    // Datos del curso
    public List<curso> curs = new ArrayList<curso>();
    protected curso[] cas_cursos;

    public cursos() {
        super();
    }

    public cursos(curso[] v4) {
        super();
        this.cas_cursos = v4;
    }

    public curso[] getCursos(View.OnClickListener onClickListener) {
        return cas_cursos;
    }
    public curso[] getCursos() {
        return cas_cursos;
    }

    public void setCursos(curso[] cas_cursos) {
        this.cas_cursos = cas_cursos;
    }

    public void setCursos(Context context) {
        Resources res = null;
        String[] r = null;
        curso[] cu = null;
        curso c = null;
        Date d = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        for (int i = 0; i < 11; i++) {
            r = res.getStringArray(res.getIdentifier("R.array.cu_" + "i", "array", context.getPackageName()));
            //r = res.getStringArray(R.array.cu_0);
            try {
                d = format.parse(r[6]);
                c = new curso(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]),
                        String.valueOf(r[3]), String.valueOf(r[4]), Integer.parseInt(r[5]),
                        d, String.valueOf(r[7]), String.valueOf(r[8]), String.valueOf(r[9])
                        , Integer.parseInt(r[10]), String.valueOf(r[11]), String.valueOf(r[12]),
                        String.valueOf(r[13]), String.valueOf(r[14]), String.valueOf(r[15]),
                        String.valueOf(r[16]), String.valueOf(r[17]), String.valueOf(r[18]),
                        String.valueOf(r[19]), Integer.parseInt(r[20]));
                cu[i] = c;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        cas_cursos = cu;
    }

    private void cargarCursos() {
        Resources res = null;
        String[] r = null;
        curso c = null;
        Date ds = null;
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy/MM/dd");
//        for (int i=0;i<11;i++) {
            String valor = "R.array.cu_" + "i";
            r = res.getStringArray(R.array.cu_0);
            try {
                ds = format3.parse(r[6]);
                c = new curso(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]),
                    String.valueOf(r[3]), String.valueOf(r[4]), Integer.parseInt(r[5]),
                    ds, String.valueOf(r[7]), String.valueOf(r[8]), String.valueOf(r[9])
                    , Integer.parseInt(r[10]), String.valueOf(r[11]), String.valueOf(r[12]),
                    String.valueOf(r[13]), String.valueOf(r[14]), String.valueOf(r[15]),
                    String.valueOf(r[16]), String.valueOf(r[17]), String.valueOf(r[18]),
                    String.valueOf(r[19]), Integer.parseInt(r[20]));
/*            c.setArea(Integer.parseInt(r[0]));
            c.setCategoria(Integer.parseInt(r[1]));
            c.setSubcategoria(Integer.parseInt(r[2]));
            c.setSku(String.valueOf(r[3]));
            c.setNombre(String.valueOf(r[4]));
            c.setDuracion(Integer.parseInt(r[5]));
            c.setInicio(Date.valueOf(r[6]));
            c.setFormato(String.valueOf(r[7]));
            c.setIdioma(String.valueOf(r[8]));
            c.setModalidad(String.valueOf(r[9]));
            c.setFabricante(Integer.parseInt(r[10]));
            c.setNivel(String.valueOf(r[11]));
            c.setOficial(String.valueOf(r[12]));
            c.setDocumentacion(String.valueOf(r[13]));
            c.setDescripcion(String.valueOf(r[14]));
            c.setObjetivos(String.valueOf(r[15]));
            c.setAudiencia(String.valueOf(r[16]));
            c.setContenidos(String.valueOf(r[17]));
            c.setImage(String.valueOf(r[18]));
            c.setPdf_curso(String.valueOf(r[19]));
            c.setDestacado(Integer.parseInt(r[20]));
            */
            curs.add(c);
            } catch (ParseException e) {
                e.printStackTrace();
            }
//        }
    }

    public void setCursos() {
        Resources res = null;
        String[] r = null;
        curso[] cu = null;
        curso c = null;
        Date d = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        for (int i = 0; i < 11; i++) {
//            int identificador = res.getIdentifier("R.array.cu_" + "i", "array", context.getPackageName());
            r = identificador(i,res,r);
            //r = res.getStringArray(R.array.cu_0);
            try {
                d = format.parse(r[6]);
                c = new curso(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]),
                        String.valueOf(r[3]), String.valueOf(r[4]), Integer.parseInt(r[5]),
                        d, String.valueOf(r[7]), String.valueOf(r[8]), String.valueOf(r[9])
                        , Integer.parseInt(r[10]), String.valueOf(r[11]), String.valueOf(r[12]),
                        String.valueOf(r[13]), String.valueOf(r[14]), String.valueOf(r[15]),
                        String.valueOf(r[16]), String.valueOf(r[17]), String.valueOf(r[18]),
                        String.valueOf(r[19]), Integer.parseInt(r[20]));
                cu[i] = c;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        cas_cursos = cu;
    }
    private String [] identificador (int i, Resources res, String[] r) {
        switch (i)
        {
            case 0:
                return res.getStringArray(R.array.cu_0);
            case 1:
                return res.getStringArray(R.array.cu_1);
            case 2:
                return res.getStringArray(R.array.cu_2);
            case 3:
                return res.getStringArray(R.array.cu_3);
            case 4:
                return res.getStringArray(R.array.cu_4);
            case 5:
                return res.getStringArray(R.array.cu_5);
            case 6:
                return res.getStringArray(R.array.cu_6);
            case 7:
                return res.getStringArray(R.array.cu_7);
            case 8:
                return res.getStringArray(R.array.cu_8);
            case 9:
                return res.getStringArray(R.array.cu_9);
            case 10:
                return res.getStringArray(R.array.cu_10);
            default:
                break;
        }
        return res.getStringArray(R.array.cu_0);

    }
    public String[] getNombres() {
        String[] nombres = null;
        for (int i=0;i < cas_cursos.length;i++) {
            nombres[i] = cas_cursos[i].getNombre();
        }
        return nombres;
    }
    public curso[] getCurso() {
        curso[] c = null;
        for (int i=0;i < cas_cursos.length;i++) {
            c[i] = cas_cursos[i];
        }
        return c;
    }
}
