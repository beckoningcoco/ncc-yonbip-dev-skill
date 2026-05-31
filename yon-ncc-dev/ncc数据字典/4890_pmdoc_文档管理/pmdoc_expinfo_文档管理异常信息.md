# |<<

**文档管理异常信息 (pmdoc_expinfo / nc.vo.pmdoc.docexp.DocExpInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docexp | 异常信息主键 | pk_docexp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | expcode | 异常码 | expcode | varchar(50) |  | 字符串 (String) |
| 4 | pk_bill | 业务主键 | pk_bill | varchar(100) |  | 字符串 (String) |
| 5 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 6 | exp_desc | 异常描述 | exp_desc | varchar(500) |  | 字符串 (String) |
| 7 | content | 异常内容 | content | varchar(1000) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |