# |<<

**报表数据审批 (iufo_repdataapprove / nc.vo.iufo.approve.RepDataApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3493.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repdataapprove | 主键 | pk_repdataapprove | char(20) | √ | 主键 (UFID) |
| 2 | subject | 主题 | subject | varchar(50) |  | 字符串 (String) |
| 3 | sendtime | 提交时间 | sendtime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | sender | 提交人 | sender | varchar(20) |  | 用户 (user) |
| 5 | ishandled | 已处理 | ishandled | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | operate | 操作 | operate | varchar(50) |  | 字符串 (String) |
| 7 | sendername | 提交人名称 | sendername | varchar(50) |  | 字符串 (String) |