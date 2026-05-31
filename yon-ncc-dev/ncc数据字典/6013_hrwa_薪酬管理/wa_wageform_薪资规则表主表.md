# |<<

**薪资规则表主表 (wa_wageform / nc.vo.wa.rule.WageformVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_wageform | 薪资规则表主键 | pk_wa_wageform | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 规则表编码 | code | varchar(100) |  | 字符串 (String) |
| 5 | name | 规则表名称 | name | varchar(1024) |  | 多语文本 (MultiLangText) |
| 6 | vmemo | 规则表说明 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 7 | ndefaultmny | 默认金额 | ndefaultmny | decimal(31, 8) |  | 数值 (UFDouble) |
| 8 | iflddecimal | 小数位数 | iflddecimal | int |  | 整数 (Integer) | 2 |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |