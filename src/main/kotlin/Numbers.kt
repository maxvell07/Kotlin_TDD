interface Numbers {

    fun sum():Int

    fun diff():Int
    fun divide(): Double

    class Base (
        private val first: Int,
        private val second:Int): Numbers{

        override fun sum(): Int{
            return first + second
        }

        override fun diff(): Int {
        if (first > second) return first- second
        else return second- first

    }

        override fun divide(): Double {
            if (second == 0) {
                throw IllegalArgumentException("cant divide by zero")
            } else
                return first.toDouble()/second
        }
    }
    class ThreeNumbers (
        private val number1: Int,
        private val number2:Int,
        private  val number3: Int
    ):Numbers{
        override fun sum(): Int {
            return number1+number2+number3
        }

        override fun diff(): Int {
            return number1-number2-number3 // default
        }

        override fun divide(): Double {
            TODO("Not yet implemented")
        }

    }
}