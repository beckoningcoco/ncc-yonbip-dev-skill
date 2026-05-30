# |<<

**报废单子表 (rum_disused_b / nc.vo.rum.disused.DisusedBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disused_b | 报废单表体主键 | pk_disused_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_material | 物料最新版本 | pk_material | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | pk_material_v | 物料 | pk_material_v | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | pk_user | 使用人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_usedept | 使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 11 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 12 | changerate | 换算率 | changerate | varchar(50) |  | 字符串 (String) |
| 13 | pk_main_unit | 主单位 | pk_main_unit | varchar(20) |  | 计量单位 (measdoc) |
| 14 | main_num | 主数量 | main_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 15 | pk_addreducestyle | 报废方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 16 | pk_reason | 报废原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 17 | receivemoney_org | 报废收入 | receivemoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 18 | receivemoney_group | 集团本位币报废收入 | receivemoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 19 | receivemoney_global | 全局本位币报废收入 | receivemoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 20 | paymoney_org | 报废支出 | paymoney_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 21 | paymoney_group | 集团本位币报废支出 | paymoney_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 22 | paymoney_global | 全局本位币报废支出 | paymoney_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 23 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 24 | wbs | WBS | wbs | varchar(20) |  | 项目任务 (WBS) |
| 25 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 27 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | pk_producer | 生产厂商 | pk_producer | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 29 | nbatchcode | 批次号 | nbatchcode | varchar(40) |  | 字符串 (String) |
| 30 | pk_usedept_v | 使用部门版本 | pk_usedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 31 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 41 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |