# |<<

**合同租金明细 (rlm_rentpay_d / nc.vo.rlm.rentpay.RentPayDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentpay_d | 合同租金明细行主键 | pk_rentpay_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract_v | 合同编码 | pk_contract_v | varchar(20) |  | 周转材租入合同 (ContractHeadVO) |
| 7 | pk_contract_base | 租入合同原版主键 | pk_contract_base | varchar(20) |  | 周转材租入合同 (ContractHeadVO) |
| 8 | pk_contract_b_src | 合同行主键 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 9 | pk_contract_b_base_src | 来源合同行原版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 10 | pk_currency_origin | 原币 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 11 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | rowno_src | 合同行号 | rowno_src | varchar(20) |  | 字符串 (String) |
| 13 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 14 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 16 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 17 | rent_num | 结算报价数量 | rent_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | rent_num_pre | 上次结算报价数量 | rent_num_pre | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | rent_num_out | 租入报价数量 | rent_num_out | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | rent_num_com | 赔偿报价数量 | rent_num_com | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | rent_num_rt | 归还报价数量 | rent_num_rt | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | rent_num_discard | 报废报价数量 | rent_num_discard | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | rent_num_lost | 遗失报价数量 | rent_num_lost | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | rent_num_st | 停租报价数量 | rent_num_st | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | start_date | 开始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 26 | end_date | 终止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 27 | day_num | 租入天数 | day_num | int |  | 整数 (Integer) |
| 28 | rent_price | 租入单价(原币) | rent_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | rentmoney | 租金金额(原币) | rentmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | rentmoney_org | 租金金额(本币) | rentmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | rentmoney_group | 租金金额(集团) | rentmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | rentmoney_global | 租金金额(全局) | rentmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 34 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 35 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |