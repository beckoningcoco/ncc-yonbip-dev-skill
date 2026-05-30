# |<<

**入离职交接细项 (hi_handitemset / nccloud.dto.hryf.handitemset.HandItemSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handitemset | 入离职交接细项配置主键 | pk_handitemset | varchar(50) | √ | 字符串 (String) |
| 2 | pk_handcond | 入离职交接条件主键 | pk_handcond | varchar(50) |  | 字符串 (String) |
| 3 | pk_handitem | 入离职细项主键 | pk_handitem | varchar(20) |  | 入离职细项 (handitem) |
| 4 | pk_handler | 办理人 | pk_handler | varchar(20) |  | 用户 (user) |
| 5 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 6 | orders | 序号 | orders | int |  | 整数 (Integer) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |