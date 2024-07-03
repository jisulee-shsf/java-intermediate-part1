package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (Exception e) {
            exceptionHandler(e);
        } finally {
            client.disconnect();
        }
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("죄송합니다. 알 수 없는 오류가 발생했습니다.");
        System.out.println("=====개발자용 디버깅 메시지=====");
        e.printStackTrace(System.out);
//        e.printStackTrace(System.err);

        // 별도 예외 처리
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
