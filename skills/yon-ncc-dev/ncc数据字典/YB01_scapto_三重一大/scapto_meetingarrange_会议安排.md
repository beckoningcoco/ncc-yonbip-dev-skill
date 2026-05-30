# |<<

**会议安排 (scapto_meetingarrange / nc.vo.scapto.premeetingmanage.meetingarrange.MeetingArrangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetingarrange | 主键 | pk_meetingarrange | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 决策企业 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | vmeetingcode | 会议编码 | vmeetingcode | varchar(50) |  | 字符串 (String) |
| 4 | vbillname | 会议名称 | vbillname | varchar(1024) |  | 字符串 (String) |
| 5 | tmeetingtime | 会议时间 | tmeetingtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | vvenue | 会议地点 | vvenue | varchar(100) |  | 字符串 (String) |
| 7 | vanchor | 主持人 | vanchor | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | pk_meetingform | 会议形式 | pk_meetingform | varchar(20) |  | 决策会议形式设置 (DecideMeetingFormVO) |
| 9 | pk_meetingtype | 会议类型 | pk_meetingtype | varchar(20) |  | 决策会议类型设置 (DecideMeetTypeVO) |
| 10 | pk_decidesujecttype | 决策主体 | pk_decidesujecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 11 | dnoticedata | 会议通知日期 | dnoticedata | char(19) |  | 日期 (UFDate) |
| 12 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 13 | vmeetingtype | 会议状态 | vmeetingtype | varchar(50) |  | 会议状态 (MeetingTypeEnum) |  | 1=未排会; |