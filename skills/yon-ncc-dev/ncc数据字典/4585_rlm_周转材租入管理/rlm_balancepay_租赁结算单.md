# |<<

**租赁结算单 (rlm_balancepay / nc.vo.rlm.balancepay.BalancePayHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancepay | 租赁结算单主键 | pk_balancepay | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_fiorg | 财务组织最新版本 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fiorg_v | 财务组织 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 8 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 9 | bill_code | 租赁结算单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |