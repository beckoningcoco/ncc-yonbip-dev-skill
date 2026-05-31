# |<<

**自由表单 (wfm_freeform / nc.uap.wfm.formhistory.WfmFreeFormVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freeform | 主键 | pk_freeform | varchar(50) | √ | 字符串 (String) |
| 2 | makenum | 制单号 | makenum | varchar(50) |  | 字符串 (String) |
| 3 | frmtitile | 单据标题 | frmtitile | varchar(50) |  | 字符串 (String) |
| 4 | frmstate | 单据状态 | frmstate | varchar(50) |  | 字符串 (String) |
| 5 | audituser | 审核人 | audituser | varchar(20) |  | 用户 (user) |
| 6 | auditdate | 审核日期 | auditdate | varchar(50) |  | 字符串 (String) |
| 7 | makedept | 制单部门 | makedept | varchar(20) |  | 组织 (org) |
| 8 | makeuser | 制单人 | makeuser | varchar(20) |  | 用户 (user) |
| 9 | makedate | 制单日期 | makedate | char(19) |  | 日期时间 (UFDateTime) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |