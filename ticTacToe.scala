object ticTacToe extends App {
  var topLeft = "n"
  var topMiddle = "n"
  var topRight = "n"
  var middleLeft = "n"
  var middleMiddle = "n"
  var middleRight = "n"
  var bottomLeft = "n"
  var bottomMiddle = "n"
  var bottomRight = "n"

  def ticTacMatch(xOrO: String, myPositionString: String) = myPositionString match {
    case "topLeft" if(topLeft == "n") => topLeft = xOrO
    case "topMiddle" if (topMiddle == "n") => topMiddle = xOrO
    case "topRight" if (topRight == "n") => topRight = xOrO
    case "middleLeft" if (middleLeft == "n") => middleLeft = xOrO
    case "middleMiddle" if (middleMiddle == "n") => middleMiddle = xOrO
    case "middleRight" if (middleRight == "n") => middleRight = xOrO
    case "bottomLeft" if (bottomLeft == "n") => bottomLeft = xOrO
    case "bottomMiddle" if (bottomMiddle == "n") => bottomMiddle = xOrO
    case "bottomRight" if (bottomRight == "n") => bottomRight = xOrO
  }

  var noOneWonYet = true
  while ((topLeft == "n" || topMiddle == "n" || topRight == "n" || middleLeft == "n" || middleMiddle == "n" || middleRight =="n" 
    || bottomLeft == "n" | bottomMiddle == "n" || bottomRight == "n") && noOneWonYet) {
    var XorO = readLine("enter your side")
    var positionToBePlayed = readLine("enter your position")

    ticTacMatch(XorO, positionToBePlayed)
    if ((topLeft == "x" && topMiddle == "x" && topRight == "x") || (middleLeft == "x" && middleMiddle == "x" && middleRight == "x") || (bottomLeft == "x" 
      && bottomMiddle == "x" && bottomRight == "x") || (topLeft == "x" && middleLeft == "x" && bottomLeft == "x") || (topMiddle == "x" && middleMiddle == "x" 
        && bottomMiddle == "x") || (topLeft == "x" && middleMiddle == "x" && bottomRight == "x") || (topRight == "x" && middleMiddle == "x" && bottomLeft == "x")) {
      noOneWonYet = false
      println("x has won")
    }
    if ((topLeft == "o" && topMiddle == "o" && topRight == "o") || (middleLeft == "o" && middleMiddle == "o" && middleRight == "o") || (bottomLeft == "o" 
      && bottomMiddle == "o" && bottomRight == "o") || (topLeft == "o" && middleLeft == "o" && bottomLeft == "o") || (topMiddle == "o" && middleMiddle == "o" 
        && bottomMiddle == "o") || (topLeft == "o" && middleMiddle == "o" && bottomRight == "o") || (topRight == "o" && middleMiddle == "o" && bottomLeft == "o")) {
      noOneWonYet = false
      println("o has won")
    }
    
    println(topLeft + " | " + topMiddle + " | " + topRight)
    println("----------")
    println(middleLeft + " | " + middleMiddle + " | " + middleRight)
    println("----------")
    println(bottomLeft + " | " + bottomMiddle + " | " + bottomRight)
  }

}





















//var noOneWonYet = true
//  
//  while(topLeft == "n" ||  topMiddle == "n" || topRight == "n" && noOneWonYet){
//    var XorO = readLine("enter your side")
//    var positionToBePlayed = readLine("enter your position")
//    
//    if(positionToBePlayed == "n"){
//    
//  ticTacMatch(XorO,positionToBePlayed)
//  if(topLeft == "x" && topMiddle == "x" && topRight == "x"){
//    noOneWonYet = false
//    println("x has won")
//  }
//  if(topLeft == "o" && topMiddle == "o" && topRight == "o"){
//    noOneWonYet = false
//    println("o has won")
//  }
//    }
//    else{
//      println("invalid move try again")
//    }
//  }












