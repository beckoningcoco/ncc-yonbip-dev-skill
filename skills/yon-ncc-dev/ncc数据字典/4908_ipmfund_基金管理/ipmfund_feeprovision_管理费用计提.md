# |<<

**管理费用计提 (ipmfund_feeprovision / nc.vo.ipmfund.feeprovision.FeeProvisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feeprovision | 管理费用计提主键 | pk_feeprovision | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金名称 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 8 | norigtargetpaymny | 基金规模 | norigtargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_manager_info | 基金管理人 | pk_manager_info | varchar(20) |  | 基金管理人 (FundManagerInfoVO) |
| 10 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 11 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |