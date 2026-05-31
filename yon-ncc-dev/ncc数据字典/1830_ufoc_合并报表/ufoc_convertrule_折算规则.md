# |<<

**折算规则 (ufoc_convertrule / nc.vo.ufoc.conver.ConvertRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5868.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertrule | 主键 | pk_convertrule | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 4 | datatype | 数据类别 | datatype | int |  | 数据类别 (reporttype) |  | 0=个别报表; |