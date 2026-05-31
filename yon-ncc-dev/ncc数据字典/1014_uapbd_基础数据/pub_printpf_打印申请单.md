# |<<

**打印申请单 (pub_printpf / nc.vo.uapbd.printpf.PrintCtrlPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4760.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_print_pf | 打印申请单主键 | pk_print_pf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 申请集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | proposer | 申请人 | proposer | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | proposetime | 申请时间 | proposetime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | proposedept | 申请部门 | proposedept | varchar(20) |  | 组织_部门 (dept) |
| 9 | billstatus | 申请状态 | billstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |