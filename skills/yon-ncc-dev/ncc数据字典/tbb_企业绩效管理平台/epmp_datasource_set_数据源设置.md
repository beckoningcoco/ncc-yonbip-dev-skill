# |<<

**数据源设置 (epmp_datasource_set / nc.vo.epm.datasourceset.DataSourceSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_epmp_dsset | 数据源设置主键 | pk_epmp_dsset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元主键 | pk_org | varchar(50) | √ | 字符串 (String) |
| 3 | datasource | 数据源编码 | datasource | varchar(50) |  | 字符串 (String) |
| 4 | mappingorgcode | 对应业务单元编码 | mappingorgcode | varchar(50) |  | 字符串 (String) |
| 5 | mappingorgpk | 对应业务单元主键 | mappingorgpk | char(20) |  | 字符串 (String) |
| 6 | usercode | 用户编码 | usercode | varchar(50) |  | 字符串 (String) |
| 7 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |