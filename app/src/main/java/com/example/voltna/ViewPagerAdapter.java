package com.example.voltna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Cambia los fragmentos según la posición
        switch (position) {
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return new Fragment3();
            default: return new Fragment1();
        }
    }

    @Override
    public int getCount() {
        return 3; // Número de fragmentos
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Títulos para las pestañas
        switch (position) {
            case 0: return "MENU";
            case 1: return "APLICACIONES";
            case 2: return "CONFIGURACION";
            default: return null;
        }
    }
}
