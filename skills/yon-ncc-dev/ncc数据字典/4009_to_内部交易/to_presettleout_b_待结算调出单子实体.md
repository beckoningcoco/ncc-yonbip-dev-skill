# |<<

**待结算调出单子实体 (to_presettleout_b / nc.vo.to.m5m.entity.PreSettleOutItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 子表主键 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 调出财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | coutprofitcenterid | 利润中心最新版本 | coutprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | coutprofitcentervid | 利润中心 | coutprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 5 | csrcbid | 来源单据表体主键 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 6 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 7 | vfirsttype | 源头单据类型 | vfirsttype | varchar(50) |  | 字符串 (String) |
| 8 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 10 | cfirstid | 源头单据主表主键 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 11 | cfirstbid | 源头单据表体主键 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 12 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 13 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 16 | blargessflag | 是否赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | dbizdate | 业务日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 18 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cunitid | 主计量单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nassistnum | 业务单位数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | castunitid | 业务计量单位 | castunitid | varchar(20) |  | 主键 (UFID) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | norigtaxprice | 主单位原币含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | norigprice | 主单位原币无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | norigmny | 原币无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | norigtaxmny | 原币价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | cqtunitid | 报价计量单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 29 | nqtnum | 报价计量单位数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | vqtunitrate | 报价计量单位换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 31 | nqtorigtaxprice | 报价计量单位原币含税价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nqtorigprice | 报价计量单位原币无税价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | csettleruleid | 结算规则主键 | csettleruleid | varchar(20) |  | 结算规则主表 (to_settlerule) |
| 34 | csettlerule_bid | 结算规则表体主键 | csettlerule_bid | varchar(20) |  | 结算规则子表 (to_settlerule_b) |
| 35 | ccalcid | 计算关系主键 | ccalcid | varchar(20) |  | 主键 (UFID) |
| 36 | bsettleendflag | 是否结算完成 | bsettleendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | cprojectid | 项目-固定属性 | cprojectid | varchar(20) |  | 项目 (project) |
| 38 | cvendorid | 供应商-固定属性 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 39 | cproductorid | 生产厂家-固定属性 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 40 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 41 | naccinnum | 累计调入主数量 | naccinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | naccwastnum | 累计途损主数量 | naccwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | naccoutbacknum | 累计出库退回主数量 | naccoutbacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | dfirstbilldate | 源头单据日期 | dfirstbilldate | varchar(19) |  | 日期 (UFDate) |
| 45 | dbilldate | 单据日期 | dbilldate | varchar(19) |  | 日期 (UFDate) |
| 46 | cinfinanceorgid | 调入财务组织最新版本 | cinfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 47 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | ntaxmny | 本币含税金额 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | ntax | 本币税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |