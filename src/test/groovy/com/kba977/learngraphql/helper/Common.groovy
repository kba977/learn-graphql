package com.kba977.learngraphql.helper

class Common {
  static Integer generateRandomNumber() {
    def random = new Random()
    random.nextInt(1000)
  }
}
