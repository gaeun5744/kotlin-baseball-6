package view

import camp.nextstep.edu.missionutils.Console
import model.Validation

class InputView {

    fun readNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val input = Console.readLine()
        Validation.checkBaseballNum(input)
        return input.toList().map { it.toString().toInt() }
    }

    fun readIsRetry(): Boolean {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val input = Console.readLine()
        Validation.checkRetry(input)
        return isRetryIntToBoolean(input)
    }

    private fun isRetryIntToBoolean(input: String): Boolean = input == "1"


}