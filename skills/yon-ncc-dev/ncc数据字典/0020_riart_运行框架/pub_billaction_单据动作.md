# |<<

**单据动作 (pub_billaction / nc.vo.pub.pfflow.BillactionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billaction | 主键 | pk_billaction | varchar(50) | √ | 字符串 (String) |
| 2 | actionnote | 动作名称 | actionnote | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | showhint | 动作执行前提示 | showhint | varchar(200) |  | 多语文本 (MultiLangText) |