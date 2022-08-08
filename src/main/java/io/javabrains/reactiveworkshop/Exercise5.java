package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

    // Subscribe to a flux using the error and completion hooks
    ReactiveSources.intNumberMono().subscribe(
        number -> System.out.println(number),
        error -> System.out.println(error.getMessage()),
        () -> System.out.println("Completed!"));

    // Subscribe to a flux using an implementation of BaseSubscriber
    // TODO

    System.out.println("Press a key to end");
    System.in.read();
  }

}
