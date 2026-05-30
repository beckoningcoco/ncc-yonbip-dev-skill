# |<<

**模板单元 (fip_templatecell / nc.vo.fip.transtemplate.TemplateCellVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templatecell | 对象标识 | pk_templatecell | char(20) | √ | 主键 (UFID) |
| 2 | attrcode | 属性编码 | attrcode | varchar(50) |  | 字符串 (String) |
| 3 | attrname | 属性名称 | attrname | varchar(50) |  | 字符串 (String) |
| 4 | columnindex | 顺序列号 | columnindex | int |  | 整数 (Integer) |
| 5 | cellvalue | 单元内容 | cellvalue | varchar(2000) |  | 字符串 (String) |
| 6 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |