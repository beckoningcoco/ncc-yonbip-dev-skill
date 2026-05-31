# |<<

**用户 (sm_user / nc.vo.sm.UserVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cuserid | 用户主键 | cuserid | char(20) | √ | 主键 (UFID) |
| 2 | user_name | 用户名称 | user_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | user_code | 用户编码 | user_code | varchar(50) | √ | 字符串 (String) |
| 4 | user_password | 用户密码 | user_password | varchar(50) |  | 字符串 (String) |
| 5 | user_note | 备注 | user_note | varchar(50) |  | 字符串 (String) |
| 6 | pwdlevelcode | 密码安全级别 | pwdlevelcode | varchar(50) |  | 密码级别 (pwdlevelcode) |
| 7 | pwdparam | 密码参数 | pwdparam | varchar(200) |  | 字符串 (String) |
| 8 | identityverifycode | 认证类型 | identityverifycode | varchar(50) |  | 认证类型 (indentityverifycode) |
| 9 | abledate | 生效日期 | abledate | char(19) | √ | 日期(开始) (UFDateBegin) |
| 10 | disabledate | 失效日期 | disabledate | char(19) |  | 日期(结束) (UFDateEnd) |
| 11 | islocked | 锁定 | islocked | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_base_doc | 身份 | pk_base_doc | varchar(20) |  | 字符串 (String) |
| 13 | pk_psndoc | 身份_人员信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | base_doc_type | 身份类型 | base_doc_type | int |  | 身份类型 (usertypeenum) |  | 0=员工; |