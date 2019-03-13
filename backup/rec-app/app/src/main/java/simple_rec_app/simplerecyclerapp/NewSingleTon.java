package simple_rec_app.simplerecyclerapp;

class NewSingleTon {
    private static final NewSingleTon ourInstance = new NewSingleTon();

    static NewSingleTon getInstance() {
        return ourInstance;
    }

    private NewSingleTon() {
    }
}
