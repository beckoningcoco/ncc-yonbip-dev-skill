# |<<

**轮流派单用户队列 (ssctp_idispatchusers / nccloud.vo.ssctp.intellidispatch.idispatchusers.IdispatchusersVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5647.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workinggroup | 主键 | pk_workinggroup | char(20) | √ | 主键 (UFID) |
| 2 | content | 队列内容 | content | image |  | BLOB (BLOB) |
| 3 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 4 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 6 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |