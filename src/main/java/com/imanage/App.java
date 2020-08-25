package com.imanage;

import io.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    mvc(new Controller());
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }

}
