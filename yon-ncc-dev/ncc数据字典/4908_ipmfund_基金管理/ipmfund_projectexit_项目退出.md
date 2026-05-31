# |<<

**项目退出 (ipmfund_projectexit / nc.vo.ipmfund.projectexit.ProjectExitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3337.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectexit | 项目退出主键 | pk_projectexit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | fundlid_name | 基金名称 | fundlid_name | varchar(500) |  | 字符串 (String) |
| 8 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 9 | pk_projectlib | 项目名称 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 10 | investstage | 项目阶段 | investstage | varchar(20) |  | 投资项目阶段 (InvestStageVO) |
| 11 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 12 | norigmoneymny | 实际投资金额 | norigmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nbasemoneymny | 实际投资金额组织本币 | nbasemoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ngpmoneymny | 实际投资金额集团本币 | ngpmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nallmoneymny | 实际投资金额全局本币 | nallmoneymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | factualinvestrate | 实际占股比例 | factualinvestrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | exitstatus | 退出状态 | exitstatus | varchar(50) |  | 退出状态 (FundExitStatus) |  | 1=部分退出; |