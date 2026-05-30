# |<<

**结算价格分类子表 (nresa_settlpriclass_b / nc.vo.nresa.insetprice.settlpriclass.SettlPriClassBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlpriclassb | 结算价格分类子表主键 | pk_settlpriclassb | char(20) | √ | 主键 (UFID) |
| 2 | ordernum | 序号 | ordernum | int |  | 整数 (Integer) |
| 3 | pk_interfactor | 影响因素编码 | pk_interfactor | varchar(20) |  | 价格影响因素 (interfactor) |
| 4 | unused | 是否停用 | unused | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 6 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 7 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |