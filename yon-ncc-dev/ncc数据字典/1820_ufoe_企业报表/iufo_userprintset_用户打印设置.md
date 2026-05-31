# |<<

**用户打印设置 (iufo_userprintset / nc.vo.iufo.print.UserPrintSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3532.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userprintset | 主键 | pk_userprintset | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户主键 | pk_user | varchar(50) | √ | 字符串 (String) |
| 3 | pk_report | 报表主键 | pk_report | varchar(50) | √ | 字符串 (String) |
| 4 | printset | 打印设置 | printset | image |  | BLOB (BLOB) |
| 5 | advancedprintset | 高级打印设置 | advancedprintset | image |  | BLOB (BLOB) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |