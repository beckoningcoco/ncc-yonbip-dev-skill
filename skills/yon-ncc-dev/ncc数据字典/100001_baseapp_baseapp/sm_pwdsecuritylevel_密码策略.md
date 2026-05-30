# |<<

**密码策略 (sm_pwdsecuritylevel / nc.vo.uap.rbac.userpassword.PasswordSecurityLevel)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_passwordsec | 主键 | pk_passwordsec | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(20) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(20) | √ | 多语文本 (MultiLangText) |
| 4 | minimumlength | 最低长度 | minimumlength | int |  | 整数 (Integer) |
| 5 | errorloginthreshold | 错误允许数 | errorloginthreshold | int |  | 整数 (Integer) |
| 6 | starttime | 生效日期 | starttime | char(19) |  | 日期 (UFDate) |
| 7 | alertdays | 有效天数 | alertdays | int |  | 整数 (Integer) |
| 8 | validatedays | 有效提示天数 | validatedays | int |  | 整数 (Integer) |
| 9 | remembercount | 旧密码记忆数 | remembercount | int |  | 整数 (Integer) |
| 10 | invalidatelock | 是否强制修改 | invalidatelock | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | similaritydegree | 相似度 | similaritydegree | varchar(20) |  | 字符串 (String) |
| 12 | isautolock | 是否自动解锁 | isautolock | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | unlocktime | 解锁间隔时间 | unlocktime | int |  | 整数 (Integer) |
| 14 | complexity | 密码强度 | complexity | varchar(101) | √ | 自定义项 (Custom) |