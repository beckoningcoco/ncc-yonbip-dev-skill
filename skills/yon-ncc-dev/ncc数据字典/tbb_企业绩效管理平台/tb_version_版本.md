# |<<

**版本 (tb_version / nc.vo.tb.dimdocpub.BudgetVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objname | 名称 | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 4 | versiontype | 版本类型 | versiontype | int |  | 版本类型 (versiontype) |  | 0=自上而下; |