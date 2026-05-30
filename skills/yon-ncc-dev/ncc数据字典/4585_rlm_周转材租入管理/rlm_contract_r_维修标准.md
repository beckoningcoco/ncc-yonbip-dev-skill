# |<<

**维修标准 (rlm_contract_r / nc.vo.rlm.contract.ContractRepairStdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4940.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_r | 维修标准主键 | pk_contract_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 9 | pk_repairstd | 维修标准 | pk_repairstd | varchar(20) |  | 维修标准 (maintainstd) |
| 10 | repair_price | 维修单价(原币) | repair_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 12 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |