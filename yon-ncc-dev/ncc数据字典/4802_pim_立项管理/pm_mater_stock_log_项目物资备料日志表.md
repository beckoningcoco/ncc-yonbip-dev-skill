# |<<

**项目物资备料日志表 (pm_mater_stock_log / nc.vo.pbm.materialstocklog.MaterialStockLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mater_stock_log | 主键 | pk_mater_stock_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_mater_stock | 备料主键 | pk_mater_stock | varchar(20) |  | 字符串 (String) |
| 3 | src_pk_bill | 回写单据ID | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 4 | src_pk_bill_b | 回写单据行ID | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 5 | src_bill_type | 回写单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 6 | src_transi_type | 回写单据交易类型 | src_transi_type | varchar(20) |  | 字符串 (String) |
| 7 | src_pk_transitype | 回写单据交易类型主键 | src_pk_transitype | varchar(20) |  | 字符串 (String) |
| 8 | pk_project | 项目 | pk_project | varchar(20) |  | 字符串 (String) |
| 9 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 字符串 (String) |
| 10 | pk_material | 物料 | pk_material | varchar(20) |  | 字符串 (String) |
| 11 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 字符串 (String) |
| 12 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | dbusidate | 业务日期 | dbusidate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | unit_pirce | 单价 | unit_pirce | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | apply_adv_num | 物资申请预占量 | apply_adv_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | advance_num | 预占量 | advance_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | advance_price | 预占金额 | advance_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | execute_price | 执行金额 | execute_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | account_element | 核算要素 | account_element | varchar(20) |  | 字符串 (String) |
| 20 | pk_budget_wbs | 预算WBS | pk_budget_wbs | varchar(20) |  | 字符串 (String) |
| 21 | ori_pk_bill | 来源单据ID | ori_pk_bill | varchar(20) |  | 字符串 (String) |
| 22 | ori_pk_bill_b | 来源单据行ID | ori_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 23 | pk_current | 币种 | pk_current | varchar(20) |  | 字符串 (String) |
| 24 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 字符串 (String) |
| 25 | pk_storage | 仓库 | pk_storage | varchar(20) |  | 字符串 (String) |
| 26 | bill_code | 单据号 | bill_code | varchar(20) |  | 字符串 (String) |
| 27 | pk_org | 项目组织 | pk_org | varchar(20) |  | 字符串 (String) |