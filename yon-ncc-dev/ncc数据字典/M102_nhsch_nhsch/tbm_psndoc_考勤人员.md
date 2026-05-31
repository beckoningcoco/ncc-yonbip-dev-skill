# |<<

**考勤人员 (tbm_psndoc / com.yonyou.yh.nhis.sch.ta.vo.TbmPsndocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tbm_psndoc | 考勤档案主键 | pk_tbm_psndoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_psn | 人员信息 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 3 | pk_psnjob | 人员工作信息 | pk_psnjob | varchar(20) |  | 人员工作信息 (psnjob) |
| 4 | begindate | 考勤档案开始日期 | begindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | enddate | 考勤档案结束日期 | enddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | tbm_prop | 考勤方式 | tbm_prop | varchar(50) |  | 考勤方式 (TaStyleEnum) |  | 1=手工考勤; |