# |<<

**上机日志 (sm_log_operatelog / nc.bs.sm.operatelog.vo.OperateLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatelog | 主键 | pk_operatelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户主键 | pk_user | varchar(36) |  | 用户 (user) |
| 3 | user_name | 用户名称 | user_name | varchar(20) |  | 字符串 (String) |
| 4 | usertype | 用户类型 | usertype | smallint |  | 整数 (Integer) |
| 5 | pk_psndoc | 人员档案主键 | pk_psndoc | varchar(36) |  | 人员基本信息 (psndoc) |
| 6 | pk_group | 登录集团主键 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 7 | ip | 客户端ip | ip | varchar(20) |  | 字符串 (String) |
| 8 | type | 日志类型 | type | smallint |  | 整数 (Integer) |
| 9 | pk_funcnode | 功能节点主键 | pk_funcnode | varchar(20) |  | 功能实体 (functionEntity) |
| 10 | funccode | 功能节点编码 | funccode | varchar(20) |  | 菜单项实体 (menuitem) |
| 11 | funcname | 功能节点全名 | funcname | varchar(200) |  | 字符串 (String) |
| 12 | buttoncode | 按钮编码 | buttoncode | varchar(50) |  | 字符串 (String) |
| 13 | buttonname | 按钮名称 | buttonname | varchar(50) |  | 字符串 (String) |
| 14 | logdate | 操作日期 | logdate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | logtime | 操作时间 | logtime | char(8) |  | 时间 (UFTime) |
| 16 | logoffdate | 注销日期 | logoffdate | char(19) |  | 日期时间 (UFDateTime) |
| 17 | logofftime | 注销时间 | logofftime | char(8) |  | 时间 (UFTime) |
| 18 | entersystemresult | 登录结果 | entersystemresult | int |  | 登录结果 (loginresultenum) |  | 0=登陆成功; |