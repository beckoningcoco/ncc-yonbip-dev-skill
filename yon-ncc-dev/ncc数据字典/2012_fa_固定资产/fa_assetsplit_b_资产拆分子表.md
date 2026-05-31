# |<<

**资产拆分子表 (fa_assetsplit_b / nc.vo.fa.assetsplit.AssetSplitBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetsplit_b | 资产拆分子表主键 | pk_assetsplit_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 9 | card_code | 卡片编号 | card_code | varchar(40) |  | 字符串 (String) |
| 10 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 11 | asset_name | 资产名称 | asset_name | varchar(400) |  | 字符串 (String) |
| 12 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 15 | pk_addreducestyle | 增加方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 16 | pk_addreducereason | 增加原因 | pk_addreducereason | varchar(20) |  | 原因 (reason) |
| 17 | pk_usingstatus | 使用状况 | pk_usingstatus | varchar(20) |  | 使用状况 (UsingStatusVO) |
| 18 | pk_mandept | 管理部门最新版本 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 19 | pk_mandept_v | 管理部门 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 20 | paydept_flag | 折旧承担部门 | paydept_flag | varchar(50) |  | 折旧承担部门 (paydept) |  | M=管理部门; |