#附：阻塞队列的四种处理方法

| 方法\处理方式|抛出异常    |  返回特殊值 |一直阻塞|超时退出
| -----------| ----- | ----|----|-----|
| 插入方法    |add(e) |   offer(e) |put(e)|offer(e,time,unit)
| 移除方法    |remove() |  poll()|take()|poll(time,unit)
| 检查方法    |element()	| peek() |不可用|不可用


1. 抛出异常：是指当阻塞队列满时候，再往队列里插入元素，会抛出IllegalStateException(“Queue full”)异常。当队列为空时，从队列里获取元素时会抛出NoSuchElementException异常 
2. 返回特殊值：插入方法会返回是否成功，成功则返回true。移除方法，则是从队列里拿出一个元素，如果没有则返回null
3. 一直阻塞：当阻塞队列满时，如果生产者线程往队列里put元素，队列会一直阻塞生产者线程，直到拿到数据，或者响应中断退出。当队列空时，消费者线程试图从队列里take元素，队列也会阻塞消费者线程，直到队列可用。
4. 超时退出：当阻塞队列满时，队列会阻塞生产者线程一段时间，如果超过一定的时间，生产者线程就会退出。