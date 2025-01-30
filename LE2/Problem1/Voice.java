class Voice {
     Animal[] animals = new Animal[5];
    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        // hear(animals);
    }
    
    void hear() {
        for (Animal ani : animals) {
            ani.makeVoice();
        }
        
        
    // Call makeVoice() for all animals in the array
    
    
    // void hear(Animal [] animal) {
    //     for (Animal ani : animals) {
    //         ani.makeVoice();
        // }
    }
}
