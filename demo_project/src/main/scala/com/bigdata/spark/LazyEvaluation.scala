package com.bigdata.spark

object LazyEvaluation {
//tính toán lazy nghĩa là hiệu quả.
  // Lazy giúp chúng ta tách rời những miêu tả của biểu thức khỏi tính toán của biểu thức đó
  lazy val lazyNum = 3
//
//  lazy val chỉ thực hiện  tính toán một lần và không bao giờ thực hiện lại nữa.
//  Điều này vô cùng hữu ích khi một hoạt động nào đấy mất nhiều thời gian để thực hiện và khi nó là không chắc chắn nếu được sử dụng sau này.
//
//  Scala hỗ trợ 2 kiểu collection:
//    + Strict Collection ví dụ List, Map, Set…
//  Strict collection nghĩa là chúng được tính toán eagerly (ngay lập tức) như là List, Set, Vector, Map
//    + Non-Strict Collections ví dụ Streams
//  Nhưng Non-Strict như là Stream, mặc định được tính toán lazy. Chúng được tính toán dựa trên yêu cầu,
//  tức là khi nào gọi hàm, khi nó mới bắt đầu tính toán,tính toán 1 lần đó thôi,
//  Còn strict collection nó sẽ tính toán real time. Khởi tạo vừa xong là nó đã tính toán ra luôn rồi

//  Sự khác nhau giữa Stream và View là lazy View sử dụng trong tính toán phương thức trong khi Stream là lazy ở sau cùng.
//    Một Stream không có giá trị, nó chỉ sinh ra giá trị khi chúng ta yêu cầu nó. Nhưng nó có thể có giá trị trong trường hợp View.
//    Bên cạnh đó Stream sẽ cache lại kết quả còn View thì không. Trong View, các phần tử được tính toán lại mỗi lần chúng được truy cập.
//    Trong Stream, các phần tử được giữ lại khi được tính toán.


}
