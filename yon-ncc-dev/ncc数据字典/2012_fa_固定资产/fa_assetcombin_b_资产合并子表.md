# |<<

**资产合并子表 (fa_assetcombin_b / nc.vo.fa.assetcombin.AssetCombinBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1989.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetcombin_b | 资产合并子表主键 | pk_assetcombin_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_card | 资产卡片 | pk_card | char(20) | √ | 资产卡片 (asset) |
| 6 | card_code | 卡片编号 | card_code | varchar(50) |  | 字符串 (String) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | transi_type | 交易类型 | transi_type | varchar(30) |  | 字符串 (String) |
| 9 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | curryeardep | 本年折旧 | curryeardep | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | simulatedep | 模拟折旧 | simulatedep | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | usedmonth | 已计提月份 | usedmonth | int |  | 整数 (Integer) |
| 13 | usedept | 使用部门 | usedept | varchar(80) |  | 字符串 (String) |
| 14 | pk_equip | 设备主键 | pk_equip | varchar(20) |  | 字符串 (String) |
| 15 | pk_addreducestyle | 减少方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 16 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 17 | b_fundsourcepk | 资金来源主键 | b_fundsourcepk | varchar(2000) |  | 字符串 (String) |
| 18 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 38 | b_fundsourcetxt | 资金来源 | b_fundsourcetxt | varchar(101) |  | 自定义项 (Custom) |