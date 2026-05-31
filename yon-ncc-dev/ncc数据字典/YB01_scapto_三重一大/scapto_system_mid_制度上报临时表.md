# |<<

**制度上报临时表 (scapto_system_mid / nc.vo.scapto.systemmanage.systemreportmid.SystemReportMidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | regulation_id | 制度标识 | regulation_id | char(20) | √ | 主键 (UFID) |
| 2 | company_name | 企业名称 | company_name | varchar(50) |  | 字符串 (String) |
| 3 | company_id | 企业编码 | company_id | varchar(50) |  | 字符串 (String) |
| 4 | regulation_name | 制度名称 | regulation_name | varchar(1024) |  | 字符串 (String) |
| 5 | regulation_type_name | 制度类型 | regulation_type_name | varchar(50) |  | 字符串 (String) |
| 6 | approval_date | 审批日期 | approval_date | char(19) |  | 日期时间 (UFDateTime) |
| 7 | effective_date | 生效日期 | effective_date | char(19) |  | 日期 (UFDate) |
| 8 | invalid_date | 失效日期 | invalid_date | char(19) |  | 日期 (UFDate) |
| 9 | audit_flag | 是否经过法律审核 | audit_flag | varchar(50) |  | 字符串 (String) |
| 10 | meeting_type_code | 会议类型编码 | meeting_type_code | varchar(50) |  | 字符串 (String) |
| 11 | nc_ts | 最后修改时间 | nc_ts | char(19) |  | 日期时间 (UFDateTime) |
| 12 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 13 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 14 | org_type | 企业类型 | org_type | varchar(50) |  | 企业类型 (EnterpriseTypeEnum) |  | 01=集团企业; |