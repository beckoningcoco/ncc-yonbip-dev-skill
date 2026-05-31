# |<<

**患者就诊_床位 (uh_pv_bed / com.yonyou.yh.nhis.pv.pativisitbed.vo.PatiVisitBedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6215.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvbed | 患者就诊床位主键 | pk_pvbed | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | pk_bed | 床位 | pk_bed | varchar(20) |  | 床位 (bed) |
| 6 | date_begin | 时间日期_开始 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 7 | date_end | 时间日期_结束 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_dept | 床位所属病区 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_begin | 操作人员_开始 | pk_psn_begin | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_psn_end | 操作人员_结束 | pk_psn_end | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | name_psn_begin | 操作人员_开始名称 | name_psn_begin | varchar(50) |  | 字符串 (String) |
| 12 | name_psn_end | 操作人员_结束名称 | name_psn_end | varchar(50) |  | 字符串 (String) |
| 13 | flag_maj | 主床位标识 | flag_maj | char(2) |  | 布尔类型 (UFBoolean) |
| 14 | pk_pvdept | 患者就诊科室 | pk_pvdept | varchar(20) |  | 字符串 (String) |
| 15 | def1 | 自定义字段1 | def1 | varchar(50) |  | 字符串 (String) |