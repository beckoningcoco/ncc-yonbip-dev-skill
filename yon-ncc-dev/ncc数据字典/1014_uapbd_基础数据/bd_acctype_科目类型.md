# |<<

**科目类型 (bd_acctype / nc.vo.bd.accsystem.AccTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acctype | 主键 | pk_acctype | char(20) | √ | 主键 (UFID) |
| 2 | ccode | 科目类型编码 | ccode | varchar(50) | √ | 字符串 (String) |
| 3 | name | 科目类型名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | balanorient | 余额方向 | balanorient | smallint | √ | 余额方向 (enum) |  | 0=借; |