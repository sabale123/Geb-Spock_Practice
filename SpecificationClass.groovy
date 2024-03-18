import gebFirst.SumOfTwoNumber
import spock.lang.*

//specification class
class SpecificationClass extends Specification{
//    instance field
//    calling SumOfTwoNumber class
def obj = new SumOfTwoNumber()
//    save this object in diffent place
//   @Shared obj = new SumOfTwoNumber()
//    it will save object in same place
    def "Feature method 1"(){
        given:
        obj
    }
    def "Feature method 2"(){
        given:
        obj
    }
}