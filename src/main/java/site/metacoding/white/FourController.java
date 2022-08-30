package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {
	
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
		
	}
	
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new ResponseEntity<>(four,HttpStatus.CREATED); // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
		
	}
	
	@GetMapping("/four/dto")
	public RespDto<?> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1,"성공", four);			// generic
		
		
	}
}

// ioc컨테이너에 뜸
// ioc컨테이너에 뜬 controller를 가져와서 사용
// 리턴타입을 Four 오브젝트로 걸고 four 리턴
// json으로 받은 것을 java odbect로 변경하고 java object로 리턴해주면 json으로 convert해줌
// 데이터 리턴하고 싶을 때 오브젝트로 리턴하면 됨