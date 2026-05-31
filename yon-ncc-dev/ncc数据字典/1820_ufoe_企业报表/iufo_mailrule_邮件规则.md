# |<<

**邮件规则 (iufo_mailrule / nc.vo.iufo.mailrule.IUfoMailRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3472.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mailrule | 规则主键 | pk_mailrule | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | rulecontent | 规则内容 | rulecontent | image |  | BLOB (BLOB) |
| 4 | pk_task | 任务 | pk_task | varchar(20) |  | 任务 (task) |
| 5 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 6 | pk_mailrulesort | 发布规则分类 | pk_mailrulesort | varchar(20) |  | 邮件规则分类 (IUfoMailRuleSort) |
| 7 | datatype | 发布数据类型 | datatype | int |  | 发布数据类型 (datatypeenum) |  | 0=企业报表; |