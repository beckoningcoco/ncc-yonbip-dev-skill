# |<<

**报价单主实体 (so_salequotation / nc.vo.so.salequotation.entity.SalequotationHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_salequotation | 销售报价单主实体 | pk_salequotation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 销售组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 4 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | vbillcode | 报价单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | vtrantype | 报价单类型编码 | vtrantype | varchar(50) |  | 字符串 (String) |
| 7 | ctrantypeid | 报价单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | dquotedate | 报价日期 | dquotedate | char(19) |  | 日期 (UFDate) |
| 9 | denddate | 失效日期 | denddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 10 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 11 | pk_channeltype | 渠道类型 | pk_channeltype | varchar(20) |  | 渠道类型 (channeltype) |
| 12 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pk_dept_v | 部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | pk_dept | 部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_payterm | 收款协议 | pk_payterm | varchar(20) |  | 收款协议 (income) |
| 16 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 17 | ndiscount | 整单折扣(%) | ndiscount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 19 | csendtypeid | 运输方式 | csendtypeid | varchar(20) |  | 运输方式 (transporttype) |
| 20 | ntotalnum | 总数量 | ntotalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ntotalmny | 价税合计 | ntotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillStatusEnum) |  | 0=审批未通过; |