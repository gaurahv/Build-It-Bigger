package com.example;

public class JokesClass {
    String[] jokes = {
            "Q: What did the spider do on the computer?\nA: Made a website",
            "Q: What did the computer do at lunchtime?\nA: Had a byte",
            "Q: What does a baby computer call his father?\nA: Data",
            "Q: Why did the computer keep sneezing?\nA: It had a virus",
            "Q: What is a computer virus?\nA: A terminal illness",
            "Q: Why was the computer cold?\nA: It left it's Windows open",
            "Q: Why was there a bug in the computer?\nA: Because it was looking for a byte to eat?",
            "Q: Why did the computer speak?\nA: Because someone stepped on it's mouse",
            "Q: What do you get when you cross a computer and a life guard?\nA: A screensaver",
            "Q: Where do all the cool mice live?\nA: In their mousepads",
            "Q: What do you get when you cross a computer with an elephant?\nA: Lots of memory"
    };
    public String getJoke() {
        return jokes[(int) (Math.random() * jokes.length)];
    }
}
