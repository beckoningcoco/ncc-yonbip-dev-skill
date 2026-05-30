# |<<

**业务资源包 (adp_busirespack / nc.vo.uap.distribution.restrans.BusinessResourcePackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 编号 | id | char(20) | √ | 主键 (UFID) |
| 2 | respackcode | 资源包编码 | respackcode | varchar(500) |  | 字符串 (String) |
| 3 | filename | 资源包名称 | filename | varchar(500) |  | 字符串 (String) |
| 4 | transpackid | 传输包编号 | transpackid | varchar(50) |  | 字符串 (String) |
| 5 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | sendstatus | 发送状态 | sendstatus | int |  | 资源发送状态 (TransResSendStatus) |  | 0=无发送数据; |