# |<<

**患者就诊_医护人员 (uh_pv_psn / com.yonyou.yh.nhis.pv.pativisitpsn.vo.PatiVisitPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvpsn | 患者就诊医护人员主键 | pk_pvpsn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | pk_pvdept | 就诊科室 | pk_pvdept | varchar(50) |  | 字符串 (String) |
| 6 | pk_psn | 医护人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_psn | 医护人员名称 | name_psn | varchar(50) |  | 字符串 (String) |
| 8 | dt_role_pvpsn | 承担角色编码 | dt_role_pvpsn | varchar(50) |  | 字符串 (String) |
| 9 | date_begin | 开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 10 | date_end | 结束日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 11 | dt_patieva | 患者评价编码 | dt_patieva | varchar(50) |  | 字符串 (String) |
| 12 | name_patieva | 患者评价描述 | name_patieva | varchar(256) |  | 字符串 (String) |
| 13 | pk_patieva | 患者评价 | pk_patieva | varchar(20) |  | 字符串 (String) |
| 14 | pk_role_pvpsn | 医疗组医生承担角色 | pk_role_pvpsn | varchar(20) |  | 字符串 (String) |