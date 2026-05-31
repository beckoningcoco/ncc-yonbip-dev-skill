# |<<

**活期存款利息回单明细 (ifac_demandintrcpt_b / nc.vo.ifac.demandintrcpt.DemandIntRcptBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3074.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rateversion | 利率版本PK | pk_rateversion | varchar(20) |  | 利率变更 (fi_ratechange_d) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | memo | 摘要 | memo | int |  | 利率属性 (irateattr) |  | 0=普通; |