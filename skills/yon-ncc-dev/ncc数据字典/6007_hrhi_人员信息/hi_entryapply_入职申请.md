# |<<

**入职申请 (hi_entryapply / nc.vo.hi.entrymng.EntryapplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2542.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entryapply | 入职单主键 | pk_entryapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnjob | 入职人员 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 3 | pk_psndoc | 人员信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | bill_code | 申请单编码 | bill_code | varchar(28) | √ | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 7 | pk_hi_org | 人事组织 | pk_hi_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 字符串 (String) |
| 9 | transtypeid | 流程类型id | transtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | transtype | 流程类型 | transtype | varchar(20) |  | 字符串 (String) |
| 11 | approve_state | 审批状态 | approve_state | int |  | 单据状态 (billStateEnum) |  | -1=自由; |