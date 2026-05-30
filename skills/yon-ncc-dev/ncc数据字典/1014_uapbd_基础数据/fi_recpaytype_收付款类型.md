# |<<

**收付款类型 (fi_recpaytype / nc.vo.fibd.RecpaytypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2206.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recpaytype | 收付款类型标识 | pk_recpaytype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 5 | pretype | 收付款性质 | pretype | int |  | 收付款性质 (收付款性质) |  | 1=应收款; |