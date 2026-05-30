# |<<

**异步删除日志 (bd_ansylog / nc.vo.bd.ansylog.AnsyDelLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_anydelte | 主键 | pk_anydelte | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 异步任务 | pk_task | varchar(20) |  | 字符串 (String) |
| 3 | message | 失败原因 | message | varchar(1024) |  | 字符串 (String) |
| 4 | delperson | 删除人 | delperson | varchar(20) |  | 用户 (user) |
| 5 | deltime | 删除时间 | deltime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | mdid | 元数据id | mdid | varchar(36) |  | 实体 (entity) |
| 7 | pk_basdoc | 档案的主键 | pk_basdoc | char(20) |  | 主键 (UFID) |