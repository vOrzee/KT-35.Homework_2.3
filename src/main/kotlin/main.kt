fun main() {
    val musicLover = true
    var amount = 10001_00
    val discountMusicLover = 0.99
    val discountVolumeSmall = if (amount<=1000_00) {
        0
    } else {
        100_00
    }
    val discountVolumeBig = 0.95
    print("Покупка - ${amount/100} руб.")
    if (musicLover||amount>=1001_00){
        println(" ->")
        if (amount>=1001_00&&amount<=10000_00) {
            print("После применения скидки в ${discountVolumeSmall/100} руб. - ")
            if (amount%100==0){
                println("${(amount-discountVolumeSmall)/100} рублей")
            } else {
                println("${((amount-discountVolumeSmall)-amount%100)/100} рублей ${amount%100} копеек")
            }
            amount -= discountVolumeSmall
        }
        if (amount>=10001_00) {
            print("После применения ${(100-discountVolumeBig*100).toInt()}% скидки - ")
            if ((amount*discountVolumeBig).toInt()%100==0){
                println("${((amount*discountVolumeBig)/100).toInt()} руб.")
            } else {
                println("${(((amount*discountVolumeBig)-(amount*discountVolumeBig)%100)/100).toInt()} руб. ${((amount*discountVolumeBig)%100).toInt()} коп.")
            }
            amount = (amount*discountVolumeBig).toInt()
        }
        if (musicLover) {
            print("После применения ${(100-discountMusicLover*100).toInt()}% скидки - ")
            if ((amount*discountMusicLover).toInt()%100==0){
                println("${((amount*discountMusicLover)/100).toInt()} руб.")
            } else {
                println("${(((amount*discountMusicLover)-(amount*discountMusicLover)%100)/100).toInt()} руб. ${((amount*discountMusicLover)%100).toInt()} коп.")
            }
            amount = (amount*discountMusicLover).toInt()
        }
    } else {
        print(""" ->
            |К сожалению скидок не предусмотренно :(
        """.trimMargin())
    }
}