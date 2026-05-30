# |<<

**打印日志 (pub_printlog / nc.vo.uapbd.printnumber.PrintLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printlog | 主键 | pk_printlog | char(20) | √ | 主键 (UFID) |
| 2 | printnumber | 打印顺序 | printnumber | int |  | 整数 (Integer) |
| 3 | printdata | 打印日期 | printdata | char(19) |  | 日期时间 (UFDateTime) |
| 4 | operator | 打印人 | operator | varchar(20) |  | 用户 (user) |