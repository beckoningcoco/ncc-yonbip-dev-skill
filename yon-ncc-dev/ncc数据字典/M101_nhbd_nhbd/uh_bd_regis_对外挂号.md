# |<<

**对外挂号 (uh_bd_regis / com.yonyou.yh.nhis.bd.tpi.regis.vo.RegistrationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_registration | 挂号主键 | pk_registration | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_dept | 所在科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_schres | 排班资源 | pk_schres | varchar(50) |  | 字符串 (String) |
| 6 | pk_schsrv | 排班服务 | pk_schsrv | varchar(50) |  | 字符串 (String) |
| 7 | pvdate | 就诊日期 | pvdate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | dateslot | 日期分组 | dateslot | char(1) |  | 字符串 (String) |
| 9 | pk_pati | 患者基本信息 | pk_pati | varchar(50) |  | 字符串 (String) |
| 10 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 11 | gender | 性别 | gender | varchar(3) |  | 字符串 (String) |
| 12 | birthday | 出生年月 | birthday | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | idnumber | 身份证号 | idnumber | varchar(50) |  | 字符串 (String) |
| 14 | hpcode | 医保编码 | hpcode | varchar(50) |  | 字符串 (String) |
| 15 | hpname | 医保名称 | hpname | varchar(50) |  | 字符串 (String) |
| 16 | pk_psn_oper | 操作员 | pk_psn_oper | varchar(20) |  | 用户 (user) |
| 17 | retinfo | 返回结果 | retinfo | varchar(100) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |