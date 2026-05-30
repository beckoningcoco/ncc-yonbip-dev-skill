# |<<

**待结算调入单子实体 (to_presettlein_b / nc.vo.to.m5n.entity.PreSettleInItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 待结算调入单子表 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 调入财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | cinprofitcenterid | 调入利润中心最新版本 | cinprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | cinprofitcentervid | 调入利润中心 | cinprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 5 | csrcbid | 来源单据表体 | csrcbid | char(20) |  | 主键 (UFID) |
| 6 | vsrcrowno | 行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 7 | vfirsttype | 源头单据类型 | vfirsttype | varchar(50) |  | 字符串 (String) |
| 8 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 9 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 10 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 11 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 12 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 13 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 16 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 18 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cunitid | 主计量单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | castunitid | 业务计量单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | cqtunitid | 报价计量单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | nqtnum | 报价数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vqtunitrate | 报价计量单位换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 26 | csettleruleid | 结算规则主键 | csettleruleid | varchar(20) |  | 结算规则主表 (to_settlerule) |
| 27 | csettlerule_bid | 结算规则表体主键 | csettlerule_bid | varchar(20) |  | 结算规则子表 (to_settlerule_b) |
| 28 | ccalcid | 计算关系主键 | ccalcid | char(20) |  | 主键 (UFID) |
| 29 | bsettleendflag | 是否结算完成 | bsettleendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 31 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 32 | cproductorid | 生产厂家 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 33 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 34 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 35 | dfirstbilldate | 源头单据日期 | dfirstbilldate | char(19) |  | 日期 (UFDate) |
| 36 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 37 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 38 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 39 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |