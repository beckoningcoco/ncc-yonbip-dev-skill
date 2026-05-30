# |<<

**人员委托关系 (hr_relation_psn / nc.vo.hr.managescope.HrRelationPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation_psn | 人员委托关系主键 | pk_relation_psn | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnjob | 工作记录主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 3 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 主键 (UFID) |
| 4 | assgid | 任职ID | assgid | int |  | 整数 (Integer) |
| 5 | pk_hrorg | 人力资源组织主键 | pk_hrorg | varchar(20) |  | 组织 (org) |
| 6 | ismainjob | 是否主职 | ismainjob | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | psndoc_busi | 人事业务 | psndoc_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | psndoc_builder | 人事业务关系生成者主键 | psndoc_builder | varchar(20) |  | 主键 (UFID) |
| 9 | psndoc_budtype | 人事业务关系生成者委托对象类型 | psndoc_budtype | varchar(50) |  | 字符串 (String) |
| 10 | psndoc_budprio | 人事业务关系生成者源对象类型优先级 | psndoc_budprio | int |  | 整数 (Integer) |
| 11 | psnpact_busi | 合同业务 | psnpact_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | psnpact_builder | 合同业务关系生成者主键 | psnpact_builder | varchar(20) |  | 主键 (UFID) |
| 13 | psnpact_budtype | 合同业务关系生成者委托对象类型 | psnpact_budtype | varchar(50) |  | 字符串 (String) |
| 14 | psnpact_budprio | 合同业务关系生成者源对象类型优先级 | psnpact_budprio | int |  | 整数 (Integer) |
| 15 | salary_busi | 薪资业务 | salary_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | salary_builder | 薪资业务关系生成者主键 | salary_builder | varchar(20) |  | 主键 (UFID) |
| 17 | salary_budtype | 薪资业务关系生成者委托对象类型 | salary_budtype | varchar(50) |  | 字符串 (String) |
| 18 | salary_budprio | 薪资业务关系生成者源对象类型优先级 | salary_budprio | int |  | 整数 (Integer) |
| 19 | timemng_busi | 时间管理业务 | timemng_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | timemng_builder | 时间管理业务关系生成者主键 | timemng_builder | varchar(20) |  | 主键 (UFID) |
| 21 | timemng_budtype | 时间管理业务关系生成者委托对象类型 | timemng_budtype | varchar(50) |  | 字符串 (String) |
| 22 | timemng_budprio | 时间管理业务关系生成者源对象类型优先级 | timemng_budprio | int |  | 整数 (Integer) |
| 23 | training_busi | 培训业务 | training_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | training_builder | 培训业务关系生成者主键 | training_builder | varchar(20) |  | 主键 (UFID) |
| 25 | training_budtype | 培训业务关系生成者委托对象类型 | training_budtype | varchar(50) |  | 字符串 (String) |
| 26 | training_budprio | 培训业务关系生成者源对象类型优先级 | training_budprio | int |  | 整数 (Integer) |
| 27 | psnpe_busi | 人员绩效业务 | psnpe_busi | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | psnpe_builder | 人员绩效业务关系生成者主键 | psnpe_builder | varchar(20) |  | 主键 (UFID) |
| 29 | psnpe_budtype | 人员绩效业务关系生成者委托对象类型 | psnpe_budtype | varchar(50) |  | 字符串 (String) |
| 30 | psnpe_budprio | 人员绩效业务关系生成者源对象类型优先级 | psnpe_budprio | int |  | 整数 (Integer) |
| 31 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 32 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 33 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 35 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |