# |<<

**卸出记录 (sm_log_unloading / nc.bs.sm.unloadinglog.vo.UnloadingLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unloading | 卸出主键 | pk_unloading | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户主键 | pk_user | varchar(20) |  | 用户 (user) |
| 3 | user_name | 用户名称 | user_name | varchar(50) |  | 字符串 (String) |
| 4 | pk_psndoc | 人员档案主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | ip | 客户端ip | ip | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | operationname | 操作名称 | operationname | varchar(50) |  | 字符串 (String) |
| 8 | operationresult | 操作结果 | operationresult | varchar(50) |  | 字符串 (String) |
| 9 | operationtype | 操作类型 | operationtype | varchar(50) |  | 字符串 (String) |
| 10 | usertype | 用户类型 | usertype | int |  | 用户类型 (UserEnum) |  | 0=集团管理员; |