import scala.io.Source


object DemoReadCsv {
 val filename = "month1.csv"
  for(line <- Source.fromFile(filename).getLines){
    println(line)
  }

}
