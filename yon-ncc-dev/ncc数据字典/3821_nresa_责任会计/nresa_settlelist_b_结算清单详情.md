# |<<

**结算清单详情 (nresa_settlelist_b / nc.vo.nresa.internalsettlement.matter.SettleListItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3889.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 结算清单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 结算利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cinventoryvid | 物料编码 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 14 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | nqtnum | 报价数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 17 | norigprice | 主原币单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nprice | 主本币单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nqtorigprice | 报价原币单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nqtprice | 报价本币单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | norigmny | 原币金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nmny | 本币金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngroupmny | 集团本币金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nglobalmny | 全局本币金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | csettleruleid | 结算规则 | csettleruleid | varchar(20) |  | 字符串 (String) |
| 27 | csettlerule_bid | 结算规则明细 | csettlerule_bid | varchar(20) |  | 字符串 (String) |
| 28 | fsettletypeflag | 内部结算类型 | fsettletypeflag | int |  | 内部实物结算类型 (InsettmatterTypeEnum) |  | 1=跨利润中心调拨; |