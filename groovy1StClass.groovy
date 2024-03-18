package gebFirst

import spock.lang.Specification
//this will bring all nedded things

class groovy1StClass extends Specification {

def "we are going to see max value using Math Class"(){
    expect:
    Math.max(2,3) == 3
}
}
