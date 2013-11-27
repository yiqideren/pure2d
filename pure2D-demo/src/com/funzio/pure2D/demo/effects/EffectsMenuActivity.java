package com.funzio.pure2D.demo.effects;

import com.funzio.pure2D.demo.R;
import com.funzio.pure2D.demo.activities.MenuActivity;

public class EffectsMenuActivity extends MenuActivity {

    @Override
    protected int getLayout() {
        return R.layout.effect_menu;
    }

    @Override
    protected void createMenus() {
        addMenu(R.id.btn_sparks, SparksActivity.class);
        addMenu(R.id.btn_motion_trail_shape, MotionTrailShapeActivity.class);
        addMenu(R.id.btn_uni_motion_trail_shape, UniMotionTrailShapeActivity.class);
        addMenu(R.id.btn_motion_trail_plot, MotionTrailPlotActivity.class);
        addMenu(R.id.btn_uni_motion_trail_plot, UniMotionTrailPlotActivity.class);
    }
}
