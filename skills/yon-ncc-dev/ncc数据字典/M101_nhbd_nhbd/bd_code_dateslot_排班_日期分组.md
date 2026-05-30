# |<<

**排班_日期分组 (bd_code_dateslot / nc.vo.nhbd.code.dateslot.DateslotVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslot | 排班日期分组主键 | pk_dateslot | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_dateslottype | 日期分组类型主键 | pk_dateslottype | varchar(20) |  | 日期分组类型(自定义档案) (Defdoc-020005) |
| 6 | dt_dateslottype | 日期分组类型编码 | dt_dateslottype | varchar(50) |  | 字符串 (String) |
| 7 | sortno | 日期分组序号 | sortno | int |  | 整数 (Integer) |
| 8 | code_dateslot | 日期分组编码 | code_dateslot | varchar(50) |  | 字符串 (String) |
| 9 | name_dateslot | 日期分组名称 | name_dateslot | varchar(50) |  | 字符串 (String) |
| 10 | dateslotdes | 日期分组描述 | dateslotdes | varchar(50) |  | 字符串 (String) |
| 11 | time_begin | 标准开始时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 12 | time_end | 标准结束时间 | time_end | char(8) |  | 时间 (UFTime) |
| 13 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | flag_night | 夜班标识 | flag_night | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | flag_day | 白班标志 | flag_day | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 19 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 20 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 21 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 22 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |