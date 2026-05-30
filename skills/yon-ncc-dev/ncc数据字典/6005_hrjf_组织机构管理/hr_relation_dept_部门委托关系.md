# |<<

**部门委托关系 (hr_relation_dept / nc.vo.hr.managescope.HrRelationDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation_dept | 部门委托关系主键 | pk_relation_dept | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_deptorg | 部门所属组织 | pk_deptorg | varchar(20) |  | 组织 (org) |
| 4 | pk_fatherdept | 部门上级部门 | pk_fatherdept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_hrorg | 人力资源组织组织主键 | pk_hrorg | varchar(20) |  | 主键 (UFID) |
| 6 | psndoc_busi | 人事业务 | psndoc_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | psndoc_builder | 人事业务关系生成者主键 | psndoc_builder | varchar(20) |  | 主键 (UFID) |
| 8 | psndoc_budtype | 人事业务关系生成者委托对象类型 | psndoc_budtype | varchar(50) |  | 字符串 (String) |
| 9 | psndoc_budsource | 人事业务关系生成者源对象主键 | psndoc_budsource | varchar(20) |  | 主键 (UFID) |
| 10 | psnpact_busi | 合同业务 | psnpact_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | psnpact_builder | 合同业务关系生成者主键 | psnpact_builder | varchar(20) |  | 主键 (UFID) |
| 12 | psnpact_budtype | 合同业务关系生成者委托对象类型 | psnpact_budtype | varchar(50) |  | 字符串 (String) |
| 13 | psnpact_budsource | 合同业务关系生成者源对象主键 | psnpact_budsource | varchar(20) |  | 主键 (UFID) |
| 14 | salary_busi | 薪资业务 | salary_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | salary_builder | 薪资业务关系生成者主键 | salary_builder | varchar(20) |  | 主键 (UFID) |
| 16 | salary_budtype | 薪资业务关系生成者委托对象类型 | salary_budtype | varchar(50) |  | 字符串 (String) |
| 17 | salary_budsource | 薪资业务关系生成者源对象主键 | salary_budsource | varchar(20) |  | 主键 (UFID) |
| 18 | timemng_busi | 时间管理业务 | timemng_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | timemng_builder | 时间管理业务关系生成者主键 | timemng_builder | varchar(20) |  | 主键 (UFID) |
| 20 | timemng_budtype | 时间管理业务关系生成者委托对象类型 | timemng_budtype | varchar(50) |  | 字符串 (String) |
| 21 | timemng_budsource | 时间管理业务关系生成者源对象主键 | timemng_budsource | varchar(20) |  | 主键 (UFID) |
| 22 | trainingbusi | 培训业务 | trainingbusi | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | training_builder | 培训业务关系生成者主键 | training_builder | varchar(20) |  | 主键 (UFID) |
| 24 | training_budtype | 培训业务关系生成者委托对象类型 | training_budtype | varchar(50) |  | 字符串 (String) |
| 25 | training_budsource | 培训业务关系生成者源对象主键 | training_budsource | varchar(20) |  | 主键 (UFID) |
| 26 | psnpe_busi | 人员绩效业务 | psnpe_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | psnpe_builder | 人员绩效业务关系生成者主键 | psnpe_builder | varchar(20) |  | 主键 (UFID) |
| 28 | psnpe_budtype | 人员绩效业务关系生成者委托对象类型 | psnpe_budtype | varchar(50) |  | 字符串 (String) |
| 29 | psnpe_budsource | 人员绩效业务关系生成者源对象主键 | psnpe_budsource | varchar(20) |  | 主键 (UFID) |
| 30 | orgpe_busi | 组织绩效业务 | orgpe_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | orgpe_builder | 组织绩效业务关系生成者主键 | orgpe_builder | varchar(20) |  | 主键 (UFID) |
| 32 | orgpe_budtype | 组织绩效业务关系生成者委托对象类型 | orgpe_budtype | varchar(50) |  | 字符串 (String) |
| 33 | orgpe_budsource | 组织绩效业务关系生成者源对象主键 | orgpe_budsource | varchar(20) |  | 主键 (UFID) |
| 34 | invite_busi | 招聘业务 | invite_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | invite_builder | 招聘业务关系生成者主键 | invite_builder | varchar(20) |  | 主键 (UFID) |
| 36 | invite_budtype | 招聘业务关系生成者委托对象类型 | invite_budtype | varchar(50) |  | 字符串 (String) |
| 37 | invite_budsource | 招聘业务关系生成者源对象主键 | invite_budsource | varchar(20) |  | 主键 (UFID) |
| 38 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 39 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 40 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 41 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 42 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |