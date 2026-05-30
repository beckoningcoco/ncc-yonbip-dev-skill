# |<<

**供货能力分类 (srmsm_supplierext_a / nc.vo.bd.supplierext.entity.SupplierExtAVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierext_a | 供货能力分类主键 | pk_supplierext_a | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | csupabiliy | 供货能力分类编码 | csupabiliy | varchar(20) |  | 供货能力分类 (supply_ability_class) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | csrcid | 来源单据id | csrcid | varchar(20) |  | 字符串 (String) |
| 9 | csrcbid | 来源单据bid | csrcbid | varchar(20) |  | 字符串 (String) |