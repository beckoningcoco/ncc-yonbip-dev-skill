# |<<

**单据明细实体 (ia_detailledger / nc.vo.ia.detailledger.entity.DetailLedgerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdetailledgerid | 单据明细表主键 | cdetailledgerid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 单据主表主键 | cbillid | varchar(20) |  | 主键 (UFID) |
| 3 | cbill_bid | 单据子表主键 | cbill_bid | varchar(20) |  | 主键 (UFID) |
| 4 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 9 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 10 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 11 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 成本计价方式 (marcostmode) |  | 1=先进先出; |