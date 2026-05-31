# |<<

**证件类别 (bd_psnidtype / nc.vo.bd.psnid.PsnIdtypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/945.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_identitype | 证件类型主键 | pk_identitype | char(20) | √ | 主键 (UFID) |
| 2 | code | 证件类型编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 证件类型名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | country | 国家 | country | varchar(20) |  | 国家地区 (countryzone) |
| 5 | idtypelength | 证件号长度 | idtypelength | int |  | 整数 (Integer) |
| 6 | regex | 校验规则 | regex | varchar(200) |  | 字符串 (String) |
| 7 | idtypevalidat | 校验接口类 | idtypevalidat | varchar(200) |  | 字符串 (String) |
| 8 | description | 描述 | description | varchar(200) |  | 字符串 (String) |
| 9 | datatype | 数据类型 | datatype | int |  | 数据类型 (datatype) |  | 0=系统数据; |