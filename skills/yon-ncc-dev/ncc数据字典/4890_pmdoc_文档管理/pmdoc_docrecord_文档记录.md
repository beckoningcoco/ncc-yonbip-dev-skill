# |<<

**文档记录 (pmdoc_docrecord / nc.vo.pmdoc.docrecord.DocRecordHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4574.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | 文档记录主键 | pk_doc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_code | 文档编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | doc_name | 文档名称 | doc_name | varchar(500) |  | 字符串 (String) |
| 7 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |