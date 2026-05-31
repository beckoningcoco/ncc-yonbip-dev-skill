# |<<

**事找人消息表 (scm_todomsg / nc.vo.scmpub.todomsg.entity.TodoMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_todomsg | 消息接收主键 | pk_todomsg | char(20) | √ | 主键 (UFID) |
| 2 | pk_message | 业务消息主键 | pk_message | char(20) |  | 主键 (UFID) |
| 3 | pk_billtype | 业务单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 4 | pk_billid | 业务单据主键 | pk_billid | char(20) |  | 主键 (UFID) |
| 5 | pk_billbid | 业务单据子表主键 | pk_billbid | char(20) |  | 主键 (UFID) |
| 6 | pk_receiver | 消息接收人 | pk_receiver | char(20) |  | 主键 (UFID) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 组织版本 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 字符串 (String) |
| 11 | fmsgstatus | 消息状态 | fmsgstatus | int |  | 整数 (Integer) | 0 |
| 12 | transitypecode | 交易类型编码 | transitypecode | varchar(20) |  | 字符串 (String) |