package com.rubenjromo.basketballcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView






class MainActivity : AppCompatActivity() {
    var scoreTeamA: Int = 0
    var scoreTeamB: Int = 0
    lateinit var mAdView : AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this, "ca-app-pub-4597919722020460~1783142114")

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


    }
    fun add_3_points_A(view: View){
        scoreTeamA +=3
        displayScoreTeamA(scoreTeamA)
    }
    fun add_2_points_A(view: View){
        scoreTeamA +=2
        displayScoreTeamA(scoreTeamA)
    }
    fun add_1_point_A(view: View){
        scoreTeamA +=1
        displayScoreTeamA(scoreTeamA)
    }

    fun add_3_points_B(view: View){
        scoreTeamB +=3
        displayScoreTeamB(scoreTeamB)
    }
    fun add_2_points_B(view: View){
        scoreTeamB +=2
        displayScoreTeamB(scoreTeamB)
    }
    fun add_1_point_B(view: View){
        scoreTeamB +=1
        displayScoreTeamB(scoreTeamB)
    }

    fun resetScore(view:View){
        scoreTeamA = 0
        scoreTeamB = 0
        displayScoreTeamA(scoreTeamA)
        displayScoreTeamB(scoreTeamB)
    }


    fun displayScoreTeamA(scoreA:Int) {
        var scoreTeamA = findViewById<TextView>(R.id.score_team_a) as TextView
        scoreTeamA.text = scoreA.toString()
    }
    fun displayScoreTeamB(scoreB:Int) {
        var scoreTeamA = findViewById<TextView>(R.id.score_team_b) as TextView
        scoreTeamA.text = scoreB.toString()
    }
}
