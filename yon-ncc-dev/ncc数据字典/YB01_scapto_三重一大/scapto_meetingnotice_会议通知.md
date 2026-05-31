# |<<

**会议通知 (scapto_meetingnotice / nc.vo.scapto.premeetingmanage.meetingnotice.MeetingNoticeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5160.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetingnotice | 主键 | pk_meetingnotice | char(20) | √ | 主键 (UFID) |
| 2 | meetingname | 会议名称 | meetingname | varchar(500) |  | 字符串 (String) |
| 3 | meetingtime | 会议时间 | meetingtime | varchar(50) |  | 字符串 (String) |
| 4 | vvenue | 会议地点 | vvenue | varchar(500) |  | 字符串 (String) |
| 5 | vanchor | 主持人 | vanchor | varchar(500) |  | 字符串 (String) |
| 6 | approver | 出席人员 | approver | varchar(500) |  | 字符串 (String) |
| 7 | noticedate | 通知日期 | noticedate | varchar(50) |  | 字符串 (String) |
| 8 | noticetitle | 标题 | noticetitle | varchar(100) |  | 字符串 (String) |