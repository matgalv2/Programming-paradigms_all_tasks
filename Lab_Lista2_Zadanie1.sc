def isNotGrowing = (tuple:(Int,Int,Int)) =>
  if (tuple._1 <= tuple._2 && tuple._2 <= tuple._3
    && tuple._1 < tuple._3) false else true

isNotGrowing(3,2,4)
isNotGrowing(2,3,4)


isNotGrowing(3, 3, 4) == false
isNotGrowing(1,3,2) == true
isNotGrowing(4,5,1) == true
isNotGrowing(3,5,4) == true
isNotGrowing(5,3,4) == true
isNotGrowing(1,1,1) == true

