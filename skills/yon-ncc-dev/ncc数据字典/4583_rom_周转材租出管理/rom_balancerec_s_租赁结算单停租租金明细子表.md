# |<<

**租赁结算单停租租金明细子表 (rom_balancerec_s / nc.vo.rom.balancerec.BalanceRecStopRentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerec_s | 停租租金明细子表主键 | pk_balancerec_s | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract_v | 合同编码 | pk_contract_v | varchar(20) |  | 周转材租出合同 (ContractHeadVO) |
| 7 | pk_contract_base | 租出合同原版主键 | pk_contract_base | varchar(20) |  | 周转材租出合同 (ContractHeadVO) |
| 8 | pk_currency_origin | 原币 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 9 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 10 | pk_contract_b_src | 合同行主键 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 11 | pk_stoprent | 停租单主键 | pk_stoprent | varchar(20) |  | 周转材租出停租单 (stopRentHeadVO) |
| 12 | bill_code_stoprent | 停租单号 | bill_code_stoprent | varchar(40) |  | 字符串 (String) |
| 13 | pk_stoprent_b_src | 停租单行主键 | pk_stoprent_b_src | varchar(20) |  | 周转材租出停租单子表 (stopRentBodyVO) |
| 14 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 15 | rent_num | 停租报价数量 | rent_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 16 | start_date | 起始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | end_date | 终止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | rent_price | 停租单价(原币) | rent_price | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 19 | rent_price_org | 停租单价(本币) | rent_price_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 20 | day_num | 停租天数 | day_num | int |  | 整数 (Integer) |
| 21 | stopmoney | 停租租金(原币) | stopmoney | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 22 | stopmoney_org | 停租租金(本币) | stopmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 23 | stopmoney_group | 停租租金(集团) | stopmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 24 | stopmoney_global | 停租租金(全局) | stopmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 25 | rowno_stoprent | 停租单行号 | rowno_stoprent | varchar(30) |  | 字符串 (String) |
| 26 | rowno_src | 合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 27 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 28 | pk_material_v | 物料 | pk_material_v | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 29 | pk_material | 物料最新版本 | pk_material | varchar(20) | √ | 物料基本信息 (material_v) |
| 30 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 31 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |