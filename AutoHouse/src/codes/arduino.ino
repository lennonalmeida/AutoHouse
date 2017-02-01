#define ledq 13
#define leds 12
int dado, led;
void setup() {
  Serial.begin(9600);
  pinMode(ledq, OUTPUT);
  pinMode(leds, OUTPUT);
  }

void loop() {
  if(Serial.available() > 0){
      dado = Serial.read()-48;
      Serial.println(dado);
      switch (dado){
          case 1:
              digitalWrite(ledq, HIGH);
              break;
          case 2:
              digitalWrite(ledq, LOW);
              break;
     }   
  }
}
