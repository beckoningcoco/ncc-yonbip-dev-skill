# |<<

**投资计划编制 (ipm_ip_plandrawup / nc.vo.ipmip.plandrawup.PlanDrawupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3185.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plandrawup | 投资计划编制主键 | pk_plandrawup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 编制人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 计划编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 计划名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 10 | vyear | 年度 | vyear | varchar(20) |  | 字符串 (String) |
| 11 | vquarter | 季度 | vquarter | varchar(50) |  | 季度 (ipmQuarter) |  | 1=一季度; |