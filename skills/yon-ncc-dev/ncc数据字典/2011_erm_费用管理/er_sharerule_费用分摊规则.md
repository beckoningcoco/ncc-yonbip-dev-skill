# |<<

**费用分摊规则 (er_sharerule / nc.vo.erm.sharerule.ShareruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sharerule | 主键 | pk_sharerule | char(20) | √ | 主键 (UFID) |
| 2 | rule_code | 编码 | rule_code | varchar(50) |  | 字符串 (String) |
| 3 | rule_name | 名称 | rule_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | rule_type | 分摊方式 | rule_type | int |  | 费用分摊方式 (ershareruletype) |  | 1=平均分摊; |