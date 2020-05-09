package project.model;

public class ApiResult {

    public ApiResult() {}

    public ApiResult(Object data)
    {
        this.setData(data);
    }

    private int result = 0;

    private String message="";

    private Object data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
