# |<<

**郑州省市门诊医保签到表 (uh_hp_signrecord_op / com.yonyou.yh.nhis.hp.zzhp.pub.vo.HPSignRecordOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_signrecord | 主键 | pk_signrecord | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 组织主键 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | cycle_num | 业务周期号 | cycle_num | varchar(50) |  | 字符串 (String) |
| 5 | pk_hp | 医保主键 | pk_hp | varchar(20) |  | 字符串 (String) |
| 6 | hpcode | 医保编码 | hpcode | varchar(50) |  | 字符串 (String) |
| 7 | flag_signout | 签退标识 | flag_signout | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_signin_person | 签到人主键 | pk_signin_person | varchar(20) |  | 字符串 (String) |
| 9 | signin_person_name | 签到人名称 | signin_person_name | varchar(50) |  | 字符串 (String) |
| 10 | pk_signout_person | 签退人编码 | pk_signout_person | varchar(20) |  | 字符串 (String) |
| 11 | signout_person_name | 签退人姓名 | signout_person_name | varchar(50) |  | 字符串 (String) |
| 12 | date_signin | 签到时间 | date_signin | char(19) |  | 字符串 (String) |
| 13 | date_signout | 签退时间 | date_signout | char(19) |  | 字符串 (String) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |