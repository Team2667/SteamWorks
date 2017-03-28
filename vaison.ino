// Wire Slave Sender
// by Nicholas Zambetti <http://www.zambetti.com>

// Demonstrates use of the Wire library
// Sends data as an I2C/TWI slave device
// Refer to the "Wire Master Reader" example for use with this

// Created 29 March 2006

// This example code is in the public domain.


#include <Wire.h>
#include <Pixy.h>
#include <SPI.h>

Pixy pixy;

void setup() {
  Serial.begin(9600);
  Wire.begin(4);                // join i2c bus with address #8
  Wire.onRequest(requestEvent); // register event

  pixy.init();
}

void loop() {
 delay(100);
}

// function that executes whenever data is requested by master
// this function is registered as an event, see setup()
void requestEvent() {
  int numBytesToReturn = 16;
  unsigned char array[numBytesToReturn];
  uint16_t numBlocks;
  numBlocks = pixy.getBlocks();
  if (numBlocks == 0)
  {
    intToByteArray(-1, 1, array);
    intToByteArray(-1, 2, array);
    intToByteArray(-1, 3, array);
    intToByteArray(-1, 4, array);
  }

  else if (numBlocks == 1)
  {
    intToByteArray(pixy.blocks[0].x, 1, array);
    intToByteArray(pixy.blocks[0].y, 2, array);
    intToByteArray(-1, 3, array);
    intToByteArray(-1, 4, array);
  }

  else
  {
    intToByteArray(pixy.blocks[0].x, 1, array);
    intToByteArray(pixy.blocks[0].y, 2, array);
    intToByteArray(pixy.blocks[1].x, 3, array);
    intToByteArray(pixy.blocks[1].y, 4, array);
  }
    
  //intToByteArray(50180, 1, array);
  //intToByteArray(-299,2,array);
  //intToByteArray(42,3,array);
  //intToByteArray(56,4,array);
  Wire.write(array,numBytesToReturn); // respond with message of 6 bytes
  // as expected by master
}

void intToByteArray(long inValue, int posInArray, unsigned char array[]){
    int idx = (posInArray - 1) * 4;
  
    array[idx + 3] = inValue >> 0 & 0xFF;
    array[idx + 2] = inValue >> 8 & 0xFF;
    array[idx + 1] = inValue >> 16 & 0xFF;
    array[idx] = inValue >> 24 & 0xFF;
}

