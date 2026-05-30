# |<<

**审议人信息 (scapto_meetreport_approve / nc.vo.scapto.meetingreport.MeetReportApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetreport_approve | 审议人信息主键 | pk_meetreport_approve | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_decidesubjecttype | 决策主体 | pk_decidesubjecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 4 | pk_leadershiptype | 所属领导班子类型 | pk_leadershiptype | varchar(20) |  | 领导班子类型设置 (LeadershipTypeVO) |
| 5 | pk_enterpriseleader | 领导班子成员 | pk_enterpriseleader | varchar(20) |  | 领导班子成员信息 (EnterpriseLeaderVO) |
| 6 | vleadername | 审议人姓名 | vleadername | varchar(1024) |  | 字符串 (String) |
| 7 | vduty | 审议人职务 | vduty | varchar(50) |  | 字符串 (String) |
| 8 | vattendancestatus | 出席状态 | vattendancestatus | varchar(50) |  | 出席状态 (AttendanceStatusEnum) |  | 1=出席; |