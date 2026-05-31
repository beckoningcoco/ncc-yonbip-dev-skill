# |<<

**现金折扣方案子表 (bd_rateschemach / nc.vo.bd.rate.RateChVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratech | 折扣子表主键 | pk_ratech | char(20) | √ | 主键 (UFID) |
| 2 | showorder | 折扣期 | showorder | smallint | √ | 整数 (Integer) |
| 3 | rdata | 折扣天数 | rdata | smallint | √ | 整数 (Integer) |
| 4 | cashrate | 现金折扣 | cashrate | varchar(100) |  | 字符串 (String) |
| 5 | rate | 折扣比率 | rate | decimal(16, 4) | √ | 数值 (UFDouble) |
| 6 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |