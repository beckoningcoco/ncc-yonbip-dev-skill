# |<<

**医保就诊登记 (zzhp_pv / com.yonyou.yh.nhis.hp.zz.vo.ZZHPPvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hppv | 医保就诊 | pk_hppv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pvtype | 就诊类别 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | code_pvtype | 就诊类别编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 6 | dt_hptype | 医保类别 | dt_hptype | varchar(20) |  | 医保计划 (healthplan) |
| 7 | pk_pv | HIS就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 8 | code_pv | 医保就诊编码 | code_pv | varchar(30) |  | 字符串 (String) |
| 9 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 10 | code_hp | 医保卡号 | code_hp | varchar(30) |  | 字符串 (String) |
| 11 | pvdate | 就诊日期 | pvdate | char(19) |  | 日期时间 (UFDateTime) |
| 12 | code_dept | 就诊科室 | code_dept | varchar(30) |  | 字符串 (String) |
| 13 | name_dept | 科室名称 | name_dept | varchar(50) |  | 字符串 (String) |
| 14 | code_psn | 接诊医生 | code_psn | varchar(30) |  | 字符串 (String) |
| 15 | name_psn | 医生姓名 | name_psn | varchar(50) |  | 字符串 (String) |
| 16 | pk_psn_opt | 操作人 | pk_psn_opt | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | name_psn_opt | 操作人姓名 | name_psn_opt | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |