# |<<

**转固单明细 (fa_transasset_b / nc.vo.fa.transasset.TransassetBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transasset_b | 转固单明细主键 | pk_transasset_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_sub_project | 工程项目 | pk_sub_project | varchar(20) |  | 项目 (project) |
| 6 | project_detail | 工程明细 | project_detail | varchar(200) |  | 字符串 (String) |
| 7 | contract_code | 合同号 | contract_code | varchar(80) |  | 字符串 (String) |
| 8 | bill_code_source | 单据号 | bill_code_source | varchar(80) |  | 字符串 (String) |
| 9 | invoice_code | 发票号 | invoice_code | varchar(80) |  | 字符串 (String) |
| 10 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | amount | 数量 | amount | int |  | 整数 (Integer) |  | [1 , ] |
| 13 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 14 | asset_name | 资产名称 | asset_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 15 | asset_spec | 规格 | asset_spec | varchar(400) |  | 字符串 (String) |
| 16 | asset_type | 型号 | asset_type | varchar(400) |  | 字符串 (String) |
| 17 | pk_mandept | 管理部门最新版本 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_mandept_v | 管理部门 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | pk_usedept | 使用部门最新版本 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_usedept_v | 使用部门 | pk_usedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 21 | pk_asset_user | 使用人 | pk_asset_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | reckon_value | 结算金额 | reckon_value | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 23 | adjust_value | 审计调整 | adjust_value | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 24 | other_value | 摊入金额 | other_value | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 25 | asset_value | 转固金额 | asset_value | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 26 | pk_originvalue_type | 币种 | pk_originvalue_type | varchar(20) |  | 币种 (currtype) |
| 27 | taxfree_price | 无税价格 | taxfree_price | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 28 | tax | 税金 | tax | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 29 | pricetaxsum_value | 价税合计 | pricetaxsum_value | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 30 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 31 | pk_card | 卡片编码 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 32 | created_num | 已生成卡片数量 | created_num | int |  | 整数 (Integer) | 0 |
| 33 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 34 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 35 | pk_transitype_src | 来源交易类型 | pk_transitype_src | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | transi_type_src | 来源交易类型编码 | transi_type_src | varchar(30) |  | 字符串 (String) |
| 37 | pk_bill_b_src | 来源表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 38 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 39 | measureunit | 计量单位 | measureunit | varchar(20) |  | 计量单位 (measdoc) |
| 40 | manufacturer | 制造商 | manufacturer | varchar(100) |  | 字符串 (String) |
| 41 | factory_code | 出厂编号 | factory_code | varchar(50) |  | 字符串 (String) |
| 42 | pk_ownerorg | 货主管理组织 | pk_ownerorg | varchar(20) |  | 组织 (org) |
| 43 | pk_ownerorg_v | 货主管理组织版本 | pk_ownerorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 44 | pk_equiporg | 使用权 | pk_equiporg | varchar(20) |  | 组织 (org) |
| 45 | pk_equiporg_v | 使用权版本 | pk_equiporg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 46 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |