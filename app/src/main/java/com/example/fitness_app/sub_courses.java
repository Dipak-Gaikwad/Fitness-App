package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

import Adapters.sub_course_adapter;
import Classes.RecyclerItemClickListener;
import Models.sub_course_model;

public class sub_courses extends AppCompatActivity {
    RecyclerView recyclerView;
    public int sub_button;
    public int detail_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_courses);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.recyclerView);
        sub_button = getIntent().getIntExtra("sub_button",0);


        final ArrayList<sub_course_model> list = new ArrayList<>();

        switch (sub_button)
        {
            case R.drawable.weight_loss_:
                getSupportActionBar().setTitle(R.string.wieght_loss_workout);
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.abdominal_crunches));
                list.add(new sub_course_model(R.drawable.arm_scissors, R.string.arm_scissors));
                list.add(new sub_course_model(R.drawable.lungeback, R.string.backward_lunges));
                list.add(new sub_course_model(R.drawable.bicycle_crunches, R.string.bicycle_crunches));
                list.add(new sub_course_model(R.drawable.burpees, R.string.burpees));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.forwardlunge, R.string.forward_lunges));
                list.add(new sub_course_model(R.drawable.inchworms, R.string.inchworms));
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.jumping_squats, R.string.jumping_squats));
                list.add(new sub_course_model(R.drawable.mountain_climbers, R.string.mountain_climbers));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.side_hop, R.string.side_hop));
                list.add(new sub_course_model(R.drawable.skippingrope, R.string.skipping_without_rope));
                list.add(new sub_course_model(R.drawable.squats, R.string.squats));
                break;

            case R.drawable.full_bdy:
                getSupportActionBar().setTitle(R.string.full_body_workout);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.inclinepushup, R.string.incline_push_ups));
                list.add(new sub_course_model(R.drawable.boxpushups, R.string.box_push_ups));
                list.add(new sub_course_model(R.drawable.knee_push_ups, R.string.knee_push_ups));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.wide_arm_push_ups, R.string.wide_arm_push_ups));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.cheststretch, R.string.chest_stertch));
                break;

            case R.drawable.arm_bignner:
                getSupportActionBar().setTitle(R.string.arm_beginner);
                list.add(new sub_course_model(R.drawable.arm_raises, R.string.arm_raises));
                list.add(new sub_course_model(R.drawable.side_arm_raises, R.string.side_arm_raises));
                list.add(new sub_course_model(R.drawable.triceps_dips, R.string.triceps_dips));
                list.add(new sub_course_model(R.drawable.arm_circles_clockwise, R.string.arm_circles_clockwise));
                list.add(new sub_course_model(R.drawable.arm_circles_counter_clockwise, R.string.arm_circles_counter_clockwise));
                list.add(new sub_course_model(R.drawable.diamond_pushups, R.string.diamond_push_ups));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl, R.string.leg_barbell_curl_left));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl_right, R.string.leg_barbell_curl_right));
                list.add(new sub_course_model(R.drawable.diagonal_plank, R.string.diagonal_plank));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.inchworms, R.string.inchworms));
                list.add(new sub_course_model(R.drawable.wall_pushups, R.string.wall_push_ups));
                list.add(new sub_course_model(R.drawable.triceps_stretch_left, R.string.triceps_stretch_left));
                list.add(new sub_course_model(R.drawable.triceps_stretch_right, R.string.triceps_stretch_right));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch, R.string.standing_biceps_stretch_left));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch_right, R.string.standing_biceps_stretch_right));
                break;

            case R.drawable.arm_intermediate_bdy:
                getSupportActionBar().setTitle(R.string.arm_intermediate);
                list.add(new sub_course_model(R.drawable.arm_circles_clockwise, R.string.arm_circles_clockwise));
                list.add(new sub_course_model(R.drawable.arm_circles_counter_clockwise, R.string.arm_circles_counter_clockwise));
                list.add(new sub_course_model(R.drawable.triceps_dips, R.string.floor_triceps_dips));
                list.add(new sub_course_model(R.drawable.military_push_ups, R.string.military_push_ups));
                list.add(new sub_course_model(R.drawable.alternating_hooks, R.string.alternating_hooks));
                list.add(new sub_course_model(R.drawable.push_ups_and_rotation, R.string.push_ups_and_rotation));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl, R.string.leg_barbell_curl_left));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl_right, R.string.leg_barbell_curl_right));
                list.add(new sub_course_model(R.drawable.skippingrope, R.string.skipping_without_rope));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.arm_scissors, R.string.arm_scissors));
                list.add(new sub_course_model(R.drawable.triceps_stretch_left, R.string.triceps_stretch_left));
                list.add(new sub_course_model(R.drawable.triceps_stretch_right, R.string.triceps_stretch_right));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch, R.string.standing_biceps_stretch_left));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch_right, R.string.standing_biceps_stretch_right));
                break;

            case R.drawable.arm_advance_bdy:
                getSupportActionBar().setTitle(R.string.arm_advance);
                list.add(new sub_course_model(R.drawable.arm_circles_clockwise, R.string.arm_circles_clockwise));
                list.add(new sub_course_model(R.drawable.arm_circles_counter_clockwise, R.string.arm_circles_counter_clockwise));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl, R.string.leg_barbell_curl_left));
                list.add(new sub_course_model(R.drawable.leg_barbell_curl_right, R.string.leg_barbell_curl_right));
                list.add(new sub_course_model(R.drawable.burpees, R.string.burpees));
                list.add(new sub_course_model(R.drawable.arm_curl_crunch_left, R.string.arm_curl_crunch_left));
                list.add(new sub_course_model(R.drawable.arm_curl_crunch_right, R.string.arm_curl_crunch_right));
                list.add(new sub_course_model(R.drawable.triceps_dips, R.string.floor_triceps_dips));
                list.add(new sub_course_model(R.drawable.military_push_ups, R.string.military_push_ups));
                list.add(new sub_course_model(R.drawable.alternating_hooks, R.string.alternating_hooks));
                list.add(new sub_course_model(R.drawable.shoulder_gators, R.string.shoulder_gators));
                list.add(new sub_course_model(R.drawable.doorway_curl, R.string.doorway_curls_left));
                list.add(new sub_course_model(R.drawable.doorway_curl_right, R.string.doorway_curls_right));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.modified_push_ups_low_hold));
                list.add(new sub_course_model(R.drawable.push_ups_and_rotation, R.string.push_ups_and_rotation));
                list.add(new sub_course_model(R.drawable.triceps_stretch_left, R.string.triceps_stretch_left));
                list.add(new sub_course_model(R.drawable.triceps_stretch_right, R.string.triceps_stretch_right));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch, R.string.standing_biceps_stretch_left));
                list.add(new sub_course_model(R.drawable.standing_biceps_stretch_right, R.string.standing_biceps_stretch_right));
                break;

            case R.drawable.shoulder_back_bignner:
                getSupportActionBar().setTitle(R.string.shoulder_and_back_beginner);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.arm_scissors, R.string.arm_raises));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.rhomboid_pulls));
                list.add(new sub_course_model(R.drawable.side_arm_raises, R.string.side_arm_raises));
                list.add(new sub_course_model(R.drawable.knee_push_ups, R.string.knee_push_ups));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_left, R.string.side_lying_floor_strerch_left));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_right, R.string.side_lying_floor_strerch_right));
                list.add(new sub_course_model(R.drawable.arm_scissors, R.string.arm_scissors));
                list.add(new sub_course_model(R.drawable.buttbridge, R.string.cat_cow_pose));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.reclined_rhomboid_squeezes));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.childs_pose));
                break;

            case R.drawable.shoulder_back_intermediate_bdy:
                getSupportActionBar().setTitle(R.string.shoulder_and_back_intermediate);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.inclinepushup, R.string.incline_push_ups));
                list.add(new sub_course_model(R.drawable.russian_twist, R.string.russian_twist));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.rhomboid_pulls));
                list.add(new sub_course_model(R.drawable.triceps_dips, R.string.floor_triceps_dips));
                list.add(new sub_course_model(R.drawable.buttbridge, R.string.cat_cow_pose));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.triceps_kickbacks));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.hip_hinge));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_left, R.string.side_lying_floor_strerch_left));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_right, R.string.side_lying_floor_strerch_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.hover_push_ups));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.swimmer_and_superman));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.childs_pose));
                break;

            case R.drawable.shoulder_back_advance_bdy:
                getSupportActionBar().setTitle(R.string.shoulder_and_back_advance);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.hyperextension));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.pike_push_ups));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.reverse_push_ups));
                list.add(new sub_course_model(R.drawable.inchworms, R.string.inchworms));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_left, R.string.side_lying_floor_strerch_left));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_right, R.string.side_lying_floor_strerch_right));
                list.add(new sub_course_model(R.drawable.buttbridge, R.string.cat_cow_pose));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.supine_push_ups));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.reverse_snow_angels));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.childs_pose));
                break;

            case R.drawable.chest_bignner_bdy:
                getSupportActionBar().setTitle(R.string.chest_beginner);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.inclinepushup, R.string.incline_push_ups));
                list.add(new sub_course_model(R.drawable.knee_push_ups, R.string.knee_push_ups));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.wide_arm_push_ups, R.string.wide_arm_push_ups));
                list.add(new sub_course_model(R.drawable.boxpushups, R.string.box_push_ups));
                list.add(new sub_course_model(R.drawable.hindu_push_ups, R.string.hindu_push_ups));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.cheststretch, R.string.chest_stertch));
                break;

            case R.drawable.chest_intermediate_bdy:
                getSupportActionBar().setTitle(R.string.chest_intermediate);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.knee_push_ups, R.string.knee_push_ups));
                list.add(new sub_course_model(R.drawable.push_ups, R.string.push_ups));
                list.add(new sub_course_model(R.drawable.wide_arm_push_ups, R.string.wide_arm_push_ups));
                list.add(new sub_course_model(R.drawable.hindu_push_ups, R.string.hindu_push_ups));
                list.add(new sub_course_model(R.drawable.staggered_push_ups, R.string.staggered_push_ups));
                list.add(new sub_course_model(R.drawable.push_ups_and_rotation, R.string.push_ups_and_rotation));
                list.add(new sub_course_model(R.drawable.decline_push_ups, R.string.decline_push_ups));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.cheststretch, R.string.chest_stertch));
                break;

            case R.drawable.chest_advance_bdy:
                getSupportActionBar().setTitle(R.string.chest_advance);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.hindu_push_ups, R.string.hindu_push_ups));
                list.add(new sub_course_model(R.drawable.staggered_push_ups, R.string.staggered_push_ups));
                list.add(new sub_course_model(R.drawable.push_ups_and_rotation, R.string.push_ups_and_rotation));
                list.add(new sub_course_model(R.drawable.boxpushups, R.string.box_push_ups));
                list.add(new sub_course_model(R.drawable.spiderman_push_ups, R.string.spiderman_push_ups));
                list.add(new sub_course_model(R.drawable.decline_push_ups, R.string.decline_push_ups));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.cheststretch, R.string.chest_stertch));
                break;

            case R.drawable.abs_bignner:
                getSupportActionBar().setTitle(R.string.abs_beginner);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.abdominal_crunches));
                list.add(new sub_course_model(R.drawable.russian_twist, R.string.russian_twist));
                list.add(new sub_course_model(R.drawable.mountain_climbers, R.string.mountain_climbers));
                list.add(new sub_course_model(R.drawable.helltouches, R.string.heel_touch));
                list.add(new sub_course_model(R.drawable.leg_raises, R.string.leg_raises));
                list.add(new sub_course_model(R.drawable.plank, R.string.plank));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.spinelumbar, R.string.spine_lumber_twist_strech_left));
                list.add(new sub_course_model(R.drawable.spine_lumbar_right, R.string.spine_lumber_twist_strech_right));
                break;

            case R.drawable.abs_intermediate_bdy:
                getSupportActionBar().setTitle(R.string.abs_intermediate);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.helltouches, R.string.heel_touch));
                list.add(new sub_course_model(R.drawable.crossover_crunches, R.string.crossover_crunch));
                list.add(new sub_course_model(R.drawable.mountain_climbers, R.string.mountain_climbers));
                list.add(new sub_course_model(R.drawable.side_bridges_left, R.string.side_bridges_left));
                list.add(new sub_course_model(R.drawable.side_bridges_right, R.string.side_bridges_right));
                list.add(new sub_course_model(R.drawable.buttbridge, R.string.butt_bridge));
                list.add(new sub_course_model(R.drawable.bicycle_crunches, R.string.bicycle_crunches));
                list.add(new sub_course_model(R.drawable.v_up, R.string.v_up));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.abdominal_crunches));
                list.add(new sub_course_model(R.drawable.plank, R.string.plank));
                list.add(new sub_course_model(R.drawable.leg_raises, R.string.leg_raises));
                list.add(new sub_course_model(R.drawable.sideplank, R.string.side_plank_left));
                list.add(new sub_course_model(R.drawable.side_plank_right, R.string.side_plank_right));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.spinelumbar, R.string.spine_lumber_twist_strech_left));
                list.add(new sub_course_model(R.drawable.spine_lumbar_right, R.string.spine_lumber_twist_strech_right));
                break;

            case R.drawable.abs_advance_bdy:
                getSupportActionBar().setTitle(R.string.abs_advance);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.sit_ups, R.string.sit_ups));
                list.add(new sub_course_model(R.drawable.side_bridges_left, R.string.side_bridges_left));
                list.add(new sub_course_model(R.drawable.side_bridges_right, R.string.side_bridges_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.abdominal_crunches));
                list.add(new sub_course_model(R.drawable.bicycle_crunches, R.string.bicycle_crunches));
                list.add(new sub_course_model(R.drawable.sideplank, R.string.side_plank_left));
                list.add(new sub_course_model(R.drawable.side_plank_right, R.string.side_plank_right));
                list.add(new sub_course_model(R.drawable.v_up, R.string.v_up));
                list.add(new sub_course_model(R.drawable.push_ups_and_rotation, R.string.push_ups_and_rotation));
                list.add(new sub_course_model(R.drawable.russian_twist, R.string.russian_twist));
                list.add(new sub_course_model(R.drawable.buttbridge, R.string.butt_bridge));
                list.add(new sub_course_model(R.drawable.helltouches, R.string.heel_touch));
                list.add(new sub_course_model(R.drawable.crossover_crunches, R.string.crossover_crunch));
                list.add(new sub_course_model(R.drawable.mountain_climbers, R.string.mountain_climbers));
                list.add(new sub_course_model(R.drawable.plank, R.string.plank));
                list.add(new sub_course_model(R.drawable.cobra, R.string.cobra_stretch));
                list.add(new sub_course_model(R.drawable.spinelumbar, R.string.spine_lumber_twist_strech_left));
                list.add(new sub_course_model(R.drawable.spine_lumbar_right, R.string.spine_lumber_twist_strech_right));
                break;

            case R.drawable.lower_bdy:
                getSupportActionBar().setTitle(R.string.lower_body_workout);
                list.add(new sub_course_model(R.drawable.jumping_jack, R.string.jumping_jack));
                list.add(new sub_course_model(R.drawable.squats, R.string.squats));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_left, R.string.side_lying_leg_lift_left));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_right, R.string.side_lying_leg_lift_right));
                list.add(new sub_course_model(R.drawable.lungeback, R.string.backward_lunges));
                list.add(new sub_course_model(R.drawable.donkey_kicks_left, R.string.donkey_kicks_left));
                list.add(new sub_course_model(R.drawable.donkey_kicks_right, R.string.donkey_kicks_right));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.left_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.quadstretchright, R.string.right_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.kneetochest, R.string.knee_to_chest_stretch_left));
                list.add(new sub_course_model(R.drawable.kneetochestright, R.string.knee_to_chest_stretch_right));
                break;

            case R.drawable.leg_bigger_bdy:
                getSupportActionBar().setTitle(R.string.leg_beginner);
                list.add(new sub_course_model(R.drawable.side_hop, R.string.side_hop));
                list.add(new sub_course_model(R.drawable.squats, R.string.squats));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_left, R.string.side_lying_leg_lift_left));
                list.add(new sub_course_model(R.drawable.side_lying_leg_lift_right, R.string.side_lying_leg_lift_right));
                list.add(new sub_course_model(R.drawable.lungeback, R.string.backward_lunges));
                list.add(new sub_course_model(R.drawable.donkey_kicks_left, R.string.donkey_kicks_left));
                list.add(new sub_course_model(R.drawable.donkey_kicks_right, R.string.donkey_kicks_right));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.left_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.quadstretchright, R.string.right_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.kneetochest, R.string.knee_to_chest_stretch_left));
                list.add(new sub_course_model(R.drawable.kneetochestright, R.string.knee_to_chest_stretch_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.wall_calf_raises));
                list.add(new sub_course_model(R.drawable.sumo, R.string.sumo_squat_calf_raises_with_wall));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_right));
                break;

            case R.drawable.leg_intermediate_bdy:
                getSupportActionBar().setTitle(R.string.leg_intermediate);
                list.add(new sub_course_model(R.drawable.squats, R.string.squats));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.fire_hydrant_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.fire_hydrant_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.lunges));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.side_leg_circles_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.side_leg_circles_right));
                list.add(new sub_course_model(R.drawable.sumo, R.string.sumo_squat));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.reverse_flutter_kicks));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.wall_sit));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.left_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.quadstretchright, R.string.right_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.kneetochest, R.string.knee_to_chest_stretch_left));
                list.add(new sub_course_model(R.drawable.kneetochestright, R.string.knee_to_chest_stretch_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_raise_with_splayed_foot));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.single_leg_calf_hop_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.single_leg_calf_hop_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_right));
                break;

            case R.drawable.leg_advance_bdy:
                getSupportActionBar().setTitle(R.string.leg_advance);
                list.add(new sub_course_model(R.drawable.burpees, R.string.burpees));
                list.add(new sub_course_model(R.drawable.squats, R.string.squats));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.bottom_leg_lift_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.bottom_leg_lift_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.curtsy_lunges));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.side_leg_circles_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.side_leg_circles_right));
                list.add(new sub_course_model(R.drawable.jumping_squats, R.string.jumping_squats));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.glute_kick_back_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.glute_kick_back_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.wall_sit));
                list.add(new sub_course_model(R.drawable.quadstretch, R.string.left_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.quadstretchright, R.string.right_quad_stretch_with_wall));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.lying_butterfly_stretch));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.leaning_stretcher_raises));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.wall_resisting_single_leg_calf_raise_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.wall_resisting_single_leg_calf_raise_right));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_left));
                list.add(new sub_course_model(R.drawable.abdominal_crunches, R.string.calf_stretch_right));
                break;

        }


        sub_course_adapter adapter = new sub_course_adapter(list, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener(){


            @Override
            public void onItemClick(View view, int position) {
                sub_course_model model = list.get(position);
                detail_button = model.getText();
                Intent intent = new Intent(sub_courses.this , course_detail.class);
                intent.putExtra("detail_button", detail_button);
                startActivity(intent);

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }

        }));

    }


}