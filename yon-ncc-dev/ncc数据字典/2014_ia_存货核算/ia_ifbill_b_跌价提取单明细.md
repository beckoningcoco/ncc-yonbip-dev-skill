# |<<

**跌价提取单明细 (ia_ifbill_b / nc.vo.ia.mif.entity.IFItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 跌价提取单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行标识 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料最新版本 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 6 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nmny | 本次应提取金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nnabprice | 结存成本单价 | nnabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ndrawrate | 提取比例 | ndrawrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ndrawsummny | 累计提取金额 | ndrawsummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nnewlyprice | 最新市价 | nnewlyprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 16 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 18 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 19 | caccountperiod | 会计期间 | caccountperiod | varchar(7) |  | 字符串 (String) |
| 20 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 21 | fintransitflag | 发出商品标志 | fintransitflag | int |  | 整数 (Integer) |
| 22 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |