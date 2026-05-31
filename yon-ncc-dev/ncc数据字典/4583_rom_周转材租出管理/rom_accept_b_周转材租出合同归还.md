# |<<

**周转材租出合同归还 (rom_accept_b / nc.vo.rom.accept.ContractRestore)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accept_b | 合同归还子表主键 | pk_accept_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) | √ | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料最新版本 | pk_material | varchar(20) | √ | 物料基本信息 (material_v) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | pk_producer | 生产厂商 | pk_producer | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | return_status | 退回状态 | return_status | varchar(80) |  | 字符串 (String) |
| 12 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | rent_num | 归还报价数量 | rent_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 14 | end_date | 止租日 | end_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | return_money | 归还费用(原币) | return_money | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 16 | return_money_org | 归还费用(本币) | return_money_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 17 | return_money_group | 归还费用(集团) | return_money_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 18 | return_money_global | 归还费用(全局) | return_money_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 21 | pk_contract_b_src | 来源合同行 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 22 | pk_contract_b_base_src | 来源合同行原版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 23 | rowno_src | 合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 24 | ismaterial_flag | 是否物料 | ismaterial_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | nbatchcode | 批次号 | nbatchcode | varchar(40) |  | 字符串 (String) |
| 26 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 27 | pk_main_unit | 主单位 | pk_main_unit | varchar(20) |  | 计量单位 (measdoc) |
| 28 | num | 归还数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | main_num | 归还主数量 | main_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | changerate | 换算率 | changerate | varchar(50) |  | 字符串 (String) |
| 31 | rent_changerate | 报价单位换算率 | rent_changerate | varchar(50) |  | 字符串 (String) |
| 32 | discard_num | 报废数量 | discard_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | lost_num | 遗失数量 | lost_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | main_num_discard | 报废主数量 | main_num_discard | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | main_num_lost | 遗失主数量 | main_num_lost | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | rent_num_discard | 报废报价数量 | rent_num_discard | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | rent_num_lost | 遗失报价数量 | rent_num_lost | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | src_body_ts | 来源单据表体时间戳 | src_body_ts | char(19) |  | 日期时间 (UFDateTime) |
| 39 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 49 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |