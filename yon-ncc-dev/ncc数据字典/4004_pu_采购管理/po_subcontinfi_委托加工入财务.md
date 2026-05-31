# |<<

**委托加工入财务 (po_subcontinfi / nc.vo.pu.m4203.entity.SubcontinFIHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4638.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps | 委托加工入主键 | pk_stockps | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_corp | 公司最新版 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | pk_corp_v | 公司 | pk_corp_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 7 | cbilltypecode | 单据类型编码 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 8 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | vbillcode | 入库单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 11 | dbilldate | 入库日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 12 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 13 | pk_dept | 部门原始信息 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_dept_v | 部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_psndoc | 业务员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 18 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 19 | freplenishflag | 退货标志 | freplenishflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | bnormpur | 是否普通采购 | bnormpur | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 21 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 22 | approver | 签字人 | approver | varchar(20) |  | 用户 (user) |
| 23 | taudittime | 签字日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 24 | csendcountryid | 发货国家/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 25 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 26 | ctaxcountryid | 报税国家/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 27 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |