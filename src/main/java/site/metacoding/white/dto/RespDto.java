package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter	//getter 없으면 json으로 메시지 컨버팅이 안됨
@AllArgsConstructor
public class RespDto<T> {	// T 파라미터 추가
	private Integer code;	//-1 실패, 1 성공
	private String msg;	// 통신 결과를 메시지로 담기
	private T body;
}
