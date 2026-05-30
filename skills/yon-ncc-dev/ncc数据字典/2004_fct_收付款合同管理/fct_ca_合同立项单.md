# |<<

**合同立项单 (fct_ca / nc.vo.fct.approval.FctCaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2180.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ca | 立项主键 | pk_fct_ca | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | cano | 立项编码 | cano | varchar(50) |  | 字符串 (String) |
| 6 | caname | 立项名称 | caname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 9 | transtype | 交易类型 | transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 11 | oriamount | 立项原币金额 | oriamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | orgamount | 立项组织本币金额 | orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | groupamount | 立项集团本币金额 | groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | globalamount | 立项全局本币金额 | globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | depid | 承办部门 | depid | varchar(20) |  | 组织_部门 (dept) |
| 17 | depid_v | 承办部门版本 | depid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | personnelid | 承办人 | personnelid | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | applydept | 申请部门 | applydept | varchar(20) |  | 组织_部门 (dept) |
| 20 | applydept_v | 申请部门版本 | applydept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 21 | applicant | 申请人 | applicant | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | appendixnum | 附件数 | appendixnum | int |  | 整数 (Integer) |
| 23 | castate | 立项状态 | castate | int |  | 立项状态 (enum) |  | 0=自由; |