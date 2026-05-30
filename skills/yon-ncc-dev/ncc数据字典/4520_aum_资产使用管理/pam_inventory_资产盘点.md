# |<<

**资产盘点 (pam_inventory / nc.vo.aum.inventory.InventoryHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory | 主键 | pk_inventory | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_code | 盘点单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 11 | bill_code_src | 来源单据号 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 12 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 13 | pk_transitype_src | 来源交易类型 | pk_transitype_src | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | transi_type_src | 来源交易类型编码 | transi_type_src | varchar(30) |  | 字符串 (String) |
| 15 | check_range | 盘点范围 | check_range | varchar(2000) |  | 字符串 (String) |
| 16 | check_standard | 盘点依据 | check_standard | int |  | 盘点依据 (EInvGist) |  | 1=设备编码; |