# |<<

**客户物料码 (bd_custmaterial / nc.vo.uapbd.custmaterial.CustMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custmaterial | 客户物料码主键 | pk_custmaterial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_customer | 客户编码 | pk_customer | varchar(20) | √ | 客户基本信息 (customer) |
| 5 | code | 客户物料码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 客户物料名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | materialid | 物料编码 | materialid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |