# |<<

**用户默认密码 (sm_user_defaultpwd / nc.vo.sm.UserDefaultPasswordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_defaultpwd | 主键 | pk_user_defaultpwd | char(20) | √ | 主键 (UFID) |
| 2 | defaultpwd | 默认密码 | defaultpwd | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 5 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |