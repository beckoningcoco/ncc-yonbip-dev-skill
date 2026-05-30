# |<<

**报告模板 (sscqm_ag_template / nccloud.vo.sscqm.sscag.template.TemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_template | 模板主键 | pk_template | char(20) | √ | 主键 (UFID) |
| 2 | code | 模板编码 | code | varchar(500) |  | 字符串 (String) |
| 3 | name | 模板名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | content | 模板内容 | content | image |  | BLOB (BLOB) |
| 5 | templatetype | 模板类型 | templatetype | varchar(50) |  | 字符串 (String) |
| 6 | enablestate | 是否启用 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |