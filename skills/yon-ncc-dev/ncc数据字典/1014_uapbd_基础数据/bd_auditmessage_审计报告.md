# |<<

**审计报告 (bd_auditmessage / nc.vo.bd.audit.AuditassMessageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auditmessage | 主键 | pk_auditmessage | char(20) | √ | 主键 (UFID) |
| 2 | message | 导出消息 | message | varchar(1000) |  | 字符串 (String) |
| 3 | pk_userid | 用户 | pk_userid | varchar(20) |  | 用户 (user) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |