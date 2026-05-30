# |<<

**排班_考勤_部门计划 (uh_sch_ta_dp / com.yonyou.yh.nhis.sch.ta.vo.SchTaDpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6271.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tadp | 考勤部门计划主键 | pk_tadp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 5 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | code | 考勤计划编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 考勤计划名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | pk_cal | 日历 | pk_cal | varchar(20) |  | 工作日历 (workcalendar) |
| 9 | dt_dateslottype | 班次类型(分组类型) | dt_dateslottype | varchar(50) |  | 字符串 (String) |
| 10 | pk_dateslottype | 班次类型 | pk_dateslottype | varchar(20) |  | 日期分组类型(自定义档案) (Defdoc-020005) |
| 11 | eu_recurtype | 周期类型 | eu_recurtype | int |  | 周期类型 (RecurTypeVO) |  | 0=星期; |