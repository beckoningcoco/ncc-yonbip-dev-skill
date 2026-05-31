# |<<

**核算维度调整单 (ia_adjcalcrange / nc.vo.ia.invalmethod.entity.calcrange.AdjCalcRangeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 核算维度调整单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | caccountperiod | 调整生效期间 | caccountperiod | varchar(7) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | operator | 制单人 | operator | varchar(20) |  | 用户 (user) |
| 12 | tdmakedate | 制单日期 | tdmakedate | char(19) |  | 日期 (UFDate) |
| 13 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 14 | taudittime | 审核时间 | taudittime | char(19) |  | 日期 (UFDate) |
| 15 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 16 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (Fstatusflag) |  | 1=自由; |