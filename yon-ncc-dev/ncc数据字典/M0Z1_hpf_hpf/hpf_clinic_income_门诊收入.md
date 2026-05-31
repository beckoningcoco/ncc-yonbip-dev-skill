# |<<

**门诊收入 (hpf_clinic_income / nc.vo.hpf.ictf.clinic_income.ClinicIncomeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clinic_income | 门诊收入 | pk_clinic_income | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | dbilldate | 业务日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | dbusdate | 核算日期 | dbusdate | char(19) |  | 日期 (UFDate) |
| 8 | makebilltime | 核算时间 | makebilltime | char(19) |  | 日期 (UFDate) |
| 9 | pk_entryconfig | 数据来源 | pk_entryconfig | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 10 | bvoucher | 是否已生产凭证 | bvoucher | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vvoucherno | 凭证号 | vvoucherno | varchar(50) |  | 字符串 (String) |
| 12 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 13 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 14 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 15 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 16 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |