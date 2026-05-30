# |<<

**押汇申请 (lcm_docuapply / nc.vo.lcm.docuapply.DocuApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | 申请单主键 | pk_apply | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | applycode | 申请单号 | applycode | varchar(255) |  | 字符串 (String) |
| 5 | applydate | 申请日期 | applydate | char(19) |  | 日期 (UFDate) |
| 6 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |