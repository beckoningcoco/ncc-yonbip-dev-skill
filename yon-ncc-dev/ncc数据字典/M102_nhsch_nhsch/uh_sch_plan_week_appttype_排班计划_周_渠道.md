# |<<

**排班计划_周_渠道 (uh_sch_plan_week_appttype / com.yonyou.yh.nhis.sch.plan.vo.SchPlanWeekApptTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planappttype | 预约渠道计划主键 | pk_planappttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_planweek | 排班计划周 | pk_planweek | varchar(20) |  | 排班预约_计划_周模板 (SchPlanWeekVO) |
| 5 | pk_appttype | 预约渠道 | pk_appttype | varchar(20) |  | 预约渠道维护 (AppttypeVO) |
| 6 | pk_planweekpool | 对应的计划号源池 | pk_planweekpool | varchar(20) |  | 排班预约_计划_周_号源池 (SchPlanWeekPoolVO) |
| 7 | ticketnos | 可使用的票串号 | ticketnos | varchar(4000) |  | 字符串 (String) |
| 8 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 28 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 29 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 30 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 31 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |