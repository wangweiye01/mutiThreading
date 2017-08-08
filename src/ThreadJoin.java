
public class ThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("等待计算结果");
		Calculate2 r = new Calculate2();
		Thread t = new Thread(r);
		t.start();
		t.join();
		System.out.println("计算结果：" + r.result);
	}
}

class Calculate2 implements Runnable {
	public int result = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(9999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = 2;
	}

}