# |<<

**要素科目对照关系 (resa_facaccrelate / nc.vo.resa.factor.FacAccRelateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_facaccrelate | ID标识 | pk_facaccrelate | char(20) | √ | 主键 (UFID) |
| 2 | factorcode | 要素编码 | factorcode | varchar(50) |  | 字符串 (String) |
| 3 | factorname | 要素名称 | factorname | varchar(50) |  | 字符串 (String) |
| 4 | accountcode | 科目编码 | accountcode | varchar(50) |  | 字符串 (String) |
| 5 | accountname | 科目名称 | accountname | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |