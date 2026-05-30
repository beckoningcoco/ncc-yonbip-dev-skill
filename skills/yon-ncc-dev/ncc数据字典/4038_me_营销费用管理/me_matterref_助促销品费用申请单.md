# |<<

**助促销品费用申请单 (me_matterref / nc.vo.me.matterapp.entity.MatterAppRef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3615.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_bill | 助促销品费用申请单 | pk_mtapp_bill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | billno | 申请单单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | cmatterappid | 费用申请单 | cmatterappid | varchar(50) |  | 字符串 (String) |
| 6 | billdate | 申请单单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 7 | pk_tradetype | 申请单交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billmaker | 申请人 | billmaker | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | billstatus | 单据状态 | billstatus | int |  | 整数 (Integer) |
| 11 | apprstatus | 审批状态 | apprstatus | varchar(50) |  | 字符串 (String) |
| 12 | approver | 审批人 | approver | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | approvetime | 审批时间 | approvetime | char(19) |  | 日期 (UFDate) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | orig_amount | 金额 | orig_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | exe_amount | 执行数 | exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | rest_amount | 余额 | rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | reason | 事由 | reason | varchar(200) |  | 字符串 (String) |
| 19 | apply_dept | 申请部门 | apply_dept | varchar(20) |  | 组织_部门 (dept) |