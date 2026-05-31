# |<<

**计划价调整单明细 (ia_ibbill_b / nc.vo.ia.mib.entity.IBItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 计划价调整单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料多版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | nplanedprice | 调整后计划单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | noriginplanedprice | 调整前计划单价 | noriginplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 8 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 9 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 11 | csrcid | 来源单据 | csrcid | varchar(20) |  | 字符串 (String) |
| 12 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 13 | csrcbid | 来源单据分录 | csrcbid | varchar(20) |  | 字符串 (String) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 16 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 17 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 18 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 19 | nupplanedprice | 上层调整后计划单价 | nupplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nuporiginplanedprice | 上层调整前计划单价 | nuporiginplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |