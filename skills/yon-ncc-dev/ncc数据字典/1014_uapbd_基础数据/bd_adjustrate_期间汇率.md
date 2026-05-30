# |<<

**期间汇率 (bd_adjustrate / nc.vo.bd.currinfo.AdjustrateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustrate | 期间汇率主键 | pk_adjustrate | char(20) | √ | 主键 (UFID) |
| 2 | adjustrate | 期间汇率 | adjustrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 3 | pk_accperiodmonth | 会计月份主键 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | pk_accperiod | 会计期间主键 | pk_accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 5 | pk_accperiodscheme | 会计期间方案主键 | pk_accperiodscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 6 | ratemonth | 会计月份 | ratemonth | char(2) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |