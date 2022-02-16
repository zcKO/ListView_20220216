package com.jc.listview_20220216

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.jc.listview_20220216.adapters.StudentAdapter
import com.jc.listview_20220216.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    테스트용 주석입니다.
//    어댑터를 나중에 대입할 변수
    lateinit var mAdapter: StudentAdapter

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

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 학생이 클릭 되었습니다.", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { parent, view, position, id ->

            val longClickedStudent = mStudentList[position]

            val alert = AlertDialog.Builder(this)
                .setTitle("학생 삭제")
                .setMessage("정말 ${longClickedStudent.name} 학생을 삭제하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->
                    mStudentList.remove(longClickedStudent)
                    mAdapter.notifyDataSetChanged()
                })
                .setNegativeButton("취소", null)
                .setNeutralButton("잘 모르겠음", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "중립 버튼이 눌렸다.", Toast.LENGTH_SHORT).show()
                })
                .show()

            return@setOnItemLongClickListener true

        }

        

    }
}