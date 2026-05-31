# |<<

**投资计划编制项目信息 (ipm_ip_plandrawup_b / nc.vo.ipmip.plandrawup.PlanDrawupBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3186.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plandrawup_b | 项目信息子表主键 | pk_plandrawup_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 项目单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 项目单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | projectsort | 项目分类 | projectsort | int |  | 项目分类 (ProjectSortEnum) |  | 1=上年转入项目; |