# |<<

**组织默认CBS (bd_cbsdefault / nc.vo.bd.cbs.CBSDefaultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defaultcbs | ID标识 | pk_defaultcbs | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_cbs | CBS成员 | pk_cbs | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 4 | pk_projectype | 项目类型 | pk_projectype | varchar(20) |  | 项目类型 (projectclass) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |