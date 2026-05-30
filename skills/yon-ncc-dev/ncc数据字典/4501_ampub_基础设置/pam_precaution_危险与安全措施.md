# |<<

**危险与安全措施 (pam_precaution / nc.vo.am.precaution.PrecautionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_precaution | 危险与安全措施主键 | pk_precaution | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | precaution_code | 编码 | precaution_code | varchar(40) |  | 字符串 (String) |
| 5 | precaution_name | 名称 | precaution_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | risk_type | 危险类型 | risk_type | varchar(30) |  | 字符串 (String) |
| 7 | precaution_content | 预防措施 | precaution_content | varchar(1024) |  | 字符串 (String) |
| 8 | isolate_flag | 需要隔离 | isolate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |