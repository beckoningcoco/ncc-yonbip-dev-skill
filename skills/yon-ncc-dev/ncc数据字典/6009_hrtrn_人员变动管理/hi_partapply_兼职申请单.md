# |<<

**兼职申请单 (hi_partapply / nc.vo.trn.partmng.PartApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2550.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partmng | 主键 | pk_partmng | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 申请单编号 | bill_code | varchar(50) | √ | 字符串 (String) |
| 3 | pk_psnjob | 兼职人员 | pk_psnjob | varchar(20) | √ | 工作记录 (hi_psnjob) |
| 4 | effectdate | 生效日期 | effectdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 5 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织_业务单元_行政组织 (adminorg) |
| 6 | pk_dept | 部门 | pk_dept | varchar(20) | √ | HR部门 (hrdept) |
| 7 | pk_psncl | 人员类别 | pk_psncl | varchar(20) | √ | 人员类别 (psncl) |
| 8 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 9 | pk_postseries | 岗位序列 | pk_postseries | varchar(20) |  | 岗位序列 (postseries) |
| 10 | pk_job | 职务 | pk_job | varchar(20) |  | 职务 (om_job) |
| 11 | pk_jobtype | 职务类别 | pk_jobtype | varchar(20) |  | 职务类别 (jobtype) |
| 12 | pk_jobgrade | 职级 | pk_jobgrade | varchar(20) |  | 职级 (om_joblevel) |
| 13 | pk_jobrank | 职等 | pk_jobrank | varchar(20) |  | 职等 (jobrank) |
| 14 | pk_job_type | 任职类型 | pk_job_type | varchar(20) | √ | 任职类型(自定义档案) (Defdoc-HRHI012_0xx) |
| 15 | jobmode | 任职方式 | jobmode | varchar(20) |  | 任职方式(自定义档案) (Defdoc-HRHI003_0xx) |
| 16 | deposemode | 免职方式 | deposemode | varchar(20) |  | 免职方式(自定义档案) (Defdoc-HRHI004_0xx) |
| 17 | poststate | 在岗 | poststate | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | occupation | 职业 | occupation | varchar(20) |  | 职业(自定义档案) (Defdoc-HR016_0xx) |
| 19 | worktype | 工种 | worktype | varchar(20) |  | 工种(自定义档案) (Defdoc-BD004_0xx) |
| 20 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 21 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 22 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 23 | clerkcode | 员工编码 | clerkcode | varchar(50) |  | 字符串 (String) |
| 24 | pk_billtype | 交易 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 25 | transtypeid | 流程类型 | transtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | transtype | 流程类型code | transtype | varchar(50) |  | 字符串 (String) |
| 27 | business_type | 业务流程 | business_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 28 | billmaker | 申请人 | billmaker | varchar(20) |  | 用户 (user) |
| 29 | apply_date | 申请日期 | apply_date | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 30 | approve_state | 审批状态 | approve_state | int |  | 单据状态 (billStateEnum) |  | -1=自由; |