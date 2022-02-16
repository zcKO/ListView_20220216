package com.jc.listview_20220216.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.jc.listview_20220216.R
import com.jc.listview_20220216.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
): ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // Row 는 보통 한 칸을 의미한다.
        var tempRow = convertView

        if (tempRow == null) {
            // inflate -> 어떤 레이아웃을 사용해서 코틀린 파일에서 사용 할 것인지
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtStudentName = row.findViewById<TextView>(R.id.txtStudentName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

        txtStudentName.text = data.name
        txtAddress.text = data.address

        val age = 2022 - data.birthYear + 1
        txtAge.text = "(${age}세)"

        return row

    }

}