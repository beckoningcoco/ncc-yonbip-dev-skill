# |<<

**列席人信息 (scapto_meetreport_join / nc.vo.scapto.meetingreport.MeetReportJoinVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetreport_join | 列席人信息主键 | pk_meetreport_join | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_leadertype_join | 所属领导班子类型 | pk_leadertype_join | varchar(20) |  | 领导班子类型设置 (LeadershipTypeVO) |
| 4 | pk_enterleader_join | 领导班子成员 | pk_enterleader_join | varchar(20) |  | 领导班子成员信息 (EnterpriseLeaderVO) |
| 5 | vjoinname | 列席人姓名 | vjoinname | varchar(1024) |  | 字符串 (String) |
| 6 | vduty | 列席人职务 | vduty | varchar(50) |  | 字符串 (String) |
| 7 | vattendancestatus | 出席状态 | vattendancestatus | varchar(50) |  | 出席状态 (AttendanceStatusEnum) |  | 1=出席; |