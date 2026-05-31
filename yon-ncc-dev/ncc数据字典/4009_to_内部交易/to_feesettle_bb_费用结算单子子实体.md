# |<<

**费用结算单子子实体 (to_feesettle_bb / nc.vo.to.m4552.entity.FeeSettleBillLineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bbid | 费用结算单子子实体 | cbill_bbid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 费用结算单主实体 | cbillid | char(20) |  | 主键 (UFID) |
| 3 | cinventoryid | 费用物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 费用物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | callotbillid | 分摊的单据 | callotbillid | char(20) |  | 主键 (UFID) |
| 6 | callotbillbid | 分摊的单据明细 | callotbillbid | char(20) |  | 主键 (UFID) |
| 7 | nallotmny | 费用分摊金额 | nallotmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nallotnum | 费用分摊数量 | nallotnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | itimes | 累计费用结算次数 | itimes | int |  | 整数 (Integer) |
| 10 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 12 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 13 | norigmny | 结算无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nnosubtax | 不可抵扣金额 | nnosubtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ncostfactor | 费用分摊成本要素 | ncostfactor | int |  | 整数 (Integer) |