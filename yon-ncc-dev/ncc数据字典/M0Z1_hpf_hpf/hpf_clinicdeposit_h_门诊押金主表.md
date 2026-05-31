# |<<

**门诊押金主表 (hpf_clinicdeposit_h / nc.vo.hpf.clinicdeposit.ClinicDepositHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clinicdeposit | 主键 | pk_clinicdeposit | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 3 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 4 | orgname | 单位名称 | orgname | varchar(50) |  | 字符串 (String) |
| 5 | incometype | 收入类型 | incometype | varchar(50) |  | 字符串 (String) |
| 6 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 7 | dbusdate | 核算日期 | dbusdate | char(19) |  | 日期 (UFDate) |
| 8 | makebilltime | 核算时间 | makebilltime | char(19) |  | 日期 (UFDate) |
| 9 | bvoucher | 是否已生成凭证 | bvoucher | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | vvoucherno | 凭证号 | vvoucherno | varchar(50) |  | 字符串 (String) |
| 11 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 12 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 14 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 17 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 18 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 19 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 20 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 21 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |