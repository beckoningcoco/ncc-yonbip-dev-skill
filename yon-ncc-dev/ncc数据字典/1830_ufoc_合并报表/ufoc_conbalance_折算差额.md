# |<<

**折算差额 (ufoc_conbalance / nc.vo.ufoc.convert.ConvertBalanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conbalance | 主键 | pk_conbalance | char(20) | √ | 主键 (UFID) |
| 2 | pk_project | 折算差额项目 | pk_project | varchar(50) |  | 字符串 (String) |
| 3 | pk_left | 左边项目 | pk_left | varchar(50) |  | 字符串 (String) |
| 4 | item_seq | 序号 | item_seq | int |  | 整数 (Integer) |
| 5 | item_type | 类型 | item_type | int |  | 整数 (Integer) |
| 6 | pk_report | 报表标识 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 7 | pk_right | 右侧项目 | pk_right | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |