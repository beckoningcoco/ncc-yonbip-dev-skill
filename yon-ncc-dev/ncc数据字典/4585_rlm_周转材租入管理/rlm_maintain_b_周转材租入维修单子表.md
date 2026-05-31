# |<<

**周转材租入维修单子表 (rlm_maintain_b / nc.vo.rlm.maintain.MaintainBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_maintain_b | 维修单子表主键 | pk_maintain_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_supplier | 出租方 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | pk_producer | 生产厂商 | pk_producer | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 12 | pk_main_unit | 主单位 | pk_main_unit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 14 | num | 维修数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 15 | main_num | 维修主数量 | main_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 16 | rent_num | 维修报价数量 | rent_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 17 | changerate | 换算率 | changerate | varchar(50) |  | 字符串 (String) |
| 18 | rent_changerate | 报价单位换算率 | rent_changerate | varchar(50) |  | 字符串 (String) |
| 19 | comp_money | 维修费用(原币) | comp_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | comp_money_org | 维修费用(本币) | comp_money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | comp_money_group | 维修费用(集团) | comp_money_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | comp_money_global | 维修费用(全局) | comp_money_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 24 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 25 | pk_contract_b_src | 来源合同行 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 26 | pk_contract_b_base_src | 来源合同行原版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 27 | ismaterial_flag | 是否物料 | ismaterial_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | rowno_src | 合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 29 | nbatchcode | 批次号 | nbatchcode | varchar(40) |  | 字符串 (String) |
| 30 | pk_maintainstd | 维修标准 | pk_maintainstd | varchar(20) |  | 维修标准 (maintainstd) |
| 31 | maintain_price | 维修单价 | maintain_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 42 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |