# |<<

**活期存款利息清单明细 (ifac_demandintlist_b / nc.vo.ifac.demandintlist.DemandIntListBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intlist_b | 利息清单明细主键 | pk_intlist_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 4 | summary | 摘要 | summary | int |  | 利率属性 (irateattr) |  | 0=普通; |