# |<<

**与会名册 (ipm_am_meetregister / nc.vo.ipmam.meeting.MeetRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetregister | 与会名册主键 | pk_meetregister | char(20) | √ | 主键 (UFID) |
| 2 | group_assign_flag | 是否本集团派任 | group_assign_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | vmancode | 人员编码 | vmancode | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | vmanname | 参会人员姓名 | vmanname | varchar(50) |  | 字符串 (String) |
| 5 | vholdertype | 股东类型 | vholdertype | varchar(50) |  | 股东类型 (HolderTypeEnum) |  | 1=法人; |