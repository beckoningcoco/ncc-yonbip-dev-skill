# |<<

**业务日志 (sm_busilog_default / nc.bs.busilog.vo.BusinessLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5292.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busilog | 主键 | pk_busilog | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 用户主键 | pk_user | varchar(36) |  | 用户 (user) |
| 3 | pk_group | 登录集团主键 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 4 | client | 客户端ip | client | varchar(20) |  | 字符串 (String) |
| 5 | pk_operation | 操作主键 | pk_operation | varchar(20) |  | 字符串 (String) |
| 6 | typepk_busiobj | 元数据id | typepk_busiobj | varchar(36) |  | 实体 (entity) |
| 7 | busiobjcode | 业务对象编码 | busiobjcode | varchar(200) |  | 字符串 (String) |
| 8 | busiobjname | 业务对象名称 | busiobjname | varchar(200) |  | 字符串 (String) |
| 9 | orgpk_busiobj | 业务对象组织主键 | orgpk_busiobj | varchar(36) |  | 组织 (org) |
| 10 | logdate | 操作日期 | logdate | char(19) |  | 日期时间 (UFDateTime) |
| 11 | operateresult | 操作结果 | operateresult | varchar(50) |  | 字符串 (String) |
| 12 | logmsg | 详细信息 | logmsg | varchar(1000) |  | 字符串 (String) |