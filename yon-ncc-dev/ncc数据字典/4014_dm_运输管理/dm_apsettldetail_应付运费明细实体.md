# |<<

**应付运费明细实体 (dm_apsettldetail / nc.vo.dm.apsettle.Entity.ApSettleDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1708.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apsettldetail | 应付运费明细实体 | pk_apsettldetail | char(20) | √ | 主键 (UFID) |
| 2 | cbillhid | 单据主实体 | cbillhid | varchar(20) |  | 字符串 (String) |
| 3 | cbill_bid | 单据子实体 | cbill_bid | varchar(20) |  | 字符串 (String) |
| 4 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 7 | pk_org_v | 物流组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 8 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | cbilltypeid | 单据类型 | cbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本信息 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | csettlefinorgvid | 结算财务组织 | csettlefinorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | csettlefinorgid | 结算财务组织版本信息 | csettlefinorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 15 | ccosignid | 委托单位 | ccosignid | varchar(20) |  | 客户基本信息 (customer) |
| 16 | ctakefeeid | 运费承担单位 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | csendstoreorgvid | 发货库存组织 | csendstoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 18 | csendstoreorgid | 发货库存组织版本信息 | csendstoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 19 | csendstoreid | 发货仓库 | csendstoreid | varchar(20) |  | 仓库 (stordoc) |
| 20 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 22 | cfeeitemid | 费用项 | cfeeitemid | varchar(20) |  | 物料基本信息 (material_v) |
| 23 | nfeemny | 运费金额 | nfeemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | fallotflag | 分摊依据 | fallotflag | int |  | 分摊依据 (fallotsetflag) |  | 0=主数量; |