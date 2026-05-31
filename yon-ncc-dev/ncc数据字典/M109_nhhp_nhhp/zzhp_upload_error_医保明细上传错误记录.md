# |<<

**医保明细上传错误记录 (zzhp_upload_error / com.yonyou.yh.nhis.hp.zzhp.pub.vo.HpUploadErrorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_upload_err | 错误主键 | pk_upload_err | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_hppv | 医保就诊号 | code_hppv | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | HIS就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | code_pv | HIS就诊编码 | code_pv | varchar(50) |  | 字符串 (String) |
| 7 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 8 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 9 | cardcode | 医保卡号 | cardcode | varchar(50) |  | 字符串 (String) |
| 10 | uploadparam | 上传参数 | uploadparam | varchar(4000) |  | 字符串 (String) |
| 11 | errmsg | 错误信息 | errmsg | varchar(1024) |  | 字符串 (String) |
| 12 | pk_psn_oper | 操作人 | pk_psn_oper | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | psn_oper_name | 操作人姓名 | psn_oper_name | varchar(50) |  | 字符串 (String) |
| 14 | pk_cgsrv | 计费服务主键 | pk_cgsrv | char(20) |  | 字符串 (String) |
| 15 | date_err | 错误记录日期 | date_err | char(19) |  | 日期时间 (UFDateTime) |
| 16 | srvname | 服务名称 | srvname | varchar(256) |  | 字符串 (String) |
| 17 | his_srvcode | HIS服务编码 | his_srvcode | varchar(50) |  | 字符串 (String) |
| 18 | hp_srvcode | 医保中心编码 | hp_srvcode | varchar(50) |  | 字符串 (String) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |