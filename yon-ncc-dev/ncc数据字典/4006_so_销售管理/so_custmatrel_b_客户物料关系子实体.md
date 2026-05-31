# |<<

**客户物料关系子实体 (so_custmatrel_b / nc.vo.so.custmatrel.entity.CustMatRelBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5396.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custmatrel_b | 子实体主键 | pk_custmatrel_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | pk_custbaseclass | 客户基本分类 | pk_custbaseclass | varchar(20) |  | 客户基本分类 (custclass) |
| 4 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 5 | pk_customer | 客户编码 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 6 | pk_materialbaseclass | 物料基本分类 | pk_materialbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_materialsaleclass | 物料销售分类 | pk_materialsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 8 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | exclude | 不包含 | exclude | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vnote | 行备注 | vnote | varchar(181) |  | 字符串 (String) |
| 12 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | cprioritycode | 优先码 | cprioritycode | varchar(40) |  | 字符串 (String) |