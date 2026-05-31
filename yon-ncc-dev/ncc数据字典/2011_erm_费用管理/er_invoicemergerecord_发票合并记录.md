# |<<

**发票合并记录 (er_invoicemergerecord / nc.vo.erm.invoicemergerecord.InvoiceMergeRecord)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicemergerecord | 主键 | pk_invoicemergerecord | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | ismergevalid | 是否有效记录 | ismergevalid | varchar(50) |  | 字符串 (String) |
| 5 | creator | 创建人 | creator | varchar(20) | √ | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |