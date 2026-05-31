# |<<

**投资项目交付单 (ipm_ip_projdeliver / nc.vo.ipmip.projdeliver.ProjDeliverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projdeliver | 投资项目交付单主键 | pk_projdeliver | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | dbilldate | 经办日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | vbillcode | 交付编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | vbillname | 交付名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 11 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 12 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 13 | projectname | 项目名称 | projectname | varchar(800) |  | 字符串 (String) |
| 14 | norigplanmny | 计划投资金额 | norigplanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbaseplanmny | 计划投资金额组织本币 | nbaseplanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ngpplanmny | 计划投资金额集团本币 | ngpplanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nallplanmny | 计划投资金额全局本币 | nallplanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | norigplanthousmny | 计划投资额万元 | norigplanthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nbaseplanthousmny | 计划投资额万元组织本币 | nbaseplanthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ngpplanthousmny | 计划投资额万元集团本币 | ngpplanthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nallplanthousmny | 计划投资额万元全局本币 | nallplanthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | norigrealmny | 实际投资金额 | norigrealmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nbaserealmny | 实际投资金额组织本币 | nbaserealmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ngprealmny | 实际投资金额集团本币 | ngprealmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nallrealmny | 实际投资金额全局本币 | nallrealmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | norigrealthousmny | 实际投资金额万元 | norigrealthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nbaserealthousmny | 实际投资金额万元组织本币 | nbaserealthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ngprealthousmny | 实际投资金额万元集团 | ngprealthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nallrealthousmny | 实际投资金额万元全局 | nallrealthousmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigdeliversummny | 交付物价值合计 | norigdeliversummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nbasedeliversummny | 交付物价值合计组织本币 | nbasedeliversummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | ngpdeliversummny | 交付物价值合计集团本币 | ngpdeliversummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nalldeliversummny | 交付物价值合计全局本币 | nalldeliversummny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 35 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 36 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 37 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 38 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 42 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 43 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |