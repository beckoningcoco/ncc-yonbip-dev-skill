# |<<

**资产审批明细 (fa_newasset_b / nc.vo.fa.newasset.NewAssetBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_newasset_b | 主键 | pk_newasset_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 6 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 7 | asset_name | 资产名称 | asset_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 8 | pk_usedept | 使用部门 | pk_usedept | varchar(50) |  | 字符串 (String) |
| 9 | pk_mandept | 管理部门最新版本 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_mandept_v | 管理部门 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_assetuser | 使用人 | pk_assetuser | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 13 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 14 | position | 存放地点 | position | varchar(80) |  | 字符串 (String) |
| 15 | card_num | 数量 | card_num | int |  | 整数 (Integer) |
| 16 | currmoney | 购买价款 | currmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | tax_cost | 相关税费 | tax_cost | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | other_cost | 其他费用 | other_cost | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | tax_input | 进项税 | tax_input | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | sum_money | 金额 | sum_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 22 | pk_ownerorg | 货主管理组织 | pk_ownerorg | varchar(20) |  | 组织 (org) |
| 23 | pk_ownerorg_v | 货主管理组织版本 | pk_ownerorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 24 | pk_equiporg | 使用权 | pk_equiporg | varchar(20) |  | 组织 (org) |
| 25 | pk_equiporg_v | 使用权版本 | pk_equiporg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |