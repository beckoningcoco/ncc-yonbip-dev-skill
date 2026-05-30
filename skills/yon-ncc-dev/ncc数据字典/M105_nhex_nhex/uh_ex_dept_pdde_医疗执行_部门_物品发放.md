# |<<

**医疗执行_部门_物品发放 (uh_ex_dept_pdde / com.yonyou.yh.nhis.ex.pd.vo.DeptPDAppDeliVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdde | 部门物品发放主键 | pk_deptpdde | char(20) | √ | 主键 (UFID) |
| 2 | pk_deptpdde | 部门物品发放主键 | pk_deptpdde | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | eu_pddetype | 医疗物品发放类型 | eu_pddetype | varchar(20) |  | 医疗物品发放类型 (deptpddelienum) |  | 0001=病区患者发放; |