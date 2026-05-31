# |<<

**物资资质子表 (scm_invqualifi_b / nc.vo.scmpub.materialquali.InvqualifiBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invqualifi_b | 主键 | pk_invqualifi_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | invname | 物资名称 | invname | varchar(200) |  | 字符串 (String) |
| 5 | bisseal | 是否封存 | bisseal | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_supplier_main | 主供应商 | pk_supplier_main | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | pk_factory | 生产厂商 | pk_factory | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 8 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |