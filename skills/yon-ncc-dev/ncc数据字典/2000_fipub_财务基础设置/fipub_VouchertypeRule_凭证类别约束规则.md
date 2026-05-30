# |<<

**凭证类别约束规则 (fipub_VouchertypeRule / nc.vo.fipub.vouchertyperule.VouchertypeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2276.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchertyperule | 约束规则主键 | pk_vouchertyperule | varchar(50) | √ | 字符串 (String) |
| 2 | pk_accountingbook | 核算账薄 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | ruletype | 限制类型 | ruletype | varchar(50) |  | 限制类型 (enum) |  | 0=空; |