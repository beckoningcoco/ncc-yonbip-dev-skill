# |<<

**费用申请单明细 (er_mtapp_detail / nc.vo.erm.matterapp.MtAppDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_detail | 主键 | pk_mtapp_detail | char(20) | √ | 主键 (UFID) |
| 2 | assume_org | 费用承担单位 | assume_org | varchar(20) |  | 组织 (org) |
| 3 | assume_dept | 费用承担部门 | assume_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | pk_iobsclass | 收支项目 | pk_iobsclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 5 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 6 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 7 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 8 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 10 | pk_salesman | 业务员 | pk_salesman | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 12 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 13 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 14 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | reason | 事由 | reason | varchar(500) |  | 常用摘要 (summary) |
| 16 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 17 | orig_amount | 金额 | orig_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 19 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 20 | pk_tradetype | 交易类型 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 21 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 22 | close_status | 关闭状态 | close_status | int |  | 关闭状态 (closestatus) |  | 1=已关闭; |