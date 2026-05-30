# |<<

**结算清单子子实体 (to_settlelist_bb / nc.vo.to.m5f.entity.SettleListLineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bbid | 子子表主键 | cbill_bbid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 主表主键 | cbillid | char(20) |  | 主键 (UFID) |
| 3 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 4 | cupfinanceorgid | 上游财务组织最新版本 | cupfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | cupfinanceorgvid | 上游财务组织 | cupfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | cupcostregionid | 上游成本域 | cupcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | cdownfinanceorgid | 下游财务组织最新版本 | cdownfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | cdownfinanceorgvid | 下游财务组织 | cdownfinanceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | cdowncostregionid | 下游成本域 | cdowncostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 10 | ccurrencyid | 结算币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | ndiscountrate | 结算折扣率 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ntaxrate | 结算税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |