# |<<

**合同行租金 (rom_rentreceive_l / nc.vo.rom.rentreceive.RentReceiveListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentreceive_l | 合同行租金主键 | pk_rentreceive_l | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 出租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 出租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract_v | 合同编码 | pk_contract_v | varchar(20) |  | 周转材租出合同 (ContractHeadVO) |
| 7 | pk_contract_base | 租出合同原版主键 | pk_contract_base | varchar(20) |  | 周转材租出合同 (ContractHeadVO) |
| 8 | pk_contract_b_src | 合同行主键 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 9 | pk_contract_b_base_src | 来源合同行原版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 10 | rowno_src | 合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 11 | pk_marbaseclass | 物料分类编码 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 12 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 15 | pk_currency_origin | 原币 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 16 | rentmoney | 租金金额(原币) | rentmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | rentmoney_org | 租金金额(本币) | rentmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | rentmoney_group | 租金金额(集团) | rentmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | rentmoney_global | 租金金额(全局) | rentmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 21 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 22 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |