# |<<

**分布系统传输日志 (gl_distranslog / nc.vo.gl.distribution.DistransLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distranslog | 传输日志主键 | pk_distranslog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | taskid | 任务ID | taskid | varchar(50) |  | 字符串 (String) |
| 5 | sendercode | 发送方 | sendercode | varchar(50) |  | 字符串 (String) |
| 6 | receiptercode | 接收方 | receiptercode | varchar(50) |  | 字符串 (String) |
| 7 | pk_resource | 传输资源主键 | pk_resource | varchar(20) |  | 字符串 (String) |
| 8 | transtime | 上传时间 | transtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | transstate | 传输状态 | transstate | varchar(50) |  | 传输状态 (transstate) |  | 1=传输中; |