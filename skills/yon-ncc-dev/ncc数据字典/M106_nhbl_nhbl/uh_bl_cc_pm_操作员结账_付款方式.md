# |<<

**操作员结账_付款方式 (uh_bl_cc_pm / com.yonyou.yh.nhis.bl.cc.vo.BLCCPayModeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccpm | 操作员结账付款方式信息主键 | pk_ccpm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_paymode | 付款方式 | pk_paymode | varchar(20) |  | 付款方式(自定义档案) (Defdoc-110100) |
| 5 | dt_paymode | 付款方式编码 | dt_paymode | char(20) |  | 字符串 (String) |
| 6 | dt_paytype | 付款类型编码 | dt_paytype | varchar(50) |  | 字符串 (String) |
| 7 | amount | 收款收款金额 | amount | decimal(14, 2) |  | 数值 (UFDouble) |
| 8 | amt_return | 退款总金额 | amt_return | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | pmcn | 交易笔数 | pmcn | int |  | 整数 (Integer) |
| 10 | pk_blcc | 操作员结账 | pk_blcc | varchar(20) |  | 操作员结账 (BLCashierCloseVO) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |