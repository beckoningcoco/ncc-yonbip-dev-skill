# |<<

**内部交易信息子表 (to_businessinfo_b / nc.vo.to.businessinfo.entity.BusinessinfoBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbusiness_bid | 内部交易信息子表 | cbusiness_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料最新版本 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 7 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 字符串 (String) |
| 11 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 12 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nqtnum | 报价数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 15 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 16 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 19 | csettleruleid | 结算规则主表 | csettleruleid | varchar(20) |  | 结算规则主表 (to_settlerule) |
| 20 | csettlerule_bid | 结算规则子表 | csettlerule_bid | varchar(20) |  | 结算规则子表 (to_settlerule_b) |
| 21 | csrcbid | 来源单据子表 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 22 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | naskbasetaxprice | 询价含税价 | naskbasetaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | naskbaseprice | 询价无税价 | naskbaseprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | bbasepriceeditflag | 询价后价格是否可改 | bbasepriceeditflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | nbasetaxprice | 含税单价 | nbasetaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nbaseprice | 无税单价 | nbaseprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nbasemny | 无税金额 | nbasemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nbasetaxmny | 价税合计 | nbasetaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nbasetaxrate | 税率 | nbasetaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | fbasetaxtypeflag | 扣税类别 | fbasetaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |