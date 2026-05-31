# |<<

**收入确认政策 (firm_incomepolicy / nc.vo.rm.basedoc.IncomePolicyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomepolicy | 主键 | pk_incomepolicy | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | defertype | 递延收入确认类型 | defertype | int |  | 收入确认类型 (IncomeTypeEnum) |  | 1=按时点; |