# |<<

**合同申请单 (hrcm_ctrtmng / nccloud.dto.hrcm.ctrtmng.CtrtMngVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2710.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctrtmng | 主键 | pk_ctrtmng | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 申请单编号 | bill_code | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 4 | business_type | 业务流程 | business_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 5 | transtype | 流程类型 | transtype | varchar(50) |  | 字符串 (String) |
| 6 | transtypeid | 流程类型主键 | transtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | billmaker | 申请人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | apply_date | 申请日期 | apply_date | char(10) |  | 模糊日期 (UFLiteralDate) |
| 9 | approve_state | 审批状态 | approve_state | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |