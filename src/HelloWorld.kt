fun main() {
 var DiasAno = 365
 var DiasMes = 30


 print("informe os anos;")
 var anos = readLine()
 print("informe os meses")
 var meses = readLine()
 print("informe os days;")
 var days = readLine()

var resul1= (anos*DiasAno)
var resul2=(meses*DiasMes)

 var result=days+ resul1+resul2
 println("sua idade em dias é,$result")

}

private operator fun String?.times(diasAno: Int): Int {

 return diasAno
}




























