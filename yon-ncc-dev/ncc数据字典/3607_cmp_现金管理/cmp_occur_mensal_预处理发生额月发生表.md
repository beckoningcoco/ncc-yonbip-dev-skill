# |<<

**预处理发生额月发生表 (cmp_occur_mensal / nc.vocmp.cmp_occur_mensal.cmp_occur_mensal)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1566.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occur_mensal | 发生额月发生表主键 | pk_occur_mensal | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 3 | pk_group_currtype | 集团本位币 | pk_group_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | pk_global_currtype | 全局本位币 | pk_global_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | cyear | 年度 | cyear | varchar(50) |  | 字符串 (String) |
| 6 | cmonth | 月份 | cmonth | varchar(50) |  | 字符串 (String) |
| 7 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_account | 本方帐户 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | pk_notetype | 票据类型 | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 10 | gathering_num | 收入笔数 | gathering_num | int |  | 整数 (Integer) |
| 11 | pay_num | 支付笔数 | pay_num | int |  | 整数 (Integer) |
| 12 | fundformcode | 资金形态 | fundformcode | int |  | 整数 (Integer) |
| 13 | gathering | 收款原币发生 | gathering | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | gatheringlocal | 收款本币发生 | gatheringlocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | groupgatheringlocal | 集团收款本币发生 | groupgatheringlocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | globalgatheringlocal | 全局收款本币发生 | globalgatheringlocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | paylocal | 付款本币发生 | paylocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | grouppaylocal | 集团付款本币发生 | grouppaylocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | globalpaylocal | 全局付款本币发生 | globalpaylocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | pay | 付款原币发生 | pay | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 22 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 23 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 24 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 25 | pk_mngaccount | 管理账户 | pk_mngaccount | varchar(20) |  | 银行账户 (bankaccount) |
| 26 | pk_corp | 公司 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |