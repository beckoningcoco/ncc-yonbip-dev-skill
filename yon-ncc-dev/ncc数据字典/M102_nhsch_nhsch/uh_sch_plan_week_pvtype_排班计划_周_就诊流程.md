# |<<

**排班计划_周_就诊流程 (uh_sch_plan_week_pvtype / com.yonyou.yh.nhis.sch.plan.vo.PlanPvTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6264.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planpvtype | 预约就诊类型计划主键 | pk_planpvtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_planweek | 周模板 | pk_planweek | varchar(20) |  | 排班预约_计划_周模板 (SchPlanWeekVO) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | count_pvtype | 数量_可预约 | count_pvtype | int |  | 整数 (Integer) |
| 7 | ticketsrules | 号表生成规则串 | ticketsrules | varchar(50) |  | 字符串 (String) |