# |<<

**库存流水 (ic_flow / nc.vo.ic.flowaccount.entity.FlowAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flow | 主键 | pk_flow | char(20) | √ | 主键 (UFID) |
| 2 | cbilltypecode | 库存单据类型编码 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | vtrantypecode | 出入库类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | cbiztype | 业务流程 | cbiztype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 7 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 8 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 13 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 14 | cwastewarehouseid | 废品库 | cwastewarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 15 | cothercalbodyoid | 其它库存组织 | cothercalbodyoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 16 | cothercalbodyvid | 其它库存组织版本 | cothercalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 17 | cotherwhid | 其它仓库 | cotherwhid | varchar(20) |  | 仓库 (stordoc) |
| 18 | cgeneralhid | 出库单表头 | cgeneralhid | varchar(20) |  | 主键 (UFID) |
| 19 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 20 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 21 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 22 | approver | 库房签字人 | approver | varchar(20) |  | 用户 (user) |
| 23 | taudittime | 签字时间 | taudittime | varchar(19) |  | 日期时间 (UFDateTime) |
| 24 | caccountid | 记账人 | caccountid | varchar(20) |  | 用户 (user) |
| 25 | taccounttime | 记账时间 | taccounttime | varchar(19) |  | 日期时间 (UFDateTime) |
| 26 | fbillflag | 单据状态 | fbillflag | int |  | 库存单据状态 (ICBillFlag) |  | 1=删除; |