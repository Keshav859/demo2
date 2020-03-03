package EmployeeQuestion;

public class CEO extends Manager {
    private static CEO _instance;
    private CEO(String name) {
        super(name);
    }
    public static CEO getInstance(String name)
    {
        if(_instance == null){
            synchronized (CEO.class) {
                if(_instance == null)
                    _instance = new CEO(name);
            }
        }
        return _instance;
    }
}

// test