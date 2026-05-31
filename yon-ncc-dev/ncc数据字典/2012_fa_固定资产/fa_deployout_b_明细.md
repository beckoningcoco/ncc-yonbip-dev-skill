# |<<

**明细 (fa_deployout_b / nc.vo.fa.deployout.DeployOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deployout_b | 明细主键 | pk_deployout_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 财务组织最新版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 6 | pk_accbook_scale | 精度账簿 | pk_accbook_scale | varchar(50) |  | 字符串 (String) |
| 7 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 8 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 9 | pk_addreducestyle | 减少方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 10 | pk_addreducereason | 调拨原因 | pk_addreducereason | varchar(20) |  | 原因 (reason) |
| 11 | deploy_price | 调拨价格 | deploy_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | deploy_accudep | 调拨累计折旧 | deploy_accudep | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | deploy_pdaluate | 调拨减值准备 | deploy_pdaluate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | netvalue | 净值 | netvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | netrating | 净额 | netrating | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | simulatedep | 模拟折旧 | simulatedep | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | accudep | 累计折旧 | accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | red_accudep | 减少累计折旧 | red_accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | usemonth | 已计提月份 | usemonth | int |  | 整数 (Integer) |
| 20 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 21 | pk_fundsource | 资金来源主键 | pk_fundsource | varchar(2000) |  | 字符串 (String) |
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
| 42 | fundsource | 资金来源 | fundsource | varchar(101) |  | 自定义项 (Custom) |