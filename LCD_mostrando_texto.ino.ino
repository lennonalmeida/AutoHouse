//Carrega a biblioteca LiquidCrystal
#include <LiquidCrystal.h>
 
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
 
void setup()
{
  lcd.begin(16, 2);
}
 
void loop()
{
  //clear screen
  lcd.clear();
  //place the cursor
  lcd.setCursor(1, 0);
  //send the message
  lcd.print("SeMOB|SeMOB|SeMOB|SeMOB");
  lcd.setCursor(1, 1);
  lcd.print("Respeite a sinalizacao");
  delay(1000);
   
  
  scroll_left();
   
 }
 void scroll_left(){
  for (int posicao = 0; posicao < 7; posicao++){
    lcd.scrollDisplayLeft();
    delay(500);
  }
  
 }
 



