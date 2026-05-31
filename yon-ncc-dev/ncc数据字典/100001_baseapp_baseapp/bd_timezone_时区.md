# |<<

**时区 (bd_timezone / nc.vo.bd.timezone.TimezoneVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timezone | 主键 | pk_timezone | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | offsetvar | 偏移量 | offsetvar | varchar(50) |  | 字符串 (String) |
| 5 | description | 描述 | description | varchar(150) |  | 字符串 (String) |