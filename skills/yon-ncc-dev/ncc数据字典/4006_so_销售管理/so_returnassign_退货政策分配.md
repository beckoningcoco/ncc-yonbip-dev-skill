# |<<

**退货政策分配 (so_returnassign / nc.vo.so.mreturnassign.entity.ReturnAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returnassign | 退货政策分配主键 | pk_returnassign | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_saleorg | 销售组织 | pk_saleorg | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_custclass | 客户基本分类编码 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 5 | pk_custsaleclass | 客户销售分类编码 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 6 | pk_customer | 客户编码 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_marbasclass | 物料基本分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | pk_marsaleclass | 物料销售分类编码 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 9 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | pk_productline | 产品线编码 | pk_productline | varchar(20) |  | 产品线 (prodline) |
| 11 | pk_returnpolicy | 退货政策编码 | pk_returnpolicy | varchar(20) |  | 退货政策设置 (returnpolicy) |
| 12 | cprioritycode | 优先码 | cprioritycode | varchar(40) |  | 字符串 (String) |