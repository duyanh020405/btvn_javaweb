public class bt1 {
 /*     [Client]
            |
            v
        [Web Server]
            |
            v
    [Application Server]
            |
            v
        [Database]

        Mô tả chức năng:

Client:
Gửi yêu cầu HTTP (ví dụ: xem trang, gửi form) và hiển thị kết quả trả về từ server.

Web Server:
Xử lý các file tĩnh (HTML, CSS, JS) hoặc chuyển tiếp yêu cầu động tới Application Server.

Application Server:
Chứa logic nghiệp vụ (xử lý dữ liệu, xác thực, tính toán) và giao tiếp với Database.

Database:
Lưu trữ dữ liệu và trả về kết quả khi được yêu cầu từ Application Server.

Giải thích sự tương tác:

Khi người dùng gửi yêu cầu từ trình duyệt (Client), Web Server sẽ tiếp nhận yêu cầu. Nếu yêu cầu chỉ
là tài nguyên tĩnh (như một file HTML), Web Server trả về trực tiếp. Nếu yêu cầu cần xử lý động (ví dụ lấy dữ liệu người dùng),
Web Server sẽ chuyển tiếp tới Application Server. Application Server thực hiện logic nghiệp vụ cần thiết, truy vấn hoặc cập nhật
Database nếu cần. Kết quả sau đó được trả lại qua Web Server để hiển thị cho Client.



*/

}
