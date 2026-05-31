# |<<

**日志 (fa_log / nc.vo.fa.log.LogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_business | 业务主键 | pk_business | varchar(20) |  | 字符串 (String) |
| 3 | bill_code | 业务单据号 | bill_code | varchar(30) |  | 字符串 (String) |
| 4 | accyear | 年度 | accyear | char(4) |  | 字符串 (String) |
| 5 | period | 期间 | period | char(2) |  | 字符串 (String) |
| 6 | busi_date | 业务日期 | busi_date | char(19) |  | 日期 (UFDate) |
| 7 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 8 | logid | 日志序列号 | logid | int |  | 整数 (Integer) |
| 9 | log_type | 日志类型 | log_type | int |  | 整数 (Integer) |
| 10 | pk_org | 组织主键 | pk_org | varchar(20) |  | 字符串 (String) |
| 11 | pk_group | 集团主键 | pk_group | varchar(20) |  | 字符串 (String) |
| 12 | redep_flag | 是否重提折旧 | redep_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bill_type | 单据类型 | bill_type | varchar(10) |  | 字符串 (String) |
| 14 | bill_status | 单据状态 | bill_status | int |  | 整数 (Integer) |
| 15 | voucher_flag | 制单标志 | voucher_flag | char(1) |  | 布尔类型 (UFBoolean) |