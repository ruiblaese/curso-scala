package lectures.part1basics

object DefaultArgs extends App{

  def trFact(n: Int, acc:Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  var fat10 = trFact(10)
  println(fat10)

  def savePicture(format: String = "jpg", width:Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)
  savePicture(width = 800,height = 800,format="bmp")




}
