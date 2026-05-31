# |<<

**文档分类表 (sm_document_category / nc.document.pub.vo.FileCategoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_category | 主键 | pk_category | varchar(36) | √ | 字符串 (String) |
| 2 | categoryname | 分类名称 | categoryname | varchar(50) |  | 字符串 (String) |
| 3 | pk_parent | 父分类 | pk_parent | varchar(36) |  | 文档分类表 (document_category) |
| 4 | modifytime | 修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | pk_group | 集团主键 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 6 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | sysid | 系统标志 | sysid | varchar(10) |  | 字符串 (String) |
| 8 | creator | 创建者 | creator | varchar(36) |  | 用户 (user) |