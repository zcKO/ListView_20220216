package com.jc.listview_20220216

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jc.listview_20220216.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("조경진", 1988, "서울시 동대문구"))
        mStudentList.add(StudentData("고재천", 1988, "서울시 중랑구"))
        mStudentList.add(StudentData("방우진", 1993, "경기도 고양시"))
        mStudentList.add(StudentData("서정민", 1984, "경기도 광명시"))
        mStudentList.add(StudentData("이승민", 1994, "경기도 안양시"))
        mStudentList.add(StudentData("이명종", 1991, "경기도 고양시"))
        mStudentList.add(StudentData("이윤주", 1989, "서울시 강서구"))
        mStudentList.add(StudentData("이진실", 1994, "서울시 송파구"))
        mStudentList.add(StudentData("정동준", 1992, "경기도 남양주시"))
        mStudentList.add(StudentData("최재훈", 1994, "경기도 수원시"))
        mStudentList.add(StudentData("이성노", 1988, "경기도 남양주시"))

    }
}