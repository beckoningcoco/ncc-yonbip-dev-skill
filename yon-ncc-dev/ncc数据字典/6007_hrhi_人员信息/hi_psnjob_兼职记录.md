# |<<

**兼职记录 (hi_psnjob / nc.vo.hi.psndoc.PartTimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnjob | 任职主键 | pk_psnjob | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 开始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织_业务单元_行政组织 (adminorg) |
| 6 | pk_psncl | 人员类别 | pk_psncl | varchar(20) | √ | 人员类别 (psncl) |
| 7 | pk_dept | 部门 | pk_dept | varchar(20) | √ | HR部门 (hrdept) |
| 8 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 9 | pk_postseries | 岗位序列 | pk_postseries | char(20) |  | 岗位序列 (postseries) |
| 10 | pk_job | 职务 | pk_job | varchar(20) |  | 职务 (om_job) |
| 11 | series | 职务类别 | series | varchar(20) |  | 职务类别 (jobtype) |
| 12 | pk_jobgrade | 职级 | pk_jobgrade | char(20) |  | 职级 (om_joblevel) |
| 13 | pk_jobrank | 职等 | pk_jobrank | char(20) |  | 职等 (jobrank) |
| 14 | jobmode | 任职方式 | jobmode | char(20) |  | 任职方式(自定义档案) (Defdoc-HRHI003_0xx) |
| 15 | deposemode | 免职方式 | deposemode | char(20) |  | 免职方式(自定义档案) (Defdoc-HRHI004_0xx) |
| 16 | pk_job_type | 任职类型 | pk_job_type | char(20) | √ | 任职类型(自定义档案) (Defdoc-HRHI012_0xx) |
| 17 | poststat | 在岗 | poststat | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | occupation | 职业 | occupation | char(20) |  | 职业(自定义档案) (Defdoc-HR016_0xx) |
| 19 | worktype | 工种 | worktype | char(20) |  | 工种(自定义档案) (Defdoc-BD004_0xx) |
| 20 | memo | 备注 | memo | varchar(1000) |  | 字符串 (String) |
| 21 | endflag | 结束 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | lastflag | 最新记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 24 | showorder | 人员顺序号 | showorder | int |  | 整数 (Integer) |
| 25 | pk_hrgroup | 所属集团 | pk_hrgroup | varchar(20) |  | 组织_集团 (group) |
| 26 | pk_hrorg | 人力资源组织 | pk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 27 | oribilltype | 来源单据类型 | oribilltype | char(20) |  | 主键 (UFID) |
| 28 | oribillpk | 来源单据主键 | oribillpk | char(20) |  | 主键 (UFID) |
| 29 | trial_flag | 试用 | trial_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | trial_type | 试用类型 | trial_type | int |  | 试用类型 (TrialType) |  | 1=入职试用; |