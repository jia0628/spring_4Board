package org.iclass.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommunityDTO {
	private int rnum;
	private int idx;
	private String writer;
	private String title;
	private String content;
	private int readCount;
	private Date createAt;
	private String ip;
	private String commentCount;

}
