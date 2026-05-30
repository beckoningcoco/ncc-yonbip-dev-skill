# |<<

**周转材租出调整清单 (rom_accept_d / nc.vo.rom.accept.Adjust)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accept_d | 调整清单子表主键 | pk_accept_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | adjust_num | 调整报价数量 | adjust_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 12 | pk_contract_b_src | 来源合同行 | pk_contract_b_src | varchar(20) |  | 字符串 (String) |
| 13 | pk_contract_b_base_src | 来源合同行原版主键 | pk_contract_b_base_src | varchar(20) |  | 字符串 (String) |
| 14 | rowno_src | 合同行号 | rowno_src | varchar(30) |  | 字符串 (String) |
| 15 | ismaterial_flag | 是否物料 | ismaterial_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 17 | src_body_rowno | 来源单据表体行号 | src_body_rowno | varchar(30) |  | 字符串 (String) |
| 18 | start_date | 计租日 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 19 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 25 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 29 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |