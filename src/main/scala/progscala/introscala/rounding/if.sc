// src/main/scala/progscala2/rounding/if.sc

object if_if {
  if (2 + 2 == 5) {
    println("Hello from 1984.")
  } else if (2 + 2 == 3) {
    println("Hello from Remedial Math class?")
  } else {
    println("Hello from a non-Orwellian future.")
  }                                               //> Hello from a non-Orwellian future.
}

object if_ifz {
  if (2 + 2 == 5) {
    println("Hello from 1984.")
  } else if (2 + 2 == 3) {
    println("Hello from Remedial Math class?")
  } else {
    println("Hello from a non-Orwellian future.")
  }
}