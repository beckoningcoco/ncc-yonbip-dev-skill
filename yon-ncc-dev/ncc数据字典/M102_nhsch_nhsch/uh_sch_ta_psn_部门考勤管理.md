# |<<

**部门考勤管理 (uh_sch_ta_psn / com.yonyou.yh.nhis.sch.ta.vo.SchTaPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tapsn | 人员考勤表排班主键 | pk_tapsn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_tadp | 考勤部门计划 | pk_tadp | varchar(20) |  | 排班_考勤_部门计划 (SchTaDpVO) |
| 5 | date_ta_end | 考勤排班结束日期 | date_ta_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | pk_psn_create | 制单人 | pk_psn_create | char(20) |  | 主键 (UFID) |
| 7 | date_create | 制单日期 | date_create | char(19) |  | 日期 (UFDate) |
| 8 | flag_chk | 复核标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_psn_chk | 复核人 | pk_psn_chk | char(20) |  | 主键 (UFID) |
| 10 | date_chk | 复核日期 | date_chk | char(19) |  | 日期 (UFDate) |
| 11 | eu_status | 状态 | eu_status | int |  | 状态 (enum) |  | 0=未提交; |