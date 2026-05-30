# |<<

**调配/离职申请单 (hi_stapply / nc.vo.trn.transmng.StapplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hi_stapply | 调配申请主键 | pk_hi_stapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 交易 | pk_billtype | varchar(20) | √ | 字符串 (String) |
| 3 | transtypeid | 交易类型主键 | transtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | transtype | 交易类型 | transtype | varchar(50) |  | 字符串 (String) |
| 5 | business_type | 流程类型 | business_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | pk_psnjob | 调配人 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 7 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 8 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 9 | pk_psnorg | 人员组织关系 | pk_psnorg | char(20) |  | 主键 (UFID) |
| 10 | bill_code | 申请单编号 | bill_code | varchar(28) |  | 字符串 (String) |
| 11 | stapply_mode | 调配方式 | stapply_mode | int |  | 调配方式 (stapplymodeenum) |  | 1=组织内调配; |