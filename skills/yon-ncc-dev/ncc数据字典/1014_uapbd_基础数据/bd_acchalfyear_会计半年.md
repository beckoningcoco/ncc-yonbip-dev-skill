# |<<

**会计半年 (bd_acchalfyear / nc.vo.bd.period.AccHalfYearVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/306.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acchalfyear | 会计半年主键 | pk_acchalfyear | char(20) | √ | 主键 (UFID) |
| 2 | pk_accperiod | 会计期间 | pk_accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 3 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | char(20) | √ | 会计期间方案 (accperiodscheme) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | halfyear | 半年 | halfyear | int | √ | 整数 (Integer) |
| 6 | beginmonth | 开始月份 | beginmonth | char(2) | √ | 主键 (UFID) |
| 7 | endmonth | 结束月份 | endmonth | char(2) | √ | 主键 (UFID) |
| 8 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |