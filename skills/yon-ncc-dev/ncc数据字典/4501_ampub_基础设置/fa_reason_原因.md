# |<<

**原因 (fa_reason / nc.vo.am.newreason.ReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reason | 主键 | pk_reason | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | reason_code | 原因编码 | reason_code | varchar(40) |  | 字符串 (String) |
| 5 | reason_name | 原因名称 | reason_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | reason_type | 原因类型 | reason_type | int |  | 整数 (Integer) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |