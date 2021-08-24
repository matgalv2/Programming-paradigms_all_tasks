def zamien [A](list:List[A], index:Int): List[A] =
  {
    def zamienRec[A](list:List[A], index:Int, ak:Int, listHelper:List[A]): List[A] =

      if(ak == index) list ::: listHelper
      else zamienRec(list.tail, index, ak + 1, listHelper :::List(list.head))


    zamienRec(list,index,0,List())
  }


zamien(List(1,2,3,4), 2)
zamien(List(),4)
zamien(List("Ala", "ma", "kota"),1)
