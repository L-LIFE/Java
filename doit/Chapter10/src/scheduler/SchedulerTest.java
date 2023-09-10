package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		
		//R,L,P
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
		
		int ch=System.in.read();
		Scheduler sheduler=null;
		//타입은 하나지만 그때마다 다른게 쌓일 수 있음.(sheduler)
		
		if(ch=='R'||ch=='r') {
			sheduler=new RoundRobin();
		}else if(ch=='L'||ch=='l') {
			sheduler=new LeastJob();
		}else if(ch=='P'||ch=='p') {
			sheduler=new PriorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		sheduler.getNextCall();
		sheduler.sendCallToAgent();
	}

}
