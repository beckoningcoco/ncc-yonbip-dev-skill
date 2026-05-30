# |<<

**报表查询对象设置 (arap_qryobject / nc.vo.arap.query.QueryObjSuperVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qryobject | 主键 | pk_qryobject | char(20) | √ | 主键 (UFID) |
| 2 | fun_code | 功能编码 | fun_code | varchar(256) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(256) |  | 字符串 (String) |
| 4 | objfield | 字段 | objfield | varchar(256) |  | 字符串 (String) |
| 5 | objalias | 别名 | objalias | varchar(256) |  | 字符串 (String) |
| 6 | nameformula | 名称展现公式 | nameformula | varchar(1024) |  | 字符串 (String) |
| 7 | codeformula | 编码展现公式 | codeformula | varchar(1024) |  | 字符串 (String) |
| 8 | showorder | 展示顺序 | showorder | int |  | 整数 (Integer) |
| 9 | refname | 参照名称 | refname | varchar(50) |  | 字符串 (String) |