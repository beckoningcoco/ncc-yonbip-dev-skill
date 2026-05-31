# |<<

**日汇率 (bd_currrate / nc.vo.bd.currinfo.CurrrateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currrate | 日汇率主键 | pk_currrate | char(20) | √ | 主键 (UFID) |
| 2 | ratedate | 汇率日期 | ratedate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 3 | rate | 中间价 | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |