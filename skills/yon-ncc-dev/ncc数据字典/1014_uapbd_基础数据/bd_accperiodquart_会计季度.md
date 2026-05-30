# |<<

**会计季度 (bd_accperiodquart / nc.vo.bd.period3.AccperiodquartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/316.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiodquart | 会计季度主键 | pk_accperiodquart | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | quarter | 季度 | quarter | smallint | √ | 整数 (Integer) |
| 4 | beginmonth | 开始月份 | beginmonth | char(2) |  | 字符串 (String) |
| 5 | endmonth | 结束月份 | endmonth | char(2) |  | 字符串 (String) |
| 6 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | char(20) | √ | 会计期间方案 (accperiodscheme) |
| 7 | pk_accperiod | 所属会计期间 | pk_accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 8 | yearquarter | 年季度组合 | yearquarter | char(7) |  | 主键 (UFID) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |