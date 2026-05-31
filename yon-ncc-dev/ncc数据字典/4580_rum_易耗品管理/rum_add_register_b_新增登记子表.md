# |<<

**新增登记子表 (rum_add_register_b / nc.vo.rum.addregister.AddRegisterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_add_register_b | 新增登记表体主键 | pk_add_register_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_material | 物料最新版本 | pk_material | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | pk_material_v | 物料 | pk_material_v | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | nbatchcode | 批次号 | nbatchcode | varchar(40) |  | 字符串 (String) |
| 9 | serial_number | 序列号 | serial_number | varchar(50) |  | 字符串 (String) |
| 10 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 11 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 12 | changerate | 换算率 | changerate | varchar(50) |  | 字符串 (String) |
| 13 | pk_main_unit | 主单位 | pk_main_unit | varchar(20) |  | 计量单位 (measdoc) |
| 14 | main_num | 主数量 | main_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 15 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 16 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 17 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 18 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 25 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |