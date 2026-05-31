# |<<

**非计划停机原因 (eom_halt_reason / nc.vo.eom.haltreason.HaltReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_halt_reason | 非计划停机原因标识 | pk_halt_reason | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | reason_code | 编码 | reason_code | varchar(40) |  | 字符串 (String) |
| 5 | reason_name | 名称 | reason_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | is_failure_halt | 是否故障停机 | is_failure_halt | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |