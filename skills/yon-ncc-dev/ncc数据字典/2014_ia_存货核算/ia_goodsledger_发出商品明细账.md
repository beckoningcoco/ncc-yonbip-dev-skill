# |<<

**发出商品明细账 (ia_goodsledger / nc.vo.ia.goodsledger.entity.GoodsLedgerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgoodsledgerid | 发出商品明细帐 | cgoodsledgerid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | fintransitflag | 发出商品标志 | fintransitflag | int |  | 发出商品标志 (intransit) |  | -1=非发出商品; |