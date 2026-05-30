# |<<

**序列号规则分配 (sn_assign / nc.vo.sn.assign.entity.SnAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign | 序列号规则分配主键 | pk_assign | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_marbasclass | 物料基本分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | pk_material | 物料版本信息 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | pk_srcmaterial | 物料编码 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | pk_snrule | 序列号编码规则 | pk_snrule | varchar(20) |  | 序列号规则 (snrule) |
| 8 | vinnercode | 物料基本分类内码 | vinnercode | varchar(200) |  | 字符串 (String) |