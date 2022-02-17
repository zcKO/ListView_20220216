package com.jc.listview_20220216.datas

// 나이는 잘 지정하지 않는다. 나이는 변하기 때문이다.
// 그렇기에 생년 월일을 적게 한다. -> 생년 월일은 변하지 않는다.
class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String
) {

    // 기능 추가
    fun getKoreanAge(year: Int): Int {
        val koreanAge = year - this.birthYear + 1
        return koreanAge
    }

}