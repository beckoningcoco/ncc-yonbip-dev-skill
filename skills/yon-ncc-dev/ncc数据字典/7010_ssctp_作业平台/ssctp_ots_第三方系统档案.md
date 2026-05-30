# |<<

**第三方系统档案 (ssctp_ots / nc.vo.ssctp.dooroad.DROtsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ots | 唯一标识 | pk_ots | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(200) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | host | 地址 | host | varchar(50) |  | 字符串 (String) |
| 5 | port | 端口 | port | varchar(5) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |