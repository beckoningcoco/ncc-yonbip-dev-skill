# |<<

**资产减值单子表 (fa_predevaluate_b / nc.vo.fa.predevaluate.PredevaluateBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predevaluate_b | 减值单子表主键 | pk_predevaluate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_card | 资产卡片 | pk_card | char(20) | √ | 资产卡片 (asset) |
| 6 | localoriginvalue | 本币原值 | localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | returnmoney | 可回收金额 | returnmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | currentresume | 本次计提 | currentresume | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | currentresume_group | 本次计提(集团) | currentresume_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | currentresume_global | 本次计提(全局) | currentresume_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | devaluatereason | 减值原因 | devaluatereason | varchar(20) |  | 原因 (reason) |
| 13 | predevaluate_old | 已计提减值准备 | predevaluate_old | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | predevaluate | 减值准备 | predevaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | salvage | 净残值 | salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |