import java.util.ArrayList;

public class ResponseData {

        private Boolean result;
        private String requestId;
        private ArrayList<Object> errors;

        public ResponseData(Boolean result, String requestId, ArrayList<Object> errors) {
                this.result = result;
                this.requestId = requestId;
                this.errors = errors;
        }

        public Boolean getResult() {
                return result;
        }

        public String getRequestId() {
                return requestId;
        }

        public ArrayList<Object> getErrors() {
                return errors;
        }
}
