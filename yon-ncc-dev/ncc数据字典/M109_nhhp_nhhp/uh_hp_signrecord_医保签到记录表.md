# |<<

**医保签到记录表 (uh_hp_signrecord / com.yonyou.yh.nhis.hp.zzhp.pub.vo.HPSignRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_signrecord | 主键 | pk_signrecord | char(20) | √ | 主键 (UFID) |
| 2 | cycle_num | 业务周期号 | cycle_num | varchar(50) |  | 字符串 (String) |
| 3 | pk_hp | 医保类型 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 4 | hpname | 医保名称 | hpname | varchar(50) |  | 字符串 (String) |
| 5 | hpcode | 医保编码 | hpcode | varchar(50) |  | 字符串 (String) |
| 6 | flag_signout | 是否签退 | flag_signout | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_signin_person | 签到人 | pk_signin_person | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | signin_person_name | 签到人名称 | signin_person_name | varchar(50) |  | 字符串 (String) |
| 9 | pk_signout_person | 签退人 | pk_signout_person | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | signout_person_name | 签退人名称 | signout_person_name | varchar(50) |  | 字符串 (String) |
| 11 | date_signin | 签到时间 | date_signin | char(19) |  | 日期时间 (UFDateTime) |
| 12 | date_signout | 签退时间 | date_signout | char(19) |  | 日期时间 (UFDateTime) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |