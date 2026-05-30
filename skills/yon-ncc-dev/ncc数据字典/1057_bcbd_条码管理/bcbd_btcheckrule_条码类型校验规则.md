# |<<

**条码类型校验规则 (bcbd_btcheckrule / nc.vo.bcbd.bartype.BTCheckRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btcheckrule | 校验规则主键 | pk_btcheckrule | varchar(50) | √ | 字符串 (String) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | description | 规则描述 | description | varchar(100) |  | 字符串 (String) |
| 5 | classname | 校验类名 | classname | varchar(200) |  | 字符串 (String) |