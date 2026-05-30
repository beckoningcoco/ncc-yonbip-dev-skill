# |<<

**事项清单上报 (scapto_matterlistreport / nc.vo.scapto.mattermanage.matterlistreport.MatterlistReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matterlistreport | 事项清单上报主键 | pk_matterlistreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 所属企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 事项清单编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 事项清单名称 | vbillname | varchar(512) |  | 字符串 (String) |
| 10 | version | 版本号 | version | varchar(50) |  | 字符串 (String) |
| 11 | taudittime | 审批时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | dvaliddate | 生效日期 | dvaliddate | char(19) |  | 日期 (UFDate) |
| 13 | dinvaliddate | 失效日期 | dinvaliddate | char(19) |  | 日期 (UFDate) |
| 14 | pk_enterprise | 所属集团企业 | pk_enterprise | varchar(20) |  | 企业信息管理 (EnterpriseVO) |
| 15 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 16 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 17 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 18 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 19 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 23 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 24 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |