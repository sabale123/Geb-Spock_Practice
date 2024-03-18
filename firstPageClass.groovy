import Pages.ContactUsPages
import geb.Browser

Browser.drive{
//    to - set the page means push the broweser
    to ContactUsPages
    println currentUrl
}