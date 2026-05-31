# |<<

**暂估处理 (pm_estimate / nc.vo.pcm.tempestimate.EstimateHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estimate | 暂估主键 | pk_estimate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 6 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 9 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | contract_code | 合同编码 | contract_code | varchar(50) |  | 字符串 (String) |
| 11 | estimate_mny | 无税暂估额 | estimate_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | estimate_tax | 暂估税额 | estimate_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | estimate_taxmny | 含税暂估额 | estimate_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | calcostmny | 计成本金额 | calcostmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 16 | src_bill_code | 来源单据编码 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 17 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | src_transi_type | 来源交易类型编码 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 19 | src_pk_transitype | 来源交易类型 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 20 | pk_currtype_org | 组织币种 | pk_currtype_org | varchar(20) |  | 币种 (currtype) |
| 21 | bal_date | 结算日期 | bal_date | char(19) |  | 日期 (UFDate) |