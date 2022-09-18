package com.example.fitness_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class course_detail extends AppCompatActivity {

    ConstraintLayout expandableview_step;
    Button button_arrow_step;
    CardView cardView_step;
    ConstraintLayout expandableview_benefit;
    Button button_arrow_benefit;
    CardView cardView_benefit;

    int detail_button;
    ImageView imageView_gif;
    JustifyTextView textView_step, textView_benefit;

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        floatingActionButton = findViewById(R.id.floating_timer);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(course_detail.this , timer.class);
                startActivity(intent);
            }
        });

        detail_button = getIntent().getIntExtra("detail_button",0);
        imageView_gif = findViewById(R.id.imageview_gif);
        textView_step = findViewById(R.id.textView_step);
        textView_benefit = findViewById(R.id.textView_benefit);
        getSupportActionBar().setTitle(detail_button);

        switch (detail_button)
        {
            case R.string.abdominal_crunches :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.abdominal_crunches_step);
                textView_benefit.setText(R.string.abdominal_crunches_benefit);
                break;

            case R.string.arm_scissors :
                imageView_gif.setImageResource(R.drawable.arm_scissors);
                textView_step.setText(R.string.arm_scissors_step);
                textView_benefit.setText(R.string.arm_scissors_benefit);
                break;

            case R.string.backward_lunges :
                imageView_gif.setImageResource(R.drawable.lungeback);
                textView_step.setText(R.string.backward_lunges_step);
                textView_benefit.setText(R.string.backward_lunges_benefit);
                break;

            case R.string.bicycle_crunches :
                imageView_gif.setImageResource(R.drawable.bicycle_crunches);
                textView_step.setText(R.string.bicycle_crunches_step);
                textView_benefit.setText(R.string.bicycle_crunches_benefit);
                break;

            case R.string.burpees :
                imageView_gif.setImageResource(R.drawable.burpees);
                textView_step.setText(R.string.burpees_step);
                textView_benefit.setText(R.string.burpees_benefit);
                break;

            case R.string.cobra_stretch :
                imageView_gif.setImageResource(R.drawable.cobra);
                textView_step.setText(R.string.cobra_stretch_step);
                textView_benefit.setText(R.string.cobra_stretch_benefit);
                break;

            case R.string.forward_lunges :
                imageView_gif.setImageResource(R.drawable.forwardlunge);
                textView_step.setText(R.string.forward_lunges_step);
                textView_benefit.setText(R.string.forward_lunges_benefit);
                break;

            case R.string.inchworms :
                imageView_gif.setImageResource(R.drawable.inchworms);
                textView_step.setText(R.string.inchworms_step);
                textView_benefit.setText(R.string.inchworms_benefit);
                break;

            case R.string.jumping_jack :
                imageView_gif.setImageResource(R.drawable.jumping_jack);
                textView_step.setText(R.string.jumping_jack_step);
                textView_benefit.setText(R.string.jumping_jack_benefit);
                break;

            case R.string.jumping_squats :
                imageView_gif.setImageResource(R.drawable.jumping_squats);
                textView_step.setText(R.string.jumping_squats_step);
                textView_benefit.setText(R.string.jumping_squats_benefit);
                break;

            case R.string.mountain_climbers :
                imageView_gif.setImageResource(R.drawable.mountain_climbers);
                textView_step.setText(R.string.mountain_climbers_step);
                textView_benefit.setText(R.string.mountain_climbers_benefit);
                break;

            case R.string.push_ups :
                imageView_gif.setImageResource(R.drawable.push_ups);
                textView_step.setText(R.string.push_ups_step);
                textView_benefit.setText(R.string.push_ups_benefit);
                break;

            case R.string.side_hop :
                imageView_gif.setImageResource(R.drawable.side_hop);
                textView_step.setText(R.string.side_hop_step);
                textView_benefit.setText(R.string.side_hop_benefit);
                break;

            case R.string.skipping_without_rope :
                imageView_gif.setImageResource(R.drawable.skippingrope);
                textView_step.setText(R.string.skipping_without_rope_step);
                textView_benefit.setText(R.string.skipping_without_rope_benefit);
                break;

            case R.string.squats :
                imageView_gif.setImageResource(R.drawable.squats);
                textView_step.setText(R.string.squats_step);
                textView_benefit.setText(R.string.squats_benefit);
                break;

            case R.string.incline_push_ups :
                imageView_gif.setImageResource(R.drawable.inclinepushup);
                textView_step.setText(R.string.incline_push_ups_step);
                textView_benefit.setText(R.string.incline_push_ups_benefit);
                break;

            case R.string.box_push_ups :
                imageView_gif.setImageResource(R.drawable.boxpushups);
                textView_step.setText(R.string.box_push_ups_step);
                textView_benefit.setText(R.string.box_push_ups_benefit);
                break;

            case R.string.knee_push_ups :
                imageView_gif.setImageResource(R.drawable.knee_push_ups);
                textView_step.setText(R.string.knee_push_ups_step);
                textView_benefit.setText(R.string.knee_push_ups_benefit);
                break;

            case R.string.wide_arm_push_ups :
                imageView_gif.setImageResource(R.drawable.wide_arm_push_ups);
                textView_step.setText(R.string.wide_arm_push_ups_step);
                textView_benefit.setText(R.string.wide_arm_push_ups_benefit);
                break;

            case R.string.chest_stertch :
                imageView_gif.setImageResource(R.drawable.cheststretch);
                textView_step.setText(R.string.chest_stertch_step);
                textView_benefit.setText(R.string.chest_stertch_benefit);
                break;

            case R.string.side_lying_leg_lift_left :
                imageView_gif.setImageResource(R.drawable.side_lying_leg_lift_left);
                textView_step.setText(R.string.side_lying_leg_lift_left_step);
                textView_benefit.setText(R.string.side_lying_leg_lift_left_benefit);
                break;

            case R.string.side_lying_leg_lift_right :
                imageView_gif.setImageResource(R.drawable.side_lying_leg_lift_right);
                textView_step.setText(R.string.side_lying_leg_lift_right_step);
                textView_benefit.setText(R.string.side_lying_leg_lift_right_benefit);
                break;

            case R.string.donkey_kicks_left :
                imageView_gif.setImageResource(R.drawable.donkey_kicks_left);
                textView_step.setText(R.string.donkey_kicks_left_step);
                textView_benefit.setText(R.string.donkey_kicks_left_benefit);
                break;

            case R.string.donkey_kicks_right :
                imageView_gif.setImageResource(R.drawable.donkey_kicks_right);
                textView_step.setText(R.string.donkey_kicks_right_step);
                textView_benefit.setText(R.string.donkey_kicks_right_benefit);
                break;

            case R.string.left_quad_stretch_with_wall :
                imageView_gif.setImageResource(R.drawable.quadstretch);
                textView_step.setText(R.string.left_quad_stretch_with_wall_step);
                textView_benefit.setText(R.string.left_quad_stretch_with_wall_benefit);
                break;

            case R.string.right_quad_stretch_with_wall :
                imageView_gif.setImageResource(R.drawable.quadstretchright);
                textView_step.setText(R.string.right_quad_stretch_with_wall_step);
                textView_benefit.setText(R.string.right_quad_stretch_with_wall_benefit);
                break;

            case R.string.knee_to_chest_stretch_left :
                imageView_gif.setImageResource(R.drawable.kneetochest);
                textView_step.setText(R.string.knee_to_chest_stretch_left_step);
                textView_benefit.setText(R.string.knee_to_chest_stretch_left_benefit);
                break;

            case R.string.knee_to_chest_stretch_right :
                imageView_gif.setImageResource(R.drawable.kneetochestright);
                textView_step.setText(R.string.knee_to_chest_stretch_right_step);
                textView_benefit.setText(R.string.knee_to_chest_stretch_right_benefit);
                break;

            case R.string.hindu_push_ups :
                imageView_gif.setImageResource(R.drawable.hindu_push_ups);
                textView_step.setText(R.string.hindu_push_ups_step);
                textView_benefit.setText(R.string.hindu_push_ups_benefit);
                break;

            case R.string.staggered_push_ups :
                imageView_gif.setImageResource(R.drawable.staggered_push_ups);
                textView_step.setText(R.string.staggered_push_ups_step);
                textView_benefit.setText(R.string.staggered_push_ups_benefit);
                break;

            case R.string.push_ups_and_rotation :
                imageView_gif.setImageResource(R.drawable.push_ups_and_rotation);
                textView_step.setText(R.string.push_ups_and_rotation_step);
                textView_benefit.setText(R.string.push_ups_and_rotation_benefit);
                break;

            case R.string.decline_push_ups :
                imageView_gif.setImageResource(R.drawable.decline_push_ups);
                textView_step.setText(R.string.decline_push_ups_step);
                textView_benefit.setText(R.string.decline_push_ups_benefit);
                break;

            case R.string.spiderman_push_ups :
                imageView_gif.setImageResource(R.drawable.spiderman_push_ups);
                textView_step.setText(R.string.spiderman_push_ups_step);
                textView_benefit.setText(R.string.spiderman_push_ups_benefit);
                break;

            case R.string.russian_twist :
                imageView_gif.setImageResource(R.drawable.russian_twist);
                textView_step.setText(R.string.russian_twist_step);
                textView_benefit.setText(R.string.russian_twist_benefit);
                break;

            case R.string.heel_touch :
                imageView_gif.setImageResource(R.drawable.helltouches);
                textView_step.setText(R.string.heel_touch_step);
                textView_benefit.setText(R.string.heel_touch_benefit);
                break;

            case R.string.leg_raises :
                imageView_gif.setImageResource(R.drawable.leg_raises);
                textView_step.setText(R.string.leg_raises_step);
                textView_benefit.setText(R.string.leg_raises_benefit);
                break;

            case R.string.plank :
                imageView_gif.setImageResource(R.drawable.plank);
                textView_step.setText(R.string.plank_step);
                textView_benefit.setText(R.string.plank_benefit);
                break;

            case R.string.spine_lumber_twist_strech_left :
                imageView_gif.setImageResource(R.drawable.spinelumbar);
                textView_step.setText(R.string.spine_lumber_twist_strech_left_step);
                textView_benefit.setText(R.string.spine_lumber_twist_strech_left_benefit);
                break;

            case R.string.spine_lumber_twist_strech_right :
                imageView_gif.setImageResource(R.drawable.spine_lumbar_right);
                textView_step.setText(R.string.spine_lumber_twist_strech_right_step);
                textView_benefit.setText(R.string.spine_lumber_twist_strech_right_benefit);
                break;

            case R.string.crossover_crunch :
                imageView_gif.setImageResource(R.drawable.crossover_crunches);
                textView_step.setText(R.string.crossover_crunch_step);
                textView_benefit.setText(R.string.crossover_crunch_benefit);
                break;

            case R.string.side_bridges_left :
                imageView_gif.setImageResource(R.drawable.side_bridges_left);
                textView_step.setText(R.string.side_bridges_left_step);
                textView_benefit.setText(R.string.side_bridges_left_benefit);
                break;

            case R.string.side_bridges_right :
                imageView_gif.setImageResource(R.drawable.side_bridges_right);
                textView_step.setText(R.string.side_bridges_right_step);
                textView_benefit.setText(R.string.side_bridges_right_benefit);
                break;

            case R.string.butt_bridge :
                imageView_gif.setImageResource(R.drawable.buttbridge);
                textView_step.setText(R.string.butt_bridge_step);
                textView_benefit.setText(R.string.butt_bridge_benefit);
                break;

            case R.string.v_up :
                imageView_gif.setImageResource(R.drawable.v_up);
                textView_step.setText(R.string.v_up_step);
                textView_benefit.setText(R.string.v_up_benefit);
                break;

            case R.string.side_plank_left :
                imageView_gif.setImageResource(R.drawable.sideplank);
                textView_step.setText(R.string.side_plank_left_step);
                textView_benefit.setText(R.string.side_plank_left_benefit);
                break;

            case R.string.side_plank_right :
                imageView_gif.setImageResource(R.drawable.side_plank_right);
                textView_step.setText(R.string.side_plank_right_step);
                textView_benefit.setText(R.string.side_plank_right_benefit);
                break;

            case R.string.sit_ups :
                imageView_gif.setImageResource(R.drawable.sit_ups);
                textView_step.setText(R.string.sit_ups_step);
                textView_benefit.setText(R.string.sit_ups_benefit);
                break;

            case R.string.arm_raises :
                imageView_gif.setImageResource(R.drawable.arm_raises);
                textView_step.setText(R.string.arm_raises_step);
                textView_benefit.setText(R.string.arm_raises_benefit);
                break;

            case R.string.side_arm_raises :
                imageView_gif.setImageResource(R.drawable.side_arm_raises);
                textView_step.setText(R.string.side_arm_raises_step);
                textView_benefit.setText(R.string.side_arm_raises_benefit);
                break;

            case R.string.triceps_dips :
                imageView_gif.setImageResource(R.drawable.triceps_dips);
                textView_step.setText(R.string.triceps_dips_step);
                textView_benefit.setText(R.string.triceps_dips_benefit);
                break;

            case R.string.arm_circles_clockwise :
                imageView_gif.setImageResource(R.drawable.arm_circles_clockwise);
                textView_step.setText(R.string.arm_circles_clockwise_step);
                textView_benefit.setText(R.string.arm_circles_clockwise_benefit);
                break;

            case R.string.arm_circles_counter_clockwise :
                imageView_gif.setImageResource(R.drawable.arm_circles_counter_clockwise);
                textView_step.setText(R.string.arm_circles_counter_clockwise_step);
                textView_benefit.setText(R.string.arm_circles_counter_clockwise_benefit);
                break;

            case R.string.diamond_push_ups :
                imageView_gif.setImageResource(R.drawable.diamond_pushups);
                textView_step.setText(R.string.diamond_push_ups_step);
                textView_benefit.setText(R.string.diamond_push_ups_benefit);
                break;

            case R.string.leg_barbell_curl_left :
                imageView_gif.setImageResource(R.drawable.leg_barbell_curl);
                textView_step.setText(R.string.leg_barbell_curl_left_step);
                textView_benefit.setText(R.string.leg_barbell_curl_left_benefit);
                break;

            case R.string.leg_barbell_curl_right :
                imageView_gif.setImageResource(R.drawable.leg_barbell_curl_right);
                textView_step.setText(R.string.leg_barbell_curl_right_step);
                textView_benefit.setText(R.string.leg_barbell_curl_right_benefit);
                break;

            case R.string.diagonal_plank :
                imageView_gif.setImageResource(R.drawable.diagonal_plank);
                textView_step.setText(R.string.diagonal_plank_step);
                textView_benefit.setText(R.string.diagonal_plank_benefit);
                break;

            case R.string.wall_push_ups :
                imageView_gif.setImageResource(R.drawable.wall_pushups);
                textView_step.setText(R.string.wall_push_ups_step);
                textView_benefit.setText(R.string.wall_push_ups_benefit);
                break;

            case R.string.triceps_stretch_left :
                imageView_gif.setImageResource(R.drawable.triceps_stretch_left);
                textView_step.setText(R.string.triceps_stretch_left_step);
                textView_benefit.setText(R.string.triceps_stretch_left_benefit);
                break;

            case R.string.triceps_stretch_right :
                imageView_gif.setImageResource(R.drawable.triceps_stretch_right);
                textView_step.setText(R.string.triceps_stretch_right_step);
                textView_benefit.setText(R.string.triceps_stretch_right_benefit);
                break;

            case R.string.standing_biceps_stretch_left :
                imageView_gif.setImageResource(R.drawable.standing_biceps_stretch);
                textView_step.setText(R.string.standing_biceps_stretch_left_step);
                textView_benefit.setText(R.string.standing_biceps_stretch_left_benefit);
                break;

            case R.string.standing_biceps_stretch_right :
                imageView_gif.setImageResource(R.drawable.standing_biceps_stretch_right);
                textView_step.setText(R.string.standing_biceps_stretch_right_step);
                textView_benefit.setText(R.string.standing_biceps_stretch_right_benefit);
                break;

            case R.string.floor_triceps_dips :
                imageView_gif.setImageResource(R.drawable.triceps_dips);
                textView_step.setText(R.string.floor_triceps_dips_step);
                textView_benefit.setText(R.string.floor_triceps_dips_benefit);
                break;

            case R.string.military_push_ups :
                imageView_gif.setImageResource(R.drawable.military_push_ups);
                textView_step.setText(R.string.military_push_ups_step);
                textView_benefit.setText(R.string.military_push_ups_benefit);
                break;

            case R.string.alternating_hooks :
                imageView_gif.setImageResource(R.drawable.alternating_hooks);
                textView_step.setText(R.string.alternating_hooks_step);
                textView_benefit.setText(R.string.alternating_hooks_benefit);
                break;

            case R.string.arm_curl_crunch_left :
                imageView_gif.setImageResource(R.drawable.arm_curl_crunch_left);
                textView_step.setText(R.string.arm_curl_crunch_left_step);
                textView_benefit.setText(R.string.arm_curl_crunch_left_benefit);
                break;

            case R.string.arm_curl_crunch_right :
                imageView_gif.setImageResource(R.drawable.arm_curl_crunch_right);
                textView_step.setText(R.string.arm_curl_crunch_right_step);
                textView_benefit.setText(R.string.arm_curl_crunch_right_benefit);
                break;

            case R.string.shoulder_gators :
                imageView_gif.setImageResource(R.drawable.shoulder_gators);
                textView_step.setText(R.string.shoulder_gators_step);
                textView_benefit.setText(R.string.shoulder_gators_benefit);
                break;

            case R.string.doorway_curls_left :
                imageView_gif.setImageResource(R.drawable.doorway_curl);
                textView_step.setText(R.string.doorway_curls_left_step);
                textView_benefit.setText(R.string.doorway_curls_left_benefit);
                break;

            case R.string.doorway_curls_right :
                imageView_gif.setImageResource(R.drawable.doorway_curl_right);
                textView_step.setText(R.string.doorway_curls_right_step);
                textView_benefit.setText(R.string.doorway_curls_right_benefit);
                break;

            case R.string.modified_push_ups_low_hold :
                imageView_gif.setImageResource(R.drawable.push_ups);
                textView_step.setText(R.string.modified_push_ups_low_hold_step);
                textView_benefit.setText(R.string.modified_push_ups_low_hold_benefit);
                break;

            case R.string.rhomboid_pulls :
                imageView_gif.setImageResource(R.drawable.quadstretch);
                textView_step.setText(R.string.rhomboid_pulls_step);
                textView_benefit.setText(R.string.rhomboid_pulls_benefit);
                break;

            case R.string.side_lying_floor_strerch_left :
                imageView_gif.setImageResource(R.drawable.side_lying_leg_lift_left);
                textView_step.setText(R.string.side_lying_floor_strerch_left_step);
                textView_benefit.setText(R.string.side_lying_floor_strerch_left_benefit);
                break;

            case R.string.side_lying_floor_strerch_right :
                imageView_gif.setImageResource(R.drawable.side_lying_leg_lift_right);
                textView_step.setText(R.string.side_lying_floor_strerch_right_step);
                textView_benefit.setText(R.string.side_lying_floor_strerch_right_benefit);
                break;

            case R.string.cat_cow_pose :
                imageView_gif.setImageResource(R.drawable.buttbridge);
                textView_step.setText(R.string.cat_cow_pose_step);
                textView_benefit.setText(R.string.cat_cow_pose_benefit);
                break;

            case R.string.reclined_rhomboid_squeezes :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.reclined_rhomboid_squeezes_step);
                textView_benefit.setText(R.string.reclined_rhomboid_squeezes_benefit);
                break;

            case R.string.childs_pose :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.childs_pose_step);
                textView_benefit.setText(R.string.childs_pose_benefit);
                break;

            case R.string.triceps_kickbacks :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.triceps_kickbacks_step);
                textView_benefit.setText(R.string.triceps_kickbacks_benefit);
                break;

            case R.string.hip_hinge :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.hip_hinge_step);
                textView_benefit.setText(R.string.hip_hinge_benefit);
                break;

            case R.string.hover_push_ups :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.hover_push_ups_step);
                textView_benefit.setText(R.string.hover_push_ups_benefit);
                break;

            case R.string.swimmer_and_superman :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.swimmer_and_superman_step);
                textView_benefit.setText(R.string.swimmer_and_superman_benefit);
                break;

            case R.string.hyperextension :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.hyperextension_step);
                textView_benefit.setText(R.string.hyperextension_benefit);
                break;

            case R.string.pike_push_ups :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.pike_push_ups_step);
                textView_benefit.setText(R.string.pike_push_ups_benefit);
                break;

            case R.string.reverse_push_ups :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.reverse_push_ups_step);
                textView_benefit.setText(R.string.reverse_push_ups_benefit);
                break;

            case R.string.supine_push_ups :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.supine_push_ups_step);
                textView_benefit.setText(R.string.supine_push_ups_benefit);
                break;

            case R.string.reverse_snow_angels :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.reverse_snow_angels_step);
                textView_benefit.setText(R.string.reverse_snow_angels_benefit);
                break;

            case R.string.wall_calf_raises :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.wall_calf_raises_step);
                textView_benefit.setText(R.string.wall_calf_raises_benefit);
                break;

            case R.string.sumo_squat_calf_raises_with_wall :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.sumo_squat_calf_raises_with_wall_step);
                textView_benefit.setText(R.string.sumo_squat_calf_raises_with_wall_benefit);
                break;

            case R.string.calf_stretch_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.calf_stretch_left_step);
                textView_benefit.setText(R.string.calf_stretch_left_benefit);
                break;

            case R.string.calf_stretch_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.calf_stretch_right_step);
                textView_benefit.setText(R.string.calf_stretch_right_benefit);
                break;

            case R.string.fire_hydrant_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.fire_hydrant_left_step);
                textView_benefit.setText(R.string.fire_hydrant_left_benefit);
                break;

            case R.string.fire_hydrant_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.fire_hydrant_right_step);
                textView_benefit.setText(R.string.fire_hydrant_right_benefit);
                break;

            case R.string.lunges :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.lunges_step);
                textView_benefit.setText(R.string.lunges_benefit);
                break;

            case R.string.side_leg_circles_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.side_leg_circles_left_step);
                textView_benefit.setText(R.string.side_leg_circles_left_benefit);
                break;

            case R.string.side_leg_circles_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.side_leg_circles_right_step);
                textView_benefit.setText(R.string.side_leg_circles_right_benefit);
                break;

            case R.string.sumo_squat :
                imageView_gif.setImageResource(R.drawable.sumo);
                textView_step.setText(R.string.sumo_squat_step);
                textView_benefit.setText(R.string.sumo_squat_benefit);
                break;

            case R.string.reverse_flutter_kicks :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.reverse_flutter_kicks_step);
                textView_benefit.setText(R.string.reverse_flutter_kicks_benefit);
                break;

            case R.string.wall_sit :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.wall_sit_step);
                textView_benefit.setText(R.string.wall_sit_benefit);
                break;

            case R.string.calf_raise_with_splayed_foot :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.calf_raise_with_splayed_foot_step);
                textView_benefit.setText(R.string.calf_raise_with_splayed_foot_benefit);
                break;

            case R.string.single_leg_calf_hop_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.single_leg_calf_hop_left_step);
                textView_benefit.setText(R.string.single_leg_calf_hop_left_benefit);
                break;

            case R.string.single_leg_calf_hop_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.single_leg_calf_hop_right_step);
                textView_benefit.setText(R.string.single_leg_calf_hop_right_benefit);
                break;

            case R.string.bottom_leg_lift_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.bottom_leg_lift_left_step);
                textView_benefit.setText(R.string.bottom_leg_lift_left_benefit);
                break;

            case R.string.bottom_leg_lift_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.bottom_leg_lift_right_step);
                textView_benefit.setText(R.string.bottom_leg_lift_right_benefit);
                break;

            case R.string.curtsy_lunges :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.curtsy_lunges_step);
                textView_benefit.setText(R.string.curtsy_lunges_benefit);
                break;

            case R.string.glute_kick_back_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.glute_kick_back_left_step);
                textView_benefit.setText(R.string.glute_kick_back_left_benefit);
                break;

            case R.string.glute_kick_back_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.glute_kick_back_right_step);
                textView_benefit.setText(R.string.glute_kick_back_right_benefit);
                break;

            case R.string.lying_butterfly_stretch :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.lying_butterfly_stretch_step);
                textView_benefit.setText(R.string.lying_butterfly_stretch_benefit);
                break;

            case R.string.leaning_stretcher_raises :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.leaning_stretcher_raises_step);
                textView_benefit.setText(R.string.leaning_stretcher_raises_benefit);
                break;

            case R.string.wall_resisting_single_leg_calf_raise_left :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.wall_resisting_single_leg_calf_raise_left_step);
                textView_benefit.setText(R.string.wall_resisting_single_leg_calf_raise_left_benefit);
                break;

            case R.string.wall_resisting_single_leg_calf_raise_right :
                imageView_gif.setImageResource(R.drawable.abdominal_crunches);
                textView_step.setText(R.string.wall_resisting_single_leg_calf_raise_right_step);
                textView_benefit.setText(R.string.wall_resisting_single_leg_calf_raise_right_benefit);
                break;

        }


        expandableview_step = findViewById(R.id.expandableview_step);
        button_arrow_step = findViewById(R.id.button_arrow_step);
        cardView_step = findViewById(R.id.cardview);

        button_arrow_step.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (expandableview_step.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView_step,new AutoTransition());
                    expandableview_step.setVisibility(View.VISIBLE);
                    button_arrow_step.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    expandableview_benefit.setVisibility(View.GONE);
                    button_arrow_benefit.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }else{
                    TransitionManager.beginDelayedTransition(cardView_step,new AutoTransition());
                    expandableview_step.setVisibility(View.GONE);
                    button_arrow_step.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


        expandableview_benefit = findViewById(R.id.expandableview_benefit);
        button_arrow_benefit = findViewById(R.id.button_arrow_benefit);
        cardView_benefit = findViewById(R.id.cardview);

        button_arrow_benefit.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(expandableview_benefit.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView_benefit,new AutoTransition());
                    expandableview_benefit.setVisibility(View.VISIBLE);
                    button_arrow_benefit.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    expandableview_step.setVisibility(View.GONE);
                    button_arrow_step.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }else{
                    TransitionManager.beginDelayedTransition(cardView_benefit,new AutoTransition());
                    expandableview_benefit.setVisibility(View.GONE);
                    button_arrow_benefit.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

    }
}