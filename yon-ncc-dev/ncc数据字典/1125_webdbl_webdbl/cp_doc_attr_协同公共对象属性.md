# |<<

**协同公共对象属性 (cp_doc_attr / uap.lfw.dbl.vo.CpDocAttributeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attribute | pk_attribute | pk_attribute | varchar(50) | √ | 字符串 (String) |
| 2 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | type_style | 类型样式 | type_style | varchar(50) |  | 公共对象属性类型样式 (typestyleenum) |  | 300=SINGLE; |