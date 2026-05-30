# |<<

**活期存款利息清单 (fac_demandintlist / nc.vo.fac.demandintlist.DemandIntListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intlist | 利息清单主键 | pk_intlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 清单类型 (IntbillTypeEnum) |  | JX=计息清单; |