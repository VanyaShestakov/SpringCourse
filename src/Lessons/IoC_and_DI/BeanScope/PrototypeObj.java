package Lessons.IoC_and_DI.BeanScope;

public class PrototypeObj {
    private String objName;

    public PrototypeObj(String objName) {
        this.objName = objName;
    }

    private void init() {
        System.out.println("Called init method for bean with name " + objName);
    }

    private void destroy() {
        System.out.println("Called destroy method for bean with name " + objName);
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getObjName() {
        return objName;
    }
}
