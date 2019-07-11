package com.example.oi.aaeu.ca.fragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.oi.aaeu.ca.modelos.cursos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aaeu.oi
 * <p>
 * Es el marco que va proporcinando fotos al GaleriaFragement, almacennado para ello
 * la referencia a la colección de imágenes relativa al punto de interés en curso.
 * Emplea la clase FotoFragmentDeatil, para propicionar las vistas que se rendrizan en la Galeria
 * @since 26-03-2019
 */

public class FragmentAdapter extends FragmentPagerAdapter {


    List<Fragment> fragmentos;
    public String [] nombres ;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        fragmentos = new ArrayList();
    }

    public void agregarFragmentos(Fragment xfragmento){
        fragmentos.add(xfragmento);
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);
    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }


    public void setCursos()
    {
        cursos curs = null;
        curs.setCursos();
        nombres = curs.getNombres();

    }
}
