# |<<

**排班预约_计划 (uh_sch_plan / com.yonyou.yh.nhis.sch.plan.vo.SchPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schplan | 计划主键 | pk_schplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 5 | code_plan | 计划编码 | code_plan | varchar(30) |  | 字符串 (String) |
| 6 | name_plan | 计划名称 | name_plan | varchar(50) |  | 多语文本 (MultiLangText) |
| 7 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_res | 排班资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 9 | pk_schsrv | 排班服务 | pk_schsrv | varchar(20) |  | 排班服务 (UhSchSrvVO) |
| 10 | eu_recurtype | 周期类型 | eu_recurtype | int |  | 周期类型 (RecurTypeEnum) |  | 0=星期; |