# |<<

**岗位设置子表 (po_position_b / nc.vo.pu.position.entity.PositionItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_position_b | 岗位设置子表 | pk_position_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | marbasclass_code | 物料基本分类编码 | marbasclass_code | varchar(50) |  | 字符串 (String) |
| 5 | pk_marpuclass | 物料采购分类 | pk_marpuclass | varchar(20) |  | 物料采购分类 (marpuclass) |
| 6 | marpuclass_code | 物料采购分类编码 | marpuclass_code | varchar(50) |  | 字符串 (String) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | material_code | 物料编码 | material_code | varchar(50) |  | 字符串 (String) |
| 9 | fflag | 应用/排除 | fflag | int |  | 应用/排除 (EnumUseMove) | 1 | 1=应用; |