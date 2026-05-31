# |<<

**CTMSLogVO (ctms_varylog / nccloud.ctms.change.vo.CTMSLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1686.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 日志主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | varyid | 变更号 | varyid | varchar(64) |  | 字符串 (String) |
| 3 | type | 类型 | type | varchar(50) |  | 字符串 (String) |
| 4 | flag | 错误标识 | flag | varchar(50) |  | 字符串 (String) |
| 5 | context | 详细内容 | context | varchar(1500) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |