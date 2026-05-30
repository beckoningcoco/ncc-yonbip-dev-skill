# |<<

**资产卡片 (fa_card / nc.vo.fa.asset.AssetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_card | 主键 | pk_card | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心版本 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 9 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 11 | card_code | 卡片编号 | card_code | varchar(40) |  | 字符串 (String) |
| 12 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 13 | asset_name | 资产名称 | asset_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 14 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | business_date | 建卡日期 | business_date | char(19) |  | 日期 (UFDate) |
| 16 | dep_start_date | 折旧开始日期 | dep_start_date | char(19) |  | 日期 (UFDate) |
| 17 | dep_end_date | 折旧截止日期 | dep_end_date | char(19) |  | 日期 (UFDate) |
| 18 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 19 | pk_assetuser | 使用人 | pk_assetuser | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_user | 责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 22 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 23 | position | 存放地点 | position | varchar(200) |  | 多语文本 (MultiLangText) |
| 24 | workloanunit | 工作量单位 | workloanunit | varchar(80) |  | 字符串 (String) |
| 25 | pk_addreducestyle | 增加方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 26 | dy_flag | 递延资产标记 | dy_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | deploy_flag | 调拨标识 | deploy_flag | char(20) |  | 字符串 (String) |
| 28 | assetsuit_code | 资产套号 | assetsuit_code | varchar(320) |  | 字符串 (String) |
| 29 | provider | 供应商 | provider | varchar(20) |  | 供应商基本信息 (supplier) |
| 30 | workcenter | 工作中心 | workcenter | varchar(20) |  | 工作中心 (bd_wk) |
| 31 | bill_source | 卡片来源 | bill_source | varchar(50) |  | 卡片来源 (card_source) | handin | handin=手工录入; |