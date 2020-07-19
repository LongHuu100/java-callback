public interface myCallback {
    void onSuccess();
    void onError(String err);
}

// import the Interface class here

public class App {

    public static void main(String[] args) {
        // call your method
        doSomething("list your Params", new myCallback(){
            @Override
            public void onSuccess() {
                // no errors
                System.out.println("Done");
            }

            @Override
            public void onError(String err) {
                // error happen
                System.out.println(err);
            }
        });
    }

    private void doSomething(String param, // some params..
                             myCallback callback) {
        // now call onSuccess whenever you want if results are ready
        if(results_success)
            callback.onSuccess();
        else
            callback.onError(someError);
    }

}
