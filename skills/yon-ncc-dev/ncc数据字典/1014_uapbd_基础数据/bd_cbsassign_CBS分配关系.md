# |<<

**CBS分配关系 (bd_cbsassign / nc.vo.bd.cbs.CBSAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cbsassign | ID标识 | pk_cbsassign | char(20) | √ | 主键 (UFID) |
| 2 | pk_cbs | CBS成员 | pk_cbs | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_projectype | 项目类型 | pk_projectype | varchar(20) |  | 项目类型 (projectclass) |