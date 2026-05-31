# |<<

**暂估记录 (pm_estimate_record / nc.vo.pcm.estimaterecord.EstRecordHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estrecord | 暂估记录主键 | pk_estrecord | char(20) | √ | 主键 (UFID) |
| 2 | pk_financialorg | 财务组织 | pk_financialorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financialorg_v | 财务组织多版本 | pk_financialorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 6 | pk_org_v | 项目组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 7 | pk_currtype_org | 组织币种 | pk_currtype_org | varchar(20) |  | 币种 (currtype) |
| 8 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 9 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 10 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | src_transi_type | 来源交易类型编码 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 13 | src_pk_transitype | 来源交易类型 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | src_bill_code | 来源单据号 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 15 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 16 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 18 | bill_code | 暂估单号 | bill_code | varchar(50) |  | 字符串 (String) |
| 19 | estimate_taxmny | 暂估金额 | estimate_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | estimator | 暂估人 | estimator | varchar(20) |  | 字符串 (String) |
| 21 | estimatetime | 暂估日期 | estimatetime | char(19) |  | 日期 (UFDate) |
| 22 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |