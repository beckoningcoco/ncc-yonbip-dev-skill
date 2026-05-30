# |<<

**费用发票稽核 (er_erminvoicecheck / nc.vo.erm.erminvoicecheck.ErmInvoiceCheck)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1889.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoicecheck | 主键 | pk_erminvoicecheck | char(20) | √ | 主键 (UFID) |
| 2 | pk_jkbx | 报销单主键 | pk_jkbx | varchar(50) |  | 字符串 (String) |
| 3 | djbh | 报销单据编号 | djbh | varchar(50) |  | 字符串 (String) |
| 4 | djlxmc | 交易类型名称 | djlxmc | varchar(50) |  | 字符串 (String) |
| 5 | djrq | 单据日期 | djrq | char(19) |  | 日期 (UFDate) |
| 6 | jkbxr | 报销人 | jkbxr | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | zy | 事由 | zy | varchar(500) |  | 字符串 (String) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | yfzt | 验符状态 | yfzt | varchar(50) |  | 字符串 (String) |
| 12 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | creator | 创建人 | creator | varchar(20) | √ | 用户 (user) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 25 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |